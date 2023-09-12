
Feature: Ejercicios API

Background: Precondición de URL base para las pruebas
    Given El usuario trabaja con la url 'https://jsonplaceholder.typicode.com/'

@Test @SmokeTest
    Feature Description
    Scenario: Ejercicio 1
    When El usuario agrega el endpoint "posts/1"
    And El usuario selecciona el método "GET"
    Then El usuario verifica esl status code 200