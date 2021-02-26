package com.lxjn.hgd.config;

import lombok.extern.slf4j.Slf4j;
import org.springframework.stereotype.Component;
import org.springframework.web.servlet.HandlerInterceptor;
import org.springframework.web.servlet.ModelAndView;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import java.util.Enumeration;

/**
 * 通用请求拦截器
 */
@Slf4j
@Component
public class GlobalInterceptor implements HandlerInterceptor {

    /**
     * 在目标方法执行前执行
     * @param request
     * @param response
     * @param handler
     * @return
     * @throws Exception
     */
    @Override
    public boolean preHandle(HttpServletRequest request, HttpServletResponse response, Object handler) throws Exception {
        log.info("请求预处理...");
        return true;
    }

    /**
     * 在目标方法执行后执行，但在请求返回前，我们仍然可以对 ModelAndView进行修改
     * @param request
     * @param response
     * @param handler
     * @param modelAndView
     * @throws Exception
     */
    @Override
    public void postHandle(HttpServletRequest request, HttpServletResponse response, Object handler, ModelAndView modelAndView) throws Exception {
        Enumeration<String> headerNames = request.getHeaderNames();
        String language = request.getLocale().getLanguage();
        log.info("请求后处理...");
    }

    /**
     * 在请求已经返回之后执行
     * @param request
     * @param response
     * @param handler
     * @param ex
     * @throws Exception
     */
    @Override
    public void afterCompletion(HttpServletRequest request, HttpServletResponse response, Object handler, Exception ex) throws Exception {
        log.info("请求结果返回后处理...");
    }
}

