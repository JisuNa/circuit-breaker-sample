package com.example.resilence4j.config

import io.github.resilience4j.circuitbreaker.CallNotPermittedException
import org.springframework.http.ResponseEntity
import org.springframework.web.bind.annotation.ExceptionHandler
import org.springframework.web.bind.annotation.RestControllerAdvice
import java.util.*

@RestControllerAdvice
class GlobalExceptionAdvice {
    @ExceptionHandler(CallNotPermittedException::class)
    fun handleCallNotPermittedException(e: CallNotPermittedException?): ResponseEntity<*>? {
        return ResponseEntity.internalServerError()
            .body(Collections.singletonMap("code", "InternalServerError"))
    }
}