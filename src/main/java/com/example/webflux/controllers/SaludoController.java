package com.example.webflux.controllers;


import org.springframework.context.support.ResourceBundleMessageSource;
import org.springframework.web.bind.annotation.*;
import reactor.core.publisher.Mono;
import java.util.Locale;

@RestController
@RequestMapping("/api")
public class SaludoController {
    private final ResourceBundleMessageSource messageSource;

    public SaludoController(ResourceBundleMessageSource messageSource) {
        this.messageSource = messageSource;
    }

    @GetMapping("/saludo")
    public Mono<String> obtenerSaludo(@RequestHeader(name = "Accept-Language", required = false) Locale locale) {
        return Mono.just(messageSource.getMessage("saludo", null, locale));
    }
}

