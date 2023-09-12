package com.egg;

import org.junit.jupiter.api.Test;
import static io.restassured.RestAssured.given; 
import static org.hamcrest.Matchers.*;

public class ApiTestJunit {

    // @Test 
    //@Tag("Ej1")
    //  Ejercicio 1: Verificación de estado HTTP
    public void ejercicioNumero1() { 
        given() 
        .when() 
        .get("https://jsonplaceholder.typicode.com/posts/1") 
        .then() 
        .statusCode(200); 
    }

    // @Test 
    //@Tag("Ej2")
    //  Ejercicio 2: Validación de contenido de respuesta
    public void ejercicioNumero2() { 
        given() 
        .when() 
        .get("https://jsonplaceholder.typicode.com/posts/1")
        .then()
        .body("userId", equalTo(1));
    }

    // @Test 
    //@Tag("Ej3")
    //  Ejercicio 3: Verificación de cabecera de respuesta
    public void ejercicioNumero3() { 
        given() 
        .when() 
        .get("https://jsonplaceholder.typicode.com/posts/1")
        .then()
        .header("Content-Type", "application/json; charset=utf-8");
    }

    // @Test 
    //@Tag("Ej4")
    //  Ejercicio 4: Realizar una solicitud POST
    public void ejercicioNumero4() { 
        String requestBody = "{\"title\": \"foo\", \"body\": \"bar\", \"userId\": 1}"; 
        given() 
        .contentType("application/json") 
        .body(requestBody) 
        .when() 
        .post("https://jsonplaceholder.typicode.com/posts") 
        .then() 
        .statusCode(201) 
        .body("title", equalTo("foo")) 
        .body("body", equalTo("bar")) 
        .body("userId", equalTo(1));
    }

    //@Test 
    //@Tag("Ej5")
    //  Ejercicio 5: Verificación de estado HTTP de otro recurso
    //  Objetivo: 
    //Realizar una solicitud GET a la API pública de JSONPlaceholder para obtener un comentario y verificar que el estado HTTP es 200.
    public void ejercicioNumero5() { 
        given() 
        .when() 
        .get("https://jsonplaceholder.typicode.com/comments/5")
        .then()
        .statusCode(200)
        .body("body", contains("harum"));
    }

    //@Test 
    //@Tag("Ej6")
    //  Ejercicio 6: Validación de contenido de respuesta en una lista
    public void ejercicioNumero6() { 
        String requestBody = "{\"title\": \"foo\", \"body\": \"bar\", \"userId\": 1}"; 
        given() 
        .contentType("application/json") 
        .body(requestBody) 
        .when() 
        .post("https://jsonplaceholder.typicode.com/todos") 
        .then() .statusCode(201) 
        .body("title", equalTo("foo")) 
        .body("body", equalTo("bar")) 
        .body("userId", equalTo(1));
    }

    //@Test 
    //@Tag("Ej7")
    //  Ejercicio 7: Verificación de contenido en una respuesta con múltiples resultados
    public void ejercicioNumero7() { 
        given() 
        .when() 
        .get("https://jsonplaceholder.typicode.com/posts?userId=1")
        .then()
        .body("userId", equalTo(1));
    }
}
