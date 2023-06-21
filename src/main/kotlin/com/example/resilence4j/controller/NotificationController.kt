package com.example.resilence4j.controller

import com.example.resilence4j.service.NotificationService
import org.springframework.beans.factory.annotation.Qualifier
import org.springframework.web.bind.annotation.GetMapping
import org.springframework.web.bind.annotation.PostMapping
import org.springframework.web.bind.annotation.RequestMapping
import org.springframework.web.bind.annotation.RestController

@RestController
@RequestMapping("/notification")
class NotificationController(private val notificationService: NotificationService) {

    @GetMapping
    fun send() {
        notificationService.send()
    }
}