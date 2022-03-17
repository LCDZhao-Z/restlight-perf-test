package com.test.controller;

import io.esastack.restlight.server.core.HttpRequest;
import io.esastack.restlight.spring.shaded.org.springframework.web.bind.annotation.PostMapping;
import io.esastack.restlight.spring.shaded.org.springframework.web.bind.annotation.RestController;

@RestController
public class PerfTestController {

    @PostMapping("/test")
    public byte[] test(HttpRequest request) {
        return request.body().getBytes();
    }
}
