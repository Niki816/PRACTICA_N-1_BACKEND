# PRACTICA_N-1_BACKEND
Este proyecto es una API REST desarrollada con Spring Boot para la gestión de estudiantes. Se implementaron las operaciones CRUD para permitir la creación, obtención, actualización y eliminación de estudiantes en la base de datos.  

Se agregó un endpoint para crear un nuevo estudiante, asegurando que los datos se reciban en formato JSON y sean mapeados correctamente a un DTO antes de convertirse en una entidad y guardarse en el repositorio. Al completar la operación, se devuelve una respuesta con el estado 201 Created.  

También se implementó un endpoint para obtener un estudiante por su ID utilizando el método GET, devolviendo la información del estudiante si existe en la base de datos.  

Para la actualización de un estudiante se creó un endpoint con el método PUT, permitiendo modificar los datos de un estudiante existente. Se llama al servicio correspondiente para actualizar la información y se devuelve el estudiante actualizado con el estado 200 OK.  

Se desarrolló un endpoint para eliminar un estudiante por su ID con el método DELETE, asegurando que se reciba el identificador como parámetro en la URL. Si la eliminación es exitosa, se devuelve el estado 204 No Content.  

Las pruebas se realizaron utilizando Postman para verificar que los endpoints funcionen correctamente. Se documentaron los resultados obtenidos con capturas de pantalla.
