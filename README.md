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

<<<<<<< HEAD
> **Estado del proyecto:** en desarrollo. Esta versión corresponde a la migración del proyecto original, construido con **Django (Python)**, hacia **Spring Boot (Java)**. Además de replicar las capacidades del sistema anterior, incorpora nuevas funcionalidades y plantea nuevos retos técnicos y soluciones.
=======
> **Estado del proyecto:** en desarrollo. Esta versión corresponde a la migración del proyecto original, construido con Django (Python), hacia **Spring Boot (Java)**. Además de replicar las capacidades del sistema anterior, incorpora nuevas funcionalidades y plantea nuevos retos técnicos y soluciones.
>>>>>>> 4c939cb195261151ae4d670865a97103ab7b89a9

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

<<<<<<< HEAD
## Módulos del sistema

| Módulo | Funcionalidades |
|---|---|
| Autenticación y seguridad | Inicio y cierre de sesión, redirección según tipo de usuario, control de permisos |
| Administración académica | Panel general, gestión de planes de estudio (carreras), control de horarios, evaluaciones y control de asistencia, con alertas por baja calificación e inasistencias |
| Gestión de alumnos | Inscripción, reinscripción, expediente (calificaciones y asistencias) y generación de reportes |
| Gestión de docentes | Asignación de materias y grupos, horarios y evaluación del desempeño docente |
| Control administrativo y financiero | Becas, pagos, conceptos de pago y estados de cuenta |
| Biblioteca | Catálogo de materiales, préstamos, devoluciones, reservaciones y recursos digitales |
| Extras | Trámites, evaluación docente y actividades extraescolares |
| Comunicación | Avisos, mensajes y calendario de eventos |
| Indicadores y reportes | Indicadores institucionales y reportes estadísticos |

## Base de datos

El sistema utiliza **MySQL** como gestor de base de datos, diseñada para almacenar la información de los distintos módulos institucionales. Las principales entidades son:

- **Académico:** carreras, asignaturas, grupos, alumnos, docentes, horarios, calificaciones, asistencias, cargas docentes, disponibilidad de docentes y evaluaciones docentes.
- **Financiero:** becas, conceptos de pago, estados de cuenta y pagos.
- **Biblioteca:** materiales, préstamos y reservaciones.
- **Comunicación:** avisos, mensajes y eventos de calendario.
- **Seguimiento:** alertas, indicadores, datos de indicadores y reportes estadísticos.
- **Usuarios y documentos:** usuarios y documentos de alumnos.

## Migración desde el proyecto original

El proyecto original utilizaba Django 5.2 con MySQL. A continuación se muestra la equivalencia entre sus componentes y los de esta versión:

| Django (original) | Spring Boot (esta versión) |
|---|---|
| `models.py` | Entidades JPA (`@Entity`) y migraciones de Flyway |
| `views.py` | Controladores (`@Controller` / `@RestController`) y servicios |
| `urls.py` | Mapeos de rutas (`@RequestMapping`, `@GetMapping`, `@PostMapping`) |
| Plantillas de Django | Plantillas de Thymeleaf |
| `django.contrib.auth` | Spring Security |
| `settings.py` | `application.properties` / `application.yml` |
=======
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
>>>>>>> 4c939cb195261151ae4d670865a97103ab7b89a9
