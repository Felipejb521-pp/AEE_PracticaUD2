# AEE – Práctica UD2: Programación multihilo en Java

Proyecto NetBeans (Java) de la Unidad 2 con dos ejercicios basados en hilos (`Thread`).

**Autor:** Felipe Jiménez Brioso

## Ejercicios

### `fabula` – La liebre y la tortuga
Simulación de una carrera entre dos hilos sobre una pista de 70 casillas:

- **`Tortuga`**: avance rápido (+3), resbalón (−6) o avance lento (+1) cada segundo.
- **`Liebre`**: duerme (2 s), gran salto (+9), resbalón grande (−12), pequeño salto (+1) o resbalón pequeño (−2).
- **`Carrera`** (clase principal): lanza ambos hilos, dibuja la posición de cada corredor (`T` y `L`) por consola y anuncia el ganador o el empate.

### `amigo` – Números amigos
Busca parejas de números amigos (la suma de los divisores propios de uno es igual al otro) hasta un número introducido por teclado.

- **`MuestraNumerosAmigo`** (clase principal): pide el límite y reparte el trabajo entre 5 hilos.
- **`Hilo`**: cada hilo comprueba los números `inicio, inicio+5, inicio+10, …` hasta el límite.

## Ejecución

Abrir el proyecto con NetBeans y ejecutar la clase principal deseada, o desde la terminal:

```bash
javac -d build/classes src/fabula/*.java src/amigo/*.java
java -cp build/classes fabula.Carrera
java -cp build/classes amigo.MuestraNumerosAmigo
```
