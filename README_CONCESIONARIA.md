# Sistema de Ventas - Concesionaria

## Descripción
Programa en Java que permite a los usuarios gestionar ventas de vehículos en una concesionaria. El sistema muestra un inventario de vehículos, permite seleccionar uno o más vehículos, solicita información del cliente y genera un ticket de venta.

## Estructura del Proyecto

El programa está organizado en los siguientes paquetes:

- **Data**: Contiene las clases de entidades principales
  - `Vehiculo.java`: Representa un vehículo con marca, modelo, año y precio
  - `Ticket.java`: Representa el ticket de venta con información del cliente, vehículos comprados, fecha y total

- **Proceso**: Contiene la lógica del negocio
  - `InventarioManager.java`: Gestiona el inventario de vehículos
  - `TicketGenerator.java`: Genera y muestra tickets de venta

- **Ui**: Contiene la interfaz de usuario
  - `ConsoleUI.java`: Maneja la interacción con el usuario a través de la línea de comandos

- **Main.java**: Punto de entrada del programa

## Características

- ✓ Inventario predefinido con 8 vehículos diferentes
- ✓ Selección múltiple de vehículos
- ✓ Validación de entradas del usuario
- ✓ Cálculo automático del total
- ✓ Generación de fecha automática
- ✓ Interfaz de línea de comandos (CLI) amigable

## Compilación

Para compilar el programa, ejecuta el siguiente comando desde el directorio `src`:

```bash
javac Main.java Data/*.java Proceso/*.java Ui/*.java
```

## Ejecución

Para ejecutar el programa, usa el siguiente comando desde el directorio `src`:

```bash
java Main
```

## Flujo de Uso

1. El programa muestra el inventario completo de vehículos disponibles
2. El usuario ingresa el ID del vehículo que desea comprar
3. El usuario puede seguir agregando más vehículos o ingresar `0` para terminar la selección
4. El sistema solicita el nombre del cliente
5. Se genera y muestra el ticket de venta con:
   - Fecha y hora de la transacción
   - Nombre del cliente
   - Lista de vehículos comprados con sus precios
   - Total a pagar

## Ejemplo de Uso

```
========================================
    INVENTARIO DE VEHÍCULOS
========================================

ID: 1 | Toyota Corolla (2023) - $25000.00
ID: 2 | Honda Civic (2023) - $27000.00
...

Ingrese el ID del vehículo que desea comprar (o 0 para terminar): 1
✓ Vehículo agregado: Toyota Corolla
Ingrese el ID del vehículo que desea comprar (o 0 para terminar): 3
✓ Vehículo agregado: Ford Mustang
Ingrese el ID del vehículo que desea comprar (o 0 para terminar): 0

Ingrese el nombre del cliente: Juan Perez

========================================
          TICKET DE VENTA
========================================
Fecha: 15/01/2026 17:16:41
Cliente: Juan Perez
----------------------------------------
Vehículos comprados:

  • Toyota Corolla (2023)
    Precio: $25000.00

  • Ford Mustang (2023)
    Precio: $45000.00

----------------------------------------
TOTAL A PAGAR: $70000.00
========================================
```

## Validaciones

El programa incluye validación para:
- IDs de vehículos inválidos
- Entradas no numéricas
- Nombres de cliente vacíos

## Autor
Miguel Alexandro Gonzalez Arellano
