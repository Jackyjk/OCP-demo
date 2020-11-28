package com.isoftstone.demo.common.configure;

import org.springframework.context.annotation.Configuration;
import org.springframework.web.servlet.config.annotation.ResourceHandlerRegistry;
import org.springframework.web.servlet.config.annotation.WebMvcConfigurer;
import org.springframework.web.servlet.config.annotation.WebMvcConfigurerAdapter;

@Configuration
public class MyWebMvcConfigurerAdapter implements WebMvcConfigurer {

    @Override
    public void addResourceHandlers(ResourceHandlerRegistry registry) {
        //为指定url路径映射真实资源路径
        registry.addResourceHandler("/templates/**").addResourceLocations("classpath:/templates/");
        registry.addResourceHandler("/**").addResourceLocations("classpath:/");
        registry.addResourceHandler("/upload/**").addResourceLocations("file:D:/upload/");
    }
}
