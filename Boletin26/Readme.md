# Operaciones con Números

Este proyecto contiene clases para realizar diversas operaciones con números utilizando Java.

## Clase Operaciones

La clase `Operaciones` proporciona métodos para realizar operaciones en una lista de números.

### Métodos

- `minimo(List<T> lista)`: Calcula el elemento mínimo de una lista.
- `maximo(List<T> lista)`: Calcula el elemento máximo de una lista.
- `buscar(List<T> lista, T objeto)`: Busca un objeto en una lista y devuelve su posición.
- `borrarPrimeraAparicion(List<T> lista, T objeto)`: Borra la primera aparición de un objeto dado en la lista.

## Clase Numero

La clase `Numero` representa una colección de números y proporciona un método para inicializarla.

### Métodos

- `iniciarArray()`: Inicializa la lista de números.

## Diagrama de Clases

El siguiente diagrama muestra la relación entre las clases en este proyecto:
```plantuml
@startuml

class Numero {
    - numeros: ArrayList<Integer>
    + iniciarArray(): void
}

class Operaciones<T extends Comparable<T>> {
    + minimo(List<T>): T
    + maximo(List<T>): T
    + buscar(List<T>, T): int
    + borrarPrimeraAparicion(List<T>, T): T
}

Numero -- Operaciones

@enduml
## Uso

Para utilizar las clases `Operaciones` y `Numero`, sigue estos pasos:

1. Crea una instancia de `Numero`.
2. Llama al método `iniciarArray()` para inicializar la lista de números.
3. Crea una instancia de `Operaciones` y utiliza sus métodos para realizar las operaciones deseadas en la lista de números.


