package com.example.resilence4j.service

import org.springframework.stereotype.Service

@Service
class NotificationBServiceImpl: NotificationService{
    override fun send() {
        println("Working circuit breaker.")
    }
}