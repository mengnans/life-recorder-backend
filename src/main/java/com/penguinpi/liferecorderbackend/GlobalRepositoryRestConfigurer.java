package com.penguinpi.liferecorderbackend;

import org.springframework.context.annotation.Configuration;
import org.springframework.data.rest.core.config.RepositoryRestConfiguration;
import org.springframework.data.rest.webmvc.config.RepositoryRestConfigurerAdapter;

/**
 * @author Mengnan Shi
 * @create 2018-03-23-09:59
 */

@Configuration
public class GlobalRepositoryRestConfigurer extends RepositoryRestConfigurerAdapter {

    private static final String CORS_BASE_PATTERN = "/api/**";
    private static final String ALLOWED_ORIGINS = "http://localhost:8081";
    private static final String ALLOWED_HEADERS = "Origin, Accept, X-Requested-With, Content-Type, Access-Control-Allow-Origin, Access-Control-Request-Headers";
    private static final String ALLOWED_METHODS = "GET, POST, DELETE, PUT, PATCH, HEAD, OPTIONS";

    @Override
    public void configureRepositoryRestConfiguration(RepositoryRestConfiguration config) {
        config.getCorsRegistry()
                .addMapping(CORS_BASE_PATTERN)
                .allowedOrigins(ALLOWED_ORIGINS)
                .allowedMethods("GET","POST")
                .allowedHeaders("Access-Control-Allow-Origin");
    }

}