package com.pp.sun.config;

import com.pp.sun.interceptor.CustomerInterceptor;
import com.pp.sun.interceptor.GernarlInterceptor;
import com.pp.sun.interceptor.OrderInterceptor;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.context.annotation.Configuration;
import org.springframework.web.servlet.config.annotation.InterceptorRegistry;
import org.springframework.web.servlet.config.annotation.WebMvcConfigurer;

@Configuration
public class InterseptorConfig implements WebMvcConfigurer {

    @Autowired
    private GernarlInterceptor gernarlInterceptor;
    @Autowired
    private CustomerInterceptor customerInterceptor;
    @Autowired
    private OrderInterceptor orderInterceptor;

    @Override

    public void addInterceptors(InterceptorRegistry registry) {
//        registry.addInterceptor(gernarlInterceptor).order(3);
        registry.addInterceptor(customerInterceptor).addPathPatterns("/customer/**");
        registry.addInterceptor(orderInterceptor).addPathPatterns("/order/**");
    }
}
