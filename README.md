Proyecto Spring WebFlux API con Internacionalización (i18n)

Este proyecto implementa una API RESTful utilizando Spring Boot 3+, Spring WebFlux y i18n (internacionalización). Permite manejar solicitudes de manera reactiva y seleccionar el idioma de respuesta.

Requisitos Previos
- JDK 17+
- Maven o Gradle
- IntelliJ IDEA, Eclipse o VS Code (opcional)

Instalación y Ejecución

Clonar o Descargar el Proyecto
```sh
git clone https://github.com/tuusuario/spring-webflux-i18n.git
cd spring-webflux-i18n
```

Configurar y Ejecutar la Aplicación
Ejecuta el siguiente comando según tu gestor de dependencias:

Con Maven:
```sh
./mvnw spring-boot:run   # Para Unix/macOS
mvnw.cmd spring-boot:run # Para Windows
```

Con Gradle:
```sh
./gradlew bootRun
```

La API estará disponible en `http://localhost:8080`

---

Endpoints Disponibles

Obtener Saludo (Internacionalización - i18n)
- GET: `http://localhost:8080/api/saludo`
- Encabezados opcionales: `Accept-Language: es | en | fr`

| Idioma  | Encabezado | Respuesta |
|---------|-----------|------------|
| Español | `es`      | `Hola, bienvenido a nuestra API Reactiva!` |
| Inglés  | `en`      | `Hello, welcome to our Reactive API!` |
| Francés | `fr`      | `Bonjour, bienvenue sur notre API réactive!` |

Listar Productos (Programación Reactiva)
- GET: `http://localhost:8080/api/productos`
- Respuesta esperada:
```json
[
    {"id": "1", "nombre": "Laptop", "precio": 1200.0},
    {"id": "2", "nombre": "Mouse", "precio": 25.0},
    {"id": "3", "nombre": "Teclado", "precio": 45.0}
]
```

---

Ejecutar Pruebas Automatizadas
Ejecuta las pruebas con:
```sh
./mvnw test   # Para Maven
./gradlew test # Para Gradle
```

Pruebas Incluidas
Las pruebas verifican:
- ✅ **Respuesta de saludo en español** (i18n)
- ✅ **Respuesta de lista de productos** (WebFlux)
- ✅ **Respuesta en francés e inglés**

Si las pruebas son exitosas, verás:
```
BUILD SUCCESSFUL
```

---

Estructura del Proyecto
```
spring-webflux-i18n/
│── src/main/java/com/tuempresa/webfluxapi
│   ├── config/
│   │   ├── LocaleConfig.java
│   ├── controllers/
│   │   ├── SaludoController.java
│   │   ├── ProductoController.java
│   ├── models/
│   │   ├── Producto.java
│   ├── services/
│   │   ├── ProductoService.java
│   ├── tests/
│   │   ├── WebfluxApiTests.java
│   ├── WebfluxApiApplication.java
│── src/main/resources/
│   ├── messages_es.properties
│   ├── messages_en.properties
│   ├── messages_fr.properties
│   ├── application.properties
```

---

Tecnologías Usadas
- Spring Boot 3+
- Spring WebFlux (reactivo)
- Internacionalización (i18n)
- Lombok (para simplificar modelos)
- Maven / Gradle (gestión de dependencias)
- JUnit y StepVerifier (pruebas automatizadas)

---

 Autor
Desarrollado por NataliaGV1

