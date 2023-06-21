package com.example.resilence4j.service

import com.example.resilence4j.external.TestClient
import io.github.resilience4j.circuitbreaker.annotation.CircuitBreaker
import org.springframework.stereotype.Service
import java.lang.Exception

@Service
class NotificationServiceImpl(private val testClient: TestClient): NotificationService {

    @CircuitBreaker(name = "backendA", fallbackMethod = "fallback")
    override fun send() {
        println("try send!")
        val a = testClient.getAlbums()

        println(a.body().toString())
        println(a.status())
    }

    fun fallback(e: Exception) {
        println("Working!")
    }
}