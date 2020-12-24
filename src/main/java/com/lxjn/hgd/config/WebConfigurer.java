package com.lxjn.hgd.config;

import org.springframework.beans.factory.annotation.Value;
import org.springframework.web.servlet.config.annotation.ResourceHandlerRegistry;
import org.springframework.web.servlet.config.annotation.WebMvcConfigurer;

/**
 * web配置类,可以实现以下功能配置
 * addInterceptors：拦截器
 * addViewControllers：页面跳转
 * addResourceHandlers：静态资源
 * configureDefaultServletHandling：默认静态资源处理器
 * configureViewResolvers：视图解析器
 * configureContentNegotiation：配置内容裁决的一些参数
 * addCorsMappings：跨域
 * configureMessageConverters：信息转换器
 */
public class WebConfigurer implements WebMvcConfigurer {
    @Value(value = "${my.uploadpath}")
    private String m_uploadPath; // 文件上传的物理路径

    @Value(value = "${my.uploadurl}")
    private String m_uploadUrl; // 文件访问的url路径

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
//        registry.addResourceHandler("/**").addResourceLocations("/static/");
//
//        // upload path:
//        String uploadPath = "file:" + m_uploadPath + "/";
//        String uploadUrl = m_uploadUrl + "/**";
//
//        registry.addResourceHandler(uploadUrl).addResourceLocations(uploadPath);
//
//        super.addResourceHandlers(registry);
    }
}
