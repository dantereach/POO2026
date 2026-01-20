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