Actividad 1 Y 2
# Calculadora Avanzada en Java

Aplicación de consola que implementa una calculadora con operaciones matemáticas básicas y avanzadas.  El programa presenta un menú interactivo donde el usuario puede elegir entre diferentes operaciones, ingresar dos números y obtener el resultado.

## 📋 Características

### Operaciones Disponibles

1. **Suma** - Calcula la suma de dos números
2. **Resta** - Calcula la diferencia entre dos números
3. **Multiplicación** - Calcula el producto de dos números
4. **División** - Calcula el cociente de dos números (con validación de división por cero)
5. **Potencia** - Calcula a elevado a la potencia b (a^b)
6. **Raíz** - Calcula la raíz de índice b del número a
7. **Logaritmo** - Calcula el logaritmo de a en base b
8. **Módulo** - Calcula el resto de la división de a entre b

### Funcionalidades Técnicas

- ✅ Validación de entradas (solo acepta números válidos)
- ✅ Manejo de excepciones (división por cero, logaritmos inválidos, etc.)
- ✅ Interfaz de consola interactiva
- ✅ Arquitectura modular con separación de responsabilidades
- ✅ Documentación completa con JavaDoc

## 🏗️ Estructura del Proyecto

```
src/
 └─ edu/
    └─ miguel/
       └─ gonzalez/
          └─ actividad2/
             ├─ proceso/
             │   ├─ Operacion.java          # Interfaz base
             │   ├─ Suma.java                # Operación de suma
             │   ├─ Resta.java               # Operación de resta
             │   ├─ Multiplicacion.java      # Operación de multiplicación
             │   ├─ Division.java            # Operación de división
             │   ├─ Potencia.java            # Operación de potencia
             │   ├─ Raiz.java                # Operación de raíz
             │   ├─ Logaritmo.java           # Operación de logaritmo
             │   └─ Modulo.java              # Operación de módulo
             ├─ ui/
             │   └─ CalculadoraUI. java       # Interfaz de usuario
             └─ Main.java                    # Clase principal
```

### Descripción de Packages

#### 📦 `edu.miguel.gonzalez.actividad2.proceso`

Contiene toda la lógica de negocio de la calculadora.  Implementa el **patrón Strategy** mediante:

- **`Operacion`** (interfaz): Define el contrato para todas las operaciones matemáticas
- **Clases de operación**:  Cada operación matemática está implementada en su propia clase, permitiendo fácil extensión y mantenimiento

#### 📦 `edu.miguel.gonzalez.actividad2.ui`

Gestiona la interacción con el usuario:

- **`CalculadoraUI`**: Muestra el menú, valida entradas, ejecuta operaciones y presenta resultados


## 💻 Ejemplo de Uso

```
===== CALCULADORA AVANZADA =====
1. Sumar
2. Restar
3. Multiplicar
4. Dividir
5. Potencia
6. Raíz
7. Logaritmo
8. Módulo
0. Salir
Elija una opción:  5
Ingrese el primer número: 2
Ingrese el segundo número:  8
El resultado de la potencia es: 256.0
```

## 🛠️ Tecnologías Utilizadas

- **Lenguaje**:  Java
- **Documentación**: JavaDoc

## 📝 Documentación JavaDoc

El proyecto incluye documentación completa en formato JavaDoc para todas las clases y métodos públicos. Para generar la documentación HTML:

## 👨‍💻 Autor

Miguel Alexandro González Arellano - Actividad 2

## 📄 Licencia

Usa esto si quieres.
=======
# Actividad 1: Venta de Vehículos - CLI

Este proyecto es una aplicación de línea de comandos (CLI) desarrollada en Java que simula la venta de vehículos en una concesionaria. Permite al usuario visualizar los vehículos disponibles, seleccionar uno o más vehículos para comprar, y generar un ticket de venta con un resumen de la transacción.

## Funcionalidades

1. **Mostrar inventario de vehículos**: El programa muestra una lista de vehículos con su marca, modelo, año y precio.
2. **Seleccionar vehículos**: El usuario puede elegir uno o más vehículos disponibles para la compra.
3. **Ingresar nombre del cliente**: El programa solicita el nombre del cliente para incluirlo en el ticket.
4. **Generar ticket de venta**: Incluye el total a pagar, la fecha de la transacción y los detalles de los vehículos seleccionados.

## Ejecución

### Requisitos previos
- Tener instalado [Java](https://www.java.com/) en su máquina.
- Un editor de texto o IDE para trabajar con archivos Java.

### Pasos para ejecutar

1. **Clonar el repositorio**:
   ```bash
   git clone https://github.com/dantereach/POO2026.git
   ```
2. **Ir al directorio del proyecto**:
   ```bash
   cd POO2026
   ```
3. **Compilar el archivo**:
   ```bash
   javac VentaVehiculosCLI.java
   ```
4. **Ejecutar el programa**:
   ```bash
   java VentaVehiculosCLI
   ```

## Estructura del programa

El programa se centra en tres partes principales:
1. **Clase `Vehiculo`**: Representa cada vehículo en el inventario. Contiene atributos como `marca`, `modelo`, `año` y `precio`.
2. **Clase `Ticket`**: Gestiona los detalles de la transacción como cliente, lista de vehículos comprados, fecha de la transacción y el total a pagar.
3. **Clase principal**: Contiene el método `main` para interactuar con el usuario mediante la línea de comandos:
   - Muestra los vehículos disponibles.
   - Permite seleccionar vehículos.
   - Solicita el nombre del cliente.
   - Genera y muestra el ticket.

## Ejemplo de ejecución

```
=== Bienvenido a la Concesionaria ===
Lista de Vehículos Disponibles:
1. Toyota Corolla (2023) - $25000.0
2. Honda Civic (2022) - $24000.0
3. Ford Focus (2021) - $20000.0
4. Chevrolet Malibu (2023) - $28000.0

Seleccione el número del vehículo que desea (o escriba 'fin' para terminar): 1
Vehículo añadido: Toyota Corolla (2023) - $25000.0

Seleccione el número del vehículo que desea (o escriba 'fin' para terminar): 3
Vehículo añadido: Ford Focus (2021) - $20000.0

Seleccione el número del vehículo que desea (o escriba 'fin' para terminar): fin

Por favor, ingrese su nombre: Juan Pérez

=== Ticket de Venta ===
Cliente: Juan Pérez
Fecha: 2026-01-18 12:34:56

Vehículos:
- Toyota Corolla (2023) - $25000.0
- Ford Focus (2021) - $20000.0

Total a pagar: $45000.0
```

## Contribución

Si deseas mejorar el proyecto o corregir algún error, eres bienvenido a contribuir. Por favor sigue estos pasos:
1. Haz un fork del proyecto.
2. Crea una nueva rama (`git checkout -b feature/nueva-caracteristica`).
3. Haz tus cambios y realiza un commit (`git commit -m "Añadida nueva funcionalidad"`).
4. Envía tus cambios a tu repositorio (`git push origin feature/nueva-caracteristica`).
5. Crea un Pull Request en este repositorio.

## Licencia

Este proyecto está bajo la licencia de poder hacer lo que quieras lol.

## Autor

Desarrollado por [dantereach](https://github.com/dantereach).
 main
