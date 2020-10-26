package com.lxjn.hgd.config;

import org.springframework.beans.factory.annotation.Value;
import org.springframework.web.servlet.config.annotation.ResourceHandlerRegistry;
import org.springframework.web.servlet.config.annotation.WebMvcConfigurationSupport;

/**
 * 静态资源配置类
 * 等同于配置文件中的
 * spring.resources.static-locations=classpath:/static/
 * 与
 * spring.mvc.static-path-pattern=/**
 * 即将classpath目录下的static文件夹路径映射到 /* URL访问路径
 *
 */
public class ServletContextConfig extends WebMvcConfigurationSupport {
    @Value(value = "${my.uploadpath}")
    private String m_uploadPath; // 文件上传的物理路径
    @Value(value = "${my.uploadurl}")
    private String m_uploadUrl; // 文件访问的url路径

    @Override
    protected void addResourceHandlers(ResourceHandlerRegistry registry) {
        registry.addResourceHandler("/**").addResourceLocations("/static/");

        // upload path:
        String uploadPath = "file:" + m_uploadPath + "/";
        String uploadUrl = m_uploadUrl + "/**";

        registry.addResourceHandler(uploadUrl).addResourceLocations(uploadPath);

        super.addResourceHandlers(registry);
    }

}
