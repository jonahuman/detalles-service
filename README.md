# Detalles Service

Este proyecto es una aplicación básica de Spring Boot que muestra detalles estáticos utilizando Thymeleaf como motor de plantillas. Es un ejemplo sencillo para aprender a configurar un proyecto con controladores y vistas en Spring Boot.

## Requisitos Previos

Antes de comenzar, asegúrate de tener lo siguiente instalado:

- **Java 21**: Verifica la versión ejecutando `java --version` en la terminal.
- **Visual Studio Code** con las siguientes extensiones:
  - **Spring Boot Extension Pack** (VMware)
  - **Extension Pack for Java** (Microsoft)
- **Maven**: Necesario para gestionar las dependencias del proyecto.

## Configuración del Proyecto

Sigue estos pasos para configurar el proyecto desde cero:

1. **Revisar e instalar las extensiones**:
   - En Visual Studio Code, instala las extensiones:
     - **Spring Boot Extension Pack** (VMware)
     - **Extension Pack for Java** (Microsoft)

2. **Iniciar Spring Initializr**:
   - Presiona `Ctrl+Shift+P` en Visual Studio Code y escribe: `"Spring Initializr: Create a Maven Project..."`.

3. **Seleccionar la versión de Spring Boot**:
   - Elige la versión **3.4.4**.

4. **Seleccionar el lenguaje**:
   - Escoge **Java**.

5. **Configurar el Group Id**:
   - Ingresa: `com.informaticadsy.spring.app1`.

6. **Configurar el Artifact Id**:
   - Ingresa: `springboot-aplications`.

7. **Seleccionar el tipo de empaquetado**:
   - Elige **Jar**.

8. **Seleccionar la versión de Java**:
   - Escoge **21**. (Puedes verificar tu versión de Java con `java --version` en la terminal).

9. **Agregar dependencias**:
   - Selecciona las siguientes dependencias:
     - **Spring Web**
     - **Spring Boot DevTools**
     - **Thymeleaf**

10. **Elegir la ubicación del proyecto**:
    - Visual Studio Code te pedirá una ubicación para guardar el proyecto. Selecciona la carpeta deseada.

11. **Crear el paquete de controladores**:
    - Navega a `src/main/java` y crea un nuevo paquete con el nombre:  
      `com.informaticadsy.spring.app1.springboot_aplications.controller`.

12. **Crear la clase EjemploController**:
    - Dentro del paquete creado, crea una clase llamada `EjemploController` con el siguiente código inicial:
      ```java
      package com.informaticadsy.spring.app1.springboot_aplications.controller;
      import org.springframework.stereotype.Controller;
      import org.springframework.web.bind.annotation.GetMapping;
      @Controller
      public class EjemploController {
          @GetMapping("/detalles")
          public String info(){
              return "detalles";
          }
      }