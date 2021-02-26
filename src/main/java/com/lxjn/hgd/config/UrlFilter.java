package com.lxjn.hgd.config;

import lombok.extern.slf4j.Slf4j;
import org.springframework.boot.web.servlet.FilterRegistrationBean;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.core.annotation.Order;

import javax.servlet.*;
import javax.servlet.annotation.WebFilter;
import java.io.IOException;

/**
 * 过滤器配置
 * 功能与拦截器差不多
 * 可以通过使用@webFilter注解或@Bean注解实现
 */
@Slf4j
@Order(1) // 当存在多个过滤器时，指定执行顺序
@WebFilter(filterName = "urlFilter",urlPatterns = "/*",description="默认过滤器,对所有/开头的请求有效")
public class UrlFilter implements Filter {

    /**
     * 初始化过滤器
     * @param filterConfig
     * @throws ServletException
     */
    @Override
    public void init(FilterConfig filterConfig) throws ServletException {
        log.info("过滤器初始化...");
    }

    @Override
    public void doFilter(ServletRequest servletRequest, ServletResponse servletResponse, FilterChain filterChain) {
        log.info("过滤器业务执行中...");
        try {
            /**
             * 在过滤器中对所有的请求进行验证
             * 是否允许站外访问
             * 是否允许未登录的访问
             * 最后进行权限判断
             */

            // 执行下一个过滤器
            filterChain.doFilter(servletRequest,servletResponse);
        } catch (IOException ioException) {
            ioException.printStackTrace();
        } catch (ServletException e) {
            e.printStackTrace();
        }
    }

    @Override
    public void destroy() {
        log.info("销毁过滤器...");
    }
}