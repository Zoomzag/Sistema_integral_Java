   _____ _     _                         _____       _                       _   _____           _   _ _              _                   _ 
  / ____(_)   | |                       |_   _|     | |                     | | |_   _|         | | (_) |            (_)                 | |
 | (___  _ ___| |_ ___ _ __ ___   __ _    | |  _ __ | |_ ___  __ _ _ __ __ _| |   | |  _ __  ___| |_ _| |_ _   _  ___ _  ___  _ __   __ _| |
  \___ \| / __| __/ _ \ '_ ` _ \ / _` |   | | | '_ \| __/ _ \/ _` | '__/ _` | |   | | | '_ \/ __| __| | __| | | |/ __| |/ _ \| '_ \ / _` | |
  ____) | \__ \ ||  __/ | | | | | (_| |  _| |_| | | | ||  __/ (_| | | | (_| | |  _| |_| | | \__ \ |_| | |_| |_| | (__| | (_) | | | | (_| | |
 |_____/|_|___/\__\___|_| |_| |_|\__,_| |_____|_| |_|\__\___|\__, |_|  \__,_|_| |_____|_| |_|___/\__|_|\__|\__,_|\___|_|\___/|_| |_|\__,_|_|
                                                              __/ |                                                                         
                                                             |___/                                                                          

Este es un sistema integral institucional inspirado en el antiguo SII que manejaba el Instituto Tecnológico de Chihuahua Campus II, el cual contaba con características que resultaban de gran ayuda para el personal administrativo, docente y el alumnado. El proyecto aún no está terminado, ya que corresponde a una migración del proyecto original desarrollado en Django con Python. A diferencia de aquel, esta nueva versión está desarrollada con el marco de trabajo Spring Boot en Java, e incluye características distintas al proyecto original, así como nuevos retos, problemas y soluciones.

El proyecto fue desarrollado enteramente en Java 21 utilizando la versión más reciente y estable del framework hasta la fecha, la 3.2.x (o la versión correspondiente de Spring Boot, ajustando según corresponda), junto con las siguientes dependencias para lograr una correcta migración entre tecnologías: Spring Web, Spring Data JPA, Spring Security, MySQL Driver, Flyway Migration, Lombok, Spring Boot DevTools y Thymeleaf.

Asimismo, el proyecto fue diseñado teniendo en mente una base de datos en MySQL, la cual almacena información de diversos módulos como gestión académica, horarios, control escolar, evaluaciones, gestión financiera, biblioteca, comunicación y servicios institucionales, entre otros.
