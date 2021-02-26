package com.lxjn.hgd.config;

import lombok.extern.slf4j.Slf4j;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.context.annotation.Configuration;
import org.springframework.web.servlet.config.annotation.InterceptorRegistry;
import org.springframework.web.servlet.config.annotation.ResourceHandlerRegistry;
import org.springframework.web.servlet.config.annotation.WebMvcConfigurationSupport;
import org.springframework.web.servlet.config.annotation.WebMvcConfigurer;

/**
 * 继承 WebMvcConfigurationSupport 或实现 WebMvcConfigurer 接口
 * web拦截器配置类,可以实现以下功能配置
 * addInterceptors：拦截器
 * addViewControllers：页面跳转
 * addResourceHandlers：静态资源
 * configureDefaultServletHandling：默认静态资源处理器
 * configureViewResolvers：视图解析器
 * configureContentNegotiation：配置内容裁决的一些参数
 * addCorsMappings：跨域
 * configureMessageConverters：信息转换器
 */
@Slf4j
@Configuration
public class WebConfigurer extends WebMvcConfigurationSupport {
    @Value(value = "${my.uploadpath}")
    private String m_uploadPath; // 文件上传的物理路径

    @Value(value = "${my.uploadurl}")
    private String m_uploadUrl; // 文件访问的url路径

    @Autowired
    GlobalInterceptor globalInterceptor;

    @Override
    public void addInterceptors(InterceptorRegistry registry){
        log.info("正在加载请求拦截器...");
        registry.addInterceptor(globalInterceptor).addPathPatterns("/**");
        super.addInterceptors(registry);
    }




    /**
     * 静态资源配置类
     * 等同于配置文件中的
     * spring.resources.static-locations=classpath:/static/
     * 与
     * spring.mvc.static-path-pattern=/**
     * 即将classpath目录下的static文件夹路径映射到 /* URL访问路径
     */
    @Override
    public void addResourceHandlers(ResourceHandlerRegistry registry) {
        log.info("加载静态资源拦截器...");
        String os = System.getProperty("os.name");
        // 判断文件路径写法是否与操作系统相符
        if ((os.toLowerCase().startsWith("win")&&!m_uploadPath.startsWith("/")) ||
                (os.toLowerCase().startsWith("linux")&&m_uploadPath.startsWith("/")) ){

            registry.addResourceHandler("/**").addResourceLocations("classpath:/static/");
            // 解决swagger无法访问
            registry.addResourceHandler("/swagger-ui.html").addResourceLocations("classpath:/META-INF/resources/");
            // 解决swagger的js文件无法访问
            registry.addResourceHandler("/webjars/**").addResourceLocations("classpath:/META-INF/resources/webjars/");

            registry.addResourceHandler("/static/**").addResourceLocations("classpath:/static/");

            registry.addResourceHandler(m_uploadUrl).addResourceLocations("file:"+m_uploadPath);

            super.addResourceHandlers(registry);
        }else {
            log.warn("操作系统类型与自定义静态资源上传路径格式不符，自定义静态文件映射失效！");
        }

    }
}
