package com.example.monitor.Configs;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.security.config.annotation.web.builders.HttpSecurity;
import org.springframework.security.config.annotation.web.configuration.EnableWebSecurity;
import org.springframework.security.web.SecurityFilterChain;
@Configuration
@EnableWebSecurity
public class SecurityConfig {

    @Bean
    public SecurityFilterChain securityFilterChain(HttpSecurity http) throws Exception {
        http
        .authorizeHttpRequests(authorize -> authorize
            .requestMatchers("/api/**").authenticated().anyRequest().permitAll() // All requests require authentication
        )
        .oauth2ResourceServer(oauth2 -> oauth2
            .jwt()); // Use JWT for OAuth2 resource server

    return http.build();
    }


}