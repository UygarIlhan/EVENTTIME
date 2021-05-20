package com.example.EVENTTIME.config;

import org.springframework.context.annotation.Configuration;
import org.springframework.web.servlet.config.annotation.ViewControllerRegistry;
import org.springframework.web.servlet.config.annotation.WebMvcConfigurer;

@Configuration
public class MvcConfig implements WebMvcConfigurer {

    public void addViewControllers(ViewControllerRegistry registry){
        registry.addViewController(Endpoints.HOME).setViewName(ViewNames.HOME);
        registry.addViewController(Endpoints.ARTISTS).setViewName(ViewNames.ARTISTS);
        registry.addViewController(Endpoints.GENRES).setViewName(ViewNames.GENRES);
        registry.addViewController(Endpoints.FAQ).setViewName(ViewNames.FAQ);

    }


}
