package com.example.resilence4j.external

import feign.Response
import org.springframework.cloud.openfeign.FeignClient
import org.springframework.web.bind.annotation.GetMapping

//@FeignClient(name = "mailgun", url = "https://jsonplaceeholder.typicode.com/")
@FeignClient(name = "test", url = "localhost:8090")
interface TestClient {
    @GetMapping("/test")
    fun getAlbums(): Response
}