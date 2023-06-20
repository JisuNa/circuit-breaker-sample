package com.example.resilence4j.external

import feign.Response
import org.springframework.cloud.client.circuitbreaker.NoFallbackAvailableException
import org.springframework.stereotype.Component

@Component
class Fallback: TestClient {
    override fun getAlbums(): Response {
        throw NoFallbackAvailableException("Boom!", RuntimeException())
    }
}