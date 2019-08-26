package com.js.ctc.qualify.config;

import org.springframework.context.annotation.Configuration;
import org.springframework.web.servlet.config.annotation.ResourceHandlerRegistry;
import org.springframework.web.servlet.config.annotation.WebMvcConfigurationSupport;

/**
 * @ClassName WebMvcConfig
 * @Description TODO
 * @Author NingKang
 * @Date 2019/8/26 14:16
 * @Version 1.0
 **/
@Configuration
public class WebMvcConfig extends WebMvcConfigurationSupport {


    /**
     * @Author NingKang
     * @Description 静态资源过滤
     * @Date 2019/8/26 14:16
     * @Param  [registry]
     * @return
     **/
    @Override
    public void addResourceHandlers(ResourceHandlerRegistry registry) {
        registry.addResourceHandler("/static/**").addResourceLocations("classpath:/static/");

        registry.addResourceHandler("swagger-ui.html")
                .addResourceLocations("classpath:/META-INF/resources/");

        registry.addResourceHandler("/webjars/**")
                .addResourceLocations("classpath:/META-INF/resources/webjars/");

    }
}