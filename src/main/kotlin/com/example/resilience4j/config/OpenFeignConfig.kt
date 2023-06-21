package com.example.resilience4j.config

import feign.Logger
import org.springframework.cloud.openfeign.EnableFeignClients
import org.springframework.context.annotation.Bean
import org.springframework.context.annotation.Configuration

@Configuration
@EnableFeignClients("com.example.resilience4j.external")
class OpenFeignConfig {
    @Bean
    fun feignLoggerLevel() = Logger.Level.FULL
}