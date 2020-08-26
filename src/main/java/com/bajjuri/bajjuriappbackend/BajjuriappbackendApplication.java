package com.bajjuri.bajjuriappbackend;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.boot.context.properties.EnableConfigurationProperties;
import org.springframework.cache.annotation.EnableCaching;
import org.springframework.context.annotation.Configuration;
import org.springframework.web.servlet.config.annotation.ResourceHandlerRegistry;
import org.springframework.web.servlet.config.annotation.WebMvcConfigurer;

@SpringBootApplication
@EnableConfigurationProperties(GithubProperties.class)
@EnableCaching
public class BajjuriappbackendApplication {

    public static void main(String[] args) {
        SpringApplication.run(BajjuriappbackendApplication.class, args);
    }

/*    @Configuration
    public class WebConfiguration implements WebMvcConfigurer {

        @Override
        public void addResourceHandlers(ResourceHandlerRegistry registry) {
            registry.addResourceHandler("/webjars/**")
                    .addResourceLocations("/webjars/")
                    .resourceChain(false);
            registry.setOrder(1);
        }

    }*/
}
