package com.ecommerce.config;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.security.config.annotation.web.reactive.EnableWebFluxSecurity;
import org.springframework.security.config.web.server.ServerHttpSecurity;
import org.springframework.security.web.server.SecurityWebFilterChain;

/**
 * Security configuration class for setting up WebFlux security.
 */
@Configuration
@EnableWebFluxSecurity
public class WebFluxSecurityConfig {

    /**
     * Configures security settings for the application.
     *
     * @param httpSecurity ServerHttpSecurity to configure security settings
     * @return SecurityWebFilterChain configured with security settings
     */
    @Bean
    public SecurityWebFilterChain configureSecurity(ServerHttpSecurity httpSecurity) {
        return httpSecurity
                .csrf(csrf -> csrf.disable()) // Disable CSRF protection
                .authorizeExchange(authz -> authz
                        .pathMatchers("/eureka/**").permitAll() // Allow unauthenticated access to /eureka/**
                        .anyExchange().authenticated() // Require authentication for all other requests
                )
                .oauth2ResourceServer(oauth2 -> oauth2.jwt()) // Configure OAuth2 resource server with JWT
                .build();
    }
}
