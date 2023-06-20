package com.example.resilence4j.config

import feign.Target
import org.springframework.cloud.openfeign.CircuitBreakerNameResolver
import java.lang.reflect.Method
import java.net.MalformedURLException
import java.net.URL

class HostNameCircuitBreakerNameResolver: CircuitBreakerNameResolver {
    override fun resolveCircuitBreakerName(
        feignClientName: String,
        target: Target<*>,
        method: Method?
    ): String {
        val url = target.url()

        return try {
            URL(url).host
        } catch (e: MalformedURLException) {
            "default"
        }
    }
}