package com.studentinformationsystem.fullstack_backend.config;

import jakarta.servlet.Filter;
import jakarta.servlet.FilterChain;
import jakarta.servlet.ServletException;
import jakarta.servlet.http.HttpServletRequest;
import jakarta.servlet.http.HttpServletResponse;
import org.springframework.stereotype.Component;

import java.io.IOException;

@Component
public class JakartaCorsFilter implements Filter {

    @Override
    public void doFilter(jakarta.servlet.ServletRequest request, 
                         jakarta.servlet.ServletResponse response, 
                         FilterChain chain) 
            throws IOException, ServletException {

        HttpServletResponse res = (HttpServletResponse) response;
        HttpServletRequest req = (HttpServletRequest) request;

        // Add CORS headers
        res.setHeader("Access-Control-Allow-Origin", "*"); // Replace with your allowed origin
        res.setHeader("Access-Control-Allow-Methods", "GET, POST, PUT, DELETE, OPTIONS");
        res.setHeader("Access-Control-Allow-Headers", "Origin, Content-Type, Accept, Authorization");
        res.setHeader("Access-Control-Allow-Credentials", "true"); // Allow credentials like cookies

        // Handle preflight (OPTIONS) requests
        if ("OPTIONS".equalsIgnoreCase(req.getMethod())) {
            res.setStatus(HttpServletResponse.SC_OK);
            return;
        }

        // Proceed with the filter chain
        chain.doFilter(request, response);
    }
}
