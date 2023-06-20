package com.example.resilence4j.service

import com.example.resilence4j.external.TestClient
import io.github.resilience4j.circuitbreaker.annotation.CircuitBreaker
import org.springframework.stereotype.Service

@Service
class NotificationAServiceImpl(private val testClient: TestClient): NotificationService {

    @CircuitBreaker(name = "backendA")
    override fun send() {
        testClient.getAlbums()
    }
}