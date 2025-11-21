# 💰 Conversor de Monedas - Alura Challenge

![Java](https://img.shields.io/badge/Java-ED8B00?style=for-the-badge&logo=openjdk&logoColor=white)
![GSON](https://img.shields.io/badge/GSON-Library-blue?style=for-the-badge)
![API](https://img.shields.io/badge/API-ExchangeRate-green?style=for-the-badge)

## 📄 Descripción

Este proyecto es parte del desafío de **Java Orientado a Objetos** del programa **Oracle Next Education (ONE)** en alianza con Alura Latam.

El objetivo principal es desarrollar un Conversor de Monedas que consuma datos reales de una API externa, permitiendo a los usuarios realizar conversiones precisas entre diferentes divisas internacionales a través de una interfaz de consola interactiva.

## 🚀 Funcionalidades

- **Conexión a API en tiempo real:** Utiliza `ExchangeRate-API` para obtener las tasas de cambio actualizadas.
- **Menú Interactivo:** Interfaz de consola fácil de usar con opciones predefinidas de conversión.
- **Conversión Dinámica:** Permite al usuario ingresar el monto deseado para calcular el cambio.
- **Manejo de Errores:** Control de excepciones para entradas inválidas o fallos de conexión.

## 🛠️ Tecnologías Utilizadas

- **Java JDK 17:** Lenguaje principal del proyecto.
- **Gson (Google):** Librería para la deserialización de objetos JSON a objetos Java.
- **Java HttpClient:** Para realizar las peticiones HTTP a la API.
- **IntelliJ IDEA:** Entorno de desarrollo integrado (IDE).
- **Git & GitHub:** Control de versiones.

## 💻 Cómo ejecutar el proyecto

1.  **Clonar el repositorio:**
   ```bash
    git clone [https://github.com/IanOsnaya/ConversorDeMoneda.git](https://github.com/IanOsnaya/ConversorDeMoneda.git)
    ```

2.  **Importar en IntelliJ IDEA:**
    - Abre IntelliJ y selecciona "Open".
    - Navega hasta la carpeta clonada.
    - Espera a que Maven/Gradle (si aplica) o el IDE indexe los archivos.

3.  **Configurar dependencias:**
    - Asegúrate de tener el archivo `.jar` de **Gson** agregado a las librerías del proyecto o configurado en tu `module-info.java`.

4.  **Ejecutar:**
    - Ve al archivo `src/Principal.java`.
    - Haz clic derecho y selecciona **"Run 'Principal.main()'"**.

## 📸 Ejemplo de Uso

Al iniciar el programa, verás un menú como este:

```text
***************************************************
1.- Dolares a Pesos Mexicanos
2.- Pesos Mexicanos a Dong Vietnamita
3.- Pesos Mexicanos a Yen Japones
4.- Don Vietnamita a Yen Japones
5.- Euros a Pesos Mexicanos
6.- Euros a Dong Vietnamita
7.- Dolares a Yen Japones
8. Salir
***************************************************

## ✒️ Autor

**Ian Osnaya**
- [Perfil de GitHub](https://github.com/IanOsnaya)


---
*Proyecto desarrollado para el desafío Alura - Oracle Next Education.*
