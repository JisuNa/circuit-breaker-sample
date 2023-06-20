package com.example.resilence4j.config

import org.springframework.cloud.openfeign.EnableFeignClients
import org.springframework.context.annotation.Configuration

@Configuration
@EnableFeignClients("com.example.resilence4j.external")
class OpenFeignConfig