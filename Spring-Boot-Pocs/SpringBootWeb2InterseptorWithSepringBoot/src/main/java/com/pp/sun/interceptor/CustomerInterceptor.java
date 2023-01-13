package com.pp.sun.interceptor;

import lombok.extern.slf4j.Slf4j;
import org.springframework.stereotype.Component;
import org.springframework.web.servlet.HandlerInterceptor;
import org.springframework.web.servlet.ModelAndView;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

@Component
@Slf4j
public class CustomerInterceptor implements HandlerInterceptor {
    @Override
    public boolean preHandle(HttpServletRequest request, HttpServletResponse response, Object handler) throws Exception {
        log.info("preHandle involved .... {},{},{}",this.getClass() ,request.getRequestURI(),request.getMethod());
        return true ;
    }

    @Override
    public void postHandle(HttpServletRequest request, HttpServletResponse response, Object handler, ModelAndView modelAndView) throws Exception {
        log.info("postHandle involved ....{},{},{}",this.getClass() ,request.getRequestURI(),request.getMethod());
    }

    @Override
    public void afterCompletion(HttpServletRequest request, HttpServletResponse response, Object handler, Exception ex) throws Exception {
        log.info("afterCompletion involved .... {},{},{}",this.getClass() ,request.getRequestURI(),request.getMethod());
        if (ex!=null)
            log.info("exception  involved .... {},{},{}",this.getClass() ,ex.getCause(),ex.getMessage());

    }
}
