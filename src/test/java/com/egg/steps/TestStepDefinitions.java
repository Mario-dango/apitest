package com.egg.steps;

import com.egg.services.ApiTestService;

import io.cucumber.java.en.And;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;

public class TestStepDefinitions {
    private ApiTestService apiTestService;

    public TestStepDefinitions(ApiTestService apiTestService) {
        this.apiTestService = apiTestService;
    }

    @Given("^El usuario trabaja con la url {String}$")
    @Given("El usuario trabaja con la url \"https://jsonplaceholder.typicode.com/\"")
    public void pasarElEndPointService(String BaseURL) {
        apiTestService.setearBaseUrl(BaseURL);
    }

    @When("^El usuario agrega el endpoint {String}$")
    @When("El usuario agrega el endpoint \"posts/1\"")
    public void aplicarMetodoGet(String endPoint) {
        apiTestService.agregarEndPoint(endPoint);
    }

    @And("^El usuario selecciona el método \"(.*)\"$")
    @And("El usuario selecciona el m\u00E9todo \"GET\"")
    public void comprobarStatus(String metodo) {
        apiTestService.elUsuarioSeleccionaElMetodo(metodo);
    }

    @Then("^El usuario verifica esl status code {int}$")
    @Then("El usuario verifica esl status code 200")
    public void comprobarStatus(int code) {
        apiTestService.elUsuarioVerificaStatusCode(code);
    }


}
