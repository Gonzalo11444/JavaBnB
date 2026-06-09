# JavaBnB

Sistema de información de escritorio diseñado para la gestión integral de reservas de alojamientos, conectando anfitriones y clientes a través de una plataforma centralizada. Este proyecto aplica principios avanzados de Programación Orientada a Objetos (POO) y gestión de concurrencia para simular un entorno de negocio real en el sector *PropTech*.

## 🚀 Lógica de Negocio y Funcionalidades Clave

El sistema modela las operaciones críticas de una plataforma de reservas, dividiendo el acceso y los privilegios en tres roles distintos:

*   **Administrador:** Control total sobre la plataforma. Capacidad para auditar el listado de usuarios registrados, monitorizar el parque de inmuebles dados de alta y revisar el histórico global de reservas del sistema.
*   **Anfitrión (Host):** Gestión del inventario inmobiliario. Permite dar de alta nuevos inmuebles (casas o apartamentos) definiendo atributos como capacidad, distribución, precio por noche, servicios incluidos (WiFi, piscina, etc.) y fotografías.
*   **Particular (Guest):** Motor de búsqueda y reservas. Los clientes (con opción a estatus VIP) pueden filtrar inmuebles por ciudad, rango de fechas y relevancia, calcular importes totales, formalizar reservas mediante pasarela de pago simulada y dejar reseñas tras la estancia.

## 🛠️ Aspectos Técnicos Destacados

*   **Arquitectura Orientada a Objetos:** Diseño robusto encapsulando la lógica en clases bien definidas (Clientes, Inmuebles, Reservas, Tarjetas de Crédito).
*   **Gestión de Hilos (Multithreading):** Implementación de procesos concurrentes para asegurar la fluidez del sistema durante operaciones de carga o simulaciones de alta demanda.
*   **Interfaz Gráfica de Usuario (GUI):** Interfaz interactiva desarrollada nativamente en Java, con validación de formularios, menús de navegación dinámicos y manejo de excepciones en tiempo real.
*   **Control de Estado y Excepciones:** Prevención de *overbooking* (doble reserva en las mismas fechas) y validación estricta de formatos de datos (DNI, tarjetas, fechas).

## 💻 Stack Tecnológico
*   **Lenguaje:** Java
*   **Paradigma:** Object-Oriented Programming (OOP)
*   **Documentación:** JavaDoc estructurado.

## ⚙️ Estructura del Proyecto
El código fuente está organizado siguiendo el patrón de diseño clásico, separando la capa de vista (`Ventana`), la capa de negocio (`Clases`) y el almacenamiento de recursos (`Imagenes`).
