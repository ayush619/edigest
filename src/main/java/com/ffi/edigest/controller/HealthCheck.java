package com.ffi.edigest.controller;

import lombok.extern.slf4j.Slf4j;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@Slf4j
public class HealthCheck
{
@GetMapping("/healthCheck")
public String healthCheck()
{
    log.info("Heatlh check is working");
    return "Ok";
}
}
