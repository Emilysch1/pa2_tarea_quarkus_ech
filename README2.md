#  Documentación de Scopes en Quarkus

Este documento explica los diferentes tipos de **scopes (contextos)** utilizados en CDI dentro del framework

---

## ApplicationScoped

Se crea **una sola instancia** durante toda la ejecución de la aplicación.  
Es ideal para servicios compartidos y reutilizables.

###  Ejemplos

- Servicio de usuarios → maneja operaciones de usuarios en toda la aplicación.  
- Servicio de pedidos → procesa pedidos de forma centralizada.  
- Configuración global → mantiene valores únicos del sistema.  
- Pool de conexiones → reutilizado por toda la aplicación.  
- Servicio de autenticación → valida credenciales de todos los usuarios.  
- Logger → registra eventos y errores del sistema.  
- Servicio de notificaciones → envía mensajes o alertas.  

---

##  Dependent

Se crea una **nueva instancia cada vez que se inyecta**.  
Se utiliza para objetos pequeños, temporales o sin estado compartido.

###  Ejemplos

- Objeto temporal de cálculo → se crea en cada operación.  
- Validador de datos → valida información en cada uso.  
- Conversor de datos → transforma valores cuando se necesita.  
- Clase auxiliar → apoya tareas específicas.  
- Generador de reportes → crea reportes independientes.  
- Formateador de texto → aplica formato a datos.  
- Generador de tokens → genera tokens únicos por solicitud.  

---

##  Singleton

Se crea **una sola instancia en toda la aplicación**, similar a `ApplicationScoped`, pero con un enfoque más tradicional.

###  Ejemplos

- Cache de datos → almacena información en memoria.  
- Configuración del sistema → mantiene parámetros globales.  
- Gestor de conexiones → centraliza acceso a recursos.  
- Contador global → mantiene un valor compartido.  
- Servicio de auditoría → registra acciones importantes.  
- Monitor de sistema → supervisa el estado de la aplicación.  
- Administrador de recursos → controla el uso de memoria y procesos.  

---

##  Conclusión

- `ApplicationScoped` → ideal para servicios compartidos  
- `Dependent` → útil para objetos temporales  
- `Singleton` → manejo global único de recursos  

Estos scopes permiten controlar el ciclo de vida de los objetos y optimizar el rendimiento de la aplicación.