# Sistema de Roles y Permisos - Interfaz de Usuario para Login

Este proyecto implementa una Interfaz Gráfica de Usuario (IGU) para el login de una aplicación con gestión de roles y permisos. La aplicación permite a los usuarios autenticarse, verificar sus credenciales y acceder a funcionalidades específicas según su rol asignado.

## Características de la Interfaz Gráfica de Usuario (IGU)

La IGU cuenta con los siguientes elementos:
- Campos de texto para nombre de usuario y contraseña, con etiquetas correspondientes.
- Botones para iniciar sesión y limpiar los datos.

## Funcionalidades del Sistema

1. **Autenticación de Usuarios:**
   - Verificación de usuario y contraseña.
   - Acceso a funcionalidades según el rol asignado.

2. **Roles y Permisos:**
   - Dos tipos de usuarios: "admin" (administrador) y "user" (usuario común).
   - Permisos diferenciados para cada tipo de usuario.

### Permisos del Usuario Administrador (admin):
   - Visualización de todos los usuarios.
   - Alta, baja, modificación y lectura de cualquier usuario y sus permisos.

### Permisos del Usuario Común (user):
   - Lectura de todos los usuarios.

3. **Usuarios y Contraseñas de Prueba:**
   - Usuario Administrador: admin
   - Contraseña Administrador: 123

4. **Pantalla de Control de Usuario:**
   - Muestra el nombre del usuario de la sesión actual en la esquina superior derecha.

## Desarrollo y Uso

1. Clonar el repositorio.
2. Importar la base de datos "login" a su gestor de BD.
3. Ejecutar la aplicación.
4. Utilizar la IGU para iniciar sesión y acceder a las funcionalidades.

Vista previa: [Ver Video](https://www.linkedin.com/feed/update/urn:li:activity:7159646369371062272)

## Estructura del Proyecto

El proyecto sigue una estructura basada en el modelo de capas para una organización clara y separación de responsabilidades y hace uso de JPA para la persistencia de datos.

## Contribuciones

¡Las contribuciones son bienvenidas! Si encuentras algún problema o tienes sugerencias de mejora, no dudes en abrir un problema o enviar una solicitud de extracción.

---

¡Gracias por utilizar este Sistema de Roles y Permisos con IGU para el Login! Si tienes alguna pregunta o comentario, no dudes en ponerte en contacto.
