# Sistema de Ventas de Vehículos

Sistema de ventas desarrollado en Java para una concesionaria de vehículos. Permite gestionar el inventario, seleccionar vehículos y generar tickets de venta con interfaz CLI (línea de comandos).

## Autor
Miguel Alexandro Gonzalez Arellano

## Descripción del Proyecto

Este proyecto implementa un sistema completo de ventas de vehículos que incluye:

- **Gestión de inventario**: Visualización de vehículos disponibles
- **Selección de vehículos**: El usuario puede seleccionar uno o más vehículos
- **Validación de entradas**: Validación completa de todas las entradas del usuario
- **Generación de tickets**: Tickets con nombre del cliente, fecha automática del sistema y total a pagar

## Estructura del Proyecto

```
POO2026/
├── src/
│   ├── Vehiculo.java        # Clase para representar un vehículo
│   ├── Ticket.java          # Clase para generar tickets de venta
│   ├── Concesionaria.java   # Clase para gestionar el inventario
│   └── SistemaVentas.java   # Clase principal con CLI
├── .gitignore
└── README.md
```

## Clases Implementadas

### 1. Vehiculo
Representa un vehículo con los siguientes atributos:
- `marca`: Marca del vehículo
- `modelo`: Modelo del vehículo
- `anio`: Año de fabricación
- `precio`: Precio del vehículo

### 2. Ticket
Genera tickets de venta con:
- Nombre del cliente
- Fecha y hora de la transacción (automática)
- Lista de vehículos comprados
- Total a pagar (calculado automáticamente)

### 3. Concesionaria
Administra el inventario de vehículos:
- Inicializa el inventario con vehículos de ejemplo
- Muestra el inventario de forma visual
- Permite obtener vehículos por índice
- Valida índices de vehículos

### 4. SistemaVentas
Clase principal que implementa la interfaz CLI:
- Muestra el menú de bienvenida
- Permite la selección de vehículos
- Solicita y valida el nombre del cliente
- Genera y muestra el ticket de venta

## Compilación

Para compilar el proyecto:

```bash
cd src
javac *.java
```

## Ejecución

Para ejecutar el sistema:

```bash
cd src
java SistemaVentas
```

## Flujo de Uso

1. **Bienvenida**: El sistema muestra un mensaje de bienvenida
2. **Inventario**: Se muestra el inventario completo de vehículos disponibles
3. **Selección**: El usuario selecciona vehículos ingresando el número correspondiente
   - Ingrese `0` para finalizar la selección
   - El sistema valida que el número sea válido
4. **Cliente**: El sistema solicita el nombre del cliente
   - Valida que no esté vacío
   - Valida que tenga al menos 2 caracteres
   - Valida que solo contenga letras y espacios
5. **Ticket**: Se genera y muestra el ticket con todos los detalles

## Ejemplo de Ejecución

```
========================================
  SISTEMA DE VENTAS DE VEHÍCULOS
========================================

========================================
   INVENTARIO DE VEHÍCULOS DISPONIBLES
========================================

1. Toyota Corolla (2023) - $25000.00
2. Honda Civic (2023) - $27000.00
3. Ford Mustang (2022) - $45000.00
...

Ingrese el número del vehículo que desea comprar (o 0 para finalizar): 1
✓ Vehículo agregado: Toyota Corolla (2023) - $25000.00
Total de vehículos seleccionados: 1

Ingrese el número del vehículo que desea comprar (o 0 para finalizar): 0

Ingrese el nombre del cliente: Juan Perez

========================================
         TICKET DE VENTA
========================================
Cliente: Juan Perez
Fecha: 15/01/2026 16:28:39
----------------------------------------
Vehículos comprados:

1. Toyota Corolla (2023) - $25000.00
----------------------------------------
TOTAL A PAGAR: $25000.00
========================================

¡Gracias por su compra!
```

## Validaciones Implementadas

### Selección de Vehículos
- ✓ Valida que el número ingresado sea un entero
- ✓ Valida que el número esté dentro del rango del inventario
- ✓ Permite seleccionar múltiples vehículos
- ✓ Permite finalizar con 0

### Nombre del Cliente
- ✓ Valida que no esté vacío
- ✓ Valida longitud mínima de 2 caracteres
- ✓ Valida que solo contenga letras (incluye acentos y ñ) y espacios
- ✓ No permite números ni caracteres especiales

## Características Destacadas

- **Programación Orientada a Objetos**: Uso apropiado de clases y encapsulación
- **Interfaz de Usuario Amigable**: Mensajes claros y formato visual atractivo
- **Validación Robusta**: Manejo de errores y validación completa de entradas
- **Fecha Automática**: Usa `LocalDateTime` para obtener la fecha del sistema
- **Código Documentado**: Javadoc en todas las clases y métodos públicos
- **Formato Profesional**: Tickets con formato profesional y fácil de leer

## Requisitos

- Java Development Kit (JDK) 8 o superior
- Sistema operativo: Windows, Linux o macOS

## Curso

Programación Orientada a Objetos 2026 (POO2026)
