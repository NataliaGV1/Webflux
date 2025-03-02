package com.example.webflux;


import com.example.webflux.controllers.SaludoController;
import com.example.webflux.services.ProductoService;
import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;
import reactor.test.StepVerifier;
import java.util.Locale;

@SpringBootTest
class WebfluxApiTests {

	@Autowired
	private SaludoController saludoController;

	@Autowired
	private ProductoService productoService;

	@Test
	void testSaludoEnEspanol() {
		StepVerifier.create(saludoController.obtenerSaludo(new Locale("es")))
				.expectNext("Hola, bienvenido a nuestra API Reactiva!")
				.verifyComplete();
	}

	@Test
	void testListarProductos() {
		StepVerifier.create(productoService.obtenerProductos())
				.expectNextCount(3)
				.verifyComplete();
	}
}

