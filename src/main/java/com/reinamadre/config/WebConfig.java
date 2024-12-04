package com.reinamadre.config;

import org.springframework.context.annotation.Configuration;
import org.springframework.web.servlet.config.annotation.CorsRegistry;
import org.springframework.web.servlet.config.annotation.WebMvcConfigurer;

@Configuration
public class WebConfig implements WebMvcConfigurer {

    @Override
    public void addCorsMappings(CorsRegistry registry) {
        registry.addMapping("/**")
            .allowedOrigins("http://localhost:8081") //direccion del front (origen)
            .allowedMethods("GET", "POST") // Permite solo los métodos que necesites
            .allowedHeaders("*")
            .allowCredentials(true); // Permite enviar cookies si es necesario
    }
}
