# apitest
Compendio de ejercicios orientados a pruebas de APIs

# Pruebas de API con Gherkin, Cucumber, JUnit y Maven

Este repositorio contiene un proyecto de pruebas de API utilizando Gherkin, Cucumber, JUnit y Maven. El objetivo de este proyecto es realizar pruebas de API siguiendo los ejercicios propuestos en el curso EGG.

## Estructura del Proyecto

El proyecto está organizado de la siguiente manera:

```markdown
apitest/
│
├── src/
│   ├── main/
│   │   └── ... (código fuente principal, de momento no necesario)
│   │
│   └── test/
│       ├── java/
│       │   └── com/
│       │       └── egg/
│       │           ├── steps/                   # Definición de pasos de Cucumber
│       │           │   └── TestStepDefinitions.java
│       │           ├── constants/               # Definición de constantes de Cucumber
│       │           │   └── ApiTestConstant.java
│       │           ├── services/                # Definición de servicios de Cucumber
│       │           │   └── ApiTestService.java
│       │           │
│       │           ├── ApiTestJunit.java   # Clase de prueba JUnit para ejecutar los escenarios de Cucumber
│       │           │
│       │           └── CucumberTest.java   # Clase de Runner para ejecutar los escenarios de Cucumber
│       └── resources/
│           ├── features/                    # Archivos de especificaciones Gherkin
│           │   └── test.feature
│           └── postman
│               └── API tests Ejercicios.postman_collection.json  # Archivo de colección sacado y probado desde postman
├── .gitignore                              # Archivo de configuración Git
├── pom.xml                                 # Archivo de configuración Maven
└── README.md                               # Este archivo
```

## Requisitos

Asegúrate de tener instaladas las siguientes herramientas:

- Java JDK
- Maven
- Cucumber

## Ejecución de las Pruebas

Para ejecutar las pruebas de API, sigue estos pasos:

1. Clona este repositorio en tu máquina local:

   ```shell
   git clone https://github.com/Mario-dango/apitest.git
   ```

2. Navega al directorio del proyecto:

   ```shell
   cd apitest
   ```

3. Ejecuta las pruebas utilizando Maven:

   ```shell
   mvn test
   ```

Esto ejecutará los escenarios definidos en los archivos Gherkin utilizando Cucumber y JUnit. Los resultados de las pruebas se mostrarán en la consola.

## Contribuciones

Si deseas contribuir a este proyecto, ¡te damos la bienvenida! Puedes abrir problemas (issues) o enviar solicitudes de extracción (pull requests) para sugerir mejoras o correcciones.

## Licencia

Este proyecto se encuentra bajo la licencia [MIT License](LICENSE).

---
Hecho con ❤️ por Mario Papetti Funes - [https://github.com/Mario-dango] - [https://www.linkedin.com/in/mario-papetti/]


