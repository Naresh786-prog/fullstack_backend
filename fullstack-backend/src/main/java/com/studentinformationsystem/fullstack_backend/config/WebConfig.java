//package com.studentinformationsystem.fullstack_backend.config;
//
//import org.springframework.context.annotation.Bean;
//import org.springframework.context.annotation.Configuration;
//import org.springframework.web.servlet.config.annotation.CorsRegistry;
//import org.springframework.web.servlet.config.annotation.WebMvcConfigurer;
//
//@Configuration
//public class WebConfig implements WebMvcConfigurer {
//
//    @Override
//    public void addCorsMappings(CorsRegistry registry) {
//        registry.addMapping("/**") // Apply to all endpoints
//                .allowedOrigins("*") // Specify allowed origins (use "*" for any origin)
//                .allowedMethods("GET", "POST", "PUT", "DELETE", "OPTIONS") // Allowed HTTP methods
//                .allowedHeaders("*") // Allow all headers
//                .allowCredentials(true) // Allow sending credentials (cookies, authorization headers)
//                .maxAge(3600); // Cache preflight response for 1 hour
//    }
//}
