package com.example.webflux.controllers;


import com.example.webflux.models.Producto;
import com.example.webflux.services.ProductoService;
import org.springframework.web.bind.annotation.*;
import reactor.core.publisher.Flux;

@RestController
@RequestMapping("/api/productos")
public class ProductoController {
    private final ProductoService productoService;

    public ProductoController(ProductoService productoService) {
        this.productoService = productoService;
    }

    @GetMapping
    public Flux<Producto> listarProductos() {
        return productoService.obtenerProductos();
    }
}

