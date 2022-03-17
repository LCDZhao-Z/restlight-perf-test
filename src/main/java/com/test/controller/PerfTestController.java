package com.test.controller;

import io.esastack.restlight.core.annotation.Scheduled;
import io.esastack.restlight.server.core.HttpRequest;
import io.esastack.restlight.spring.shaded.org.springframework.web.bind.annotation.PostMapping;
import io.esastack.restlight.spring.shaded.org.springframework.web.bind.annotation.RestController;

@RestController
public class PerfTestController {

    @PostMapping("/ioTest")
    public byte[] ioTest(HttpRequest request) {
        return request.body().getBytes();
    }

    @Scheduled("BIZ")
    @PostMapping("/bizTest")
    public byte[] bizTest(HttpRequest request) {
        return request.body().getBytes();
    }
}
