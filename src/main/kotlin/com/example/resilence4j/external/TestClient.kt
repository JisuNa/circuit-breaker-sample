package com.example.resilence4j.external

import feign.Response
import org.springframework.cloud.openfeign.FeignClient
import org.springframework.web.bind.annotation.GetMapping

@FeignClient(name = "mailgun", url = "https://jsonplaceeholder.typicode.com/")
interface TestClient {
    @GetMapping("albums")
    fun getAlbums(): Response
}