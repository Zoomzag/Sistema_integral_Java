Sistema Integral de Gestión Institucional (SIGI)

El Sistema Integral de Gestión Institucional es una solución centralizada diseñada para administrar procesos académicos, financieros y administrativos en instituciones educativas. Su arquitectura sigue un modelo cliente-servidor que separa la lógica del negocio y el acceso a datos de la interfaz de usuario. Actualmente, este proyecto escolar se encuentra en etapa activa de desarrollo.

Arquitectura y Tecnologías

El núcleo backend del sistema está construido con Java 17+ utilizando el framework Spring Boot, apoyado en Spring Data JPA e Hibernate para el mapeo objeto-relacional y Lombok para reducir la verbosidad del código. El almacenamiento persistence se gestiona mediante una base de datos relacional MySQL.

Estructura del Modelo de Datos

El dominio del sistema se organiza en torno a 22 entidades de datos estructuradas en distintos módulos funcionales:

Control de Usuarios y Perfiles

La gestión de acceso se centra en la entidad Usuarios, la cual almacena credenciales y roles. Esta entidad se vincula de manera directa con Alumnos, que resguarda el expediente académico y números de control, y con Docentes, que registra los datos del personal académico y sus números de trabajador.

Gestión Académica y Horarios

Las Carreras definen los programas de estudio y perfiles de egreso, vinculándose con Asignaturas que detallan créditos y horas semanales. Los estudiantes se organizan mediante Grupos clasificados por semestre. La asignación operativa se administra a través de Horarios, que conectan grupo, materia, profesor y bloques de tiempo, así como CargasDocentes, encargadas de llevar el control de horas de clase por ciclo escolar.

Control Académico y Evaluaciones

El seguimiento académico se realiza mediante Calificaciones, registrando notas por periodo y observaciones. El control diario se apoya en Asistencias para los alumnos y AsistenciasDocentes para medir la puntualidad del profesorado. La gestión docente se complementa con DisponibilidadDocentes, que define franjas horarias libres, y EvaluacionesDocentes, orientadas a medir el desempeño académico.

Gestión Financiera

El módulo financiero inicia con ConceptosPago, catálogo donde se establecen cuotas, montos y periodicidades. Cada alumno cuenta con un historial centralizado en EstadosCuenta, sobre el cual se aplican los registros de Pagos recibidos. Adicionalmente, la entidad Becas permite asignar descuentos porcentuales y exenciones temporales sobre los cobros.

Biblioteca

El control bibliográfico se administra con MaterialesBiblioteca, que cataloga libros, ejemplares disponibles y ubicaciones físicas. Las transacciones de salida y retorno se gestionan mediante Prestamos, registrando fechas clave y sanciones por retraso, mientras que la entidad Reservaciones permite el apartado previo de títulos.

Comunicación y Servicios Institucionales

El sistema ofrece vías de interacción continua. Avisos publica anuncios generales o dirigidos a grupos específicos, Mensajes habilita la comunicación directa entre usuarios y Alertas notifica de forma automatizada eventos al estudiante. La documentación escolar se resguarda digitalmente en DocumentosAlumnos, mientras que EventosCalendario gestiona la agenda institucional. Finalmente, el análisis de rendimiento se realiza mediante Indicadores y DatosIndicadores, acumulando métricas que alimentan a ReportesEstadisticos mediante estructuras dinámicas en formato JSON.

Configuración de Base de Datos

spring.datasource.url=jdbc:mysql://localhost:3306/nombre_base_datos?useSSL=false&serverTimezone=UTC
spring.datasource.username=tu_usuario
spring.datasource.password=tu_contrasena
spring.datasource.driver-class-name=com.mysql.cj.jdbc.Driver

spring.jpa.hibernate.ddl-auto=update
spring.jpa.show-sql=true


Plan de Trabajo

El flujo de trabajo actual inició con la fase de diseño del modelo relacional y el modelado completo de entidades JPA. Los siguientes pasos consisten en la construcción de los repositorios JPA, la implementación de la capa de servicios con lógica de negocio, la exposición de endpoints REST, la integración de seguridad mediante Spring Security y la construcción de la interfaz para el cliente.
