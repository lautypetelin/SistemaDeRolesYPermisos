# Sistema de Roles y Permisos

Este proyecto implementa una Interfaz Gráfica de Usuario (IGU) para el login de una aplicación con gestión de roles y permisos. La aplicación permite a los usuarios autenticarse, verificar sus credenciales y acceder a funcionalidades específicas según su rol asignado.

![Login y Registro (1)](https://github.com/user-attachments/assets/218447bc-6202-4987-97dc-0731c902c08a)

## Almacenamiento en Base de Datos

Esta aplicación de escritorio registra en una base de datos los datos de usuarios desde la interfaz gráfica de usuario basado en los conceptos del MODELO DE CAPAS.

## Características de la Interfaz Gráfica de Usuario (IGU)

La IGU cuenta con los siguientes elementos para iniciar sesión:
- Campos de texto para nombre de usuario y contraseña, con etiquetas correspondientes.
- Botones para iniciar sesión, registrarse y limpiar los datos.

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

![Pantalla de Administrador (1)](https://github.com/user-attachments/assets/ed419c46-d1f7-4ad1-85bf-c4d5bac830c1)

### Permisos del Usuario Común (user):
   - Lectura de todos los usuarios.

![Pantalla de Usuario Común (1)](https://github.com/user-attachments/assets/4cc4b234-30ba-44e0-ac71-d6d583deaf97)

3. **Usuarios y Contraseñas de Prueba:**
   - Correo de Administrador: admin@mail.com
   - Contraseña Administrador: admin123

4. **Pantalla de Control de Usuario:**
   - Muestra el nombre del usuario de la sesión actual en la esquina superior derecha.

## Desarrollo y Uso

1. Clonar el repositorio.
2. Importar la base de datos "login" a su gestor de BD.
3. Ejecutar la aplicación.
4. Utilizar la IGU para iniciar sesión y acceder a las funcionalidades.

## Requisitos

- JDK 17.0.6
- Algún Sistema Gestor de Base de Datos (SGBD)
- Importar al Gestor de Base de Datos el archivo .sql (ubicado en la carpeta resources) para poder hacer uso de la persistencia en la aplicación.

## Créditos

- **Desarrollado por**: Lautaro Tomás Israel Petelin
- **Tecnologías utilizadas**: Java 17.0.6, XAMPP
- **IDE**: Netbeans 17
- **Autor de la consigna**: Luisina de Paula / TodoCode

## Contribuciones

¡Las contribuciones son bienvenidas! Si encuentras algún problema o tienes sugerencias de mejora, no dudes en abrir un problema o enviar una pull request.
