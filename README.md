```text
   _____ _     _                         _____       _                       _   _____           _   _ _              _                   _ 
  / ____(_)   | |                       |_   _|     | |                     | | |_   _|         | | (_) |            (_)                 | |
 | (___  _ ___| |_ ___ _ __ ___   __ _    | |  _ __ | |_ ___  __ _ _ __ __ _| |   | |  _ __  ___| |_ _| |_ _   _  ___ _  ___  _ __   __ _| |
  \___ \| / __| __/ _ \ '_ ` _ \ / _` |   | | | '_ \| __/ _ \/ _` | '__/ _` | |   | | | '_ \/ __| __| | __| | | |/ __| |/ _ \| '_ \ / _` | |
  ____) | \__ \ ||  __/ | | | | | (_| |  _| |_| | | | ||  __/ (_| | | | (_| | |  _| |_| | | \__ \ |_| | |_| |_| | (__| | (_) | | | | (_| | |
 |_____/|_|___/\__\___|_| |_| |_|\__,_| |_____|_| |_|\__\___|\__, |_|  \__,_|_| |_____|_| |_|___/\__|_|\__|\__,_|\___|_|\___/|_| |_|\__,_|_|
                                                              __/ |                                                                         
                                                             |___/                                                                          
```

# Sistema Integral Institucional

Sistema integral institucional inspirado en el antiguo SII del **Instituto Tecnológico de Chihuahua Campus II**, cuyas funcionalidades resultaban de gran utilidad para el personal administrativo, el personal docente y el alumnado.

> **Estado del proyecto:** en desarrollo. Esta versión corresponde a la migración del proyecto original, construido con Django (Python), hacia **Spring Boot (Java)**. Además de replicar las capacidades del sistema anterior, incorpora nuevas funcionalidades y plantea nuevos retos técnicos y soluciones.

## Tecnologías

El proyecto está desarrollado en **Java 21** con **Spring Boot 3.2.x**, e integra las siguientes dependencias:

| Dependencia | Propósito |
|---|---|
| Spring Web | Capa web y controladores |
| Spring Data JPA | Persistencia y acceso a datos |
| Spring Security | Autenticación y autorización |
| MySQL Driver | Conexión con la base de datos |
| Flyway Migration | Control de versiones del esquema de base de datos |
| Lombok | Reducción de código repetitivo |
| Spring Boot DevTools | Agilización del desarrollo |
| Thymeleaf | Motor de plantillas para las vistas |

## Base de datos

El sistema utiliza **MySQL** como gestor de base de datos, diseñada para almacenar la información de los distintos módulos institucionales:

- Gestión académica
- Horarios
- Control escolar
- Evaluaciones
- Gestión financiera
- Biblioteca
- Comunicación
- Servicios institucionales
- Entre otros
