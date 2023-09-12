package com.egg.services;

import static io.restassured.RestAssured.*; 
import org.hamcrest.Matchers.*;

public class ApiTestService {   

    private String baseUrl;
    private String endPoint;
    private String methodHTTP;

    //  Ejercicio 1: Verificación de estado HTTP
    public void ejercicioNumero1() { 
        given() 
        .when() 
        .get("https://jsonplaceholder.typicode.com/posts/1") 
        .then() 
        .statusCode(200); 
    }

    public void agregarEndPoint(String endPoint) {
        this.endPoint = endPoint;
    }

    public void setearBaseUrl(String baseURL) {
        this.baseUrl = baseURL;
    }

    public void elUsuarioSeleccionaElMetodo(String metodo) {
        this.methodHTTP = metodo;
    }

    public void elUsuarioVerificaStatusCode(int code) {  
        String completeUrl = this.baseUrl + this.endPoint;
        if(this.methodHTTP.equals("GET"))
        {
            given() 
            .when() 
            .get(completeUrl) 
            .then() 
            .statusCode(code); 
        }
    }
}
