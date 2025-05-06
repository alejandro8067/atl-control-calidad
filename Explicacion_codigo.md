# 🧼 Sistema de Evaluación de Control de Calidad

Este programa en Java permite evaluar una serie de criterios de higiene y seguridad alimentaria. A través de una interfaz de consola, el usuario ingresa evaluaciones para diferentes subcategorías, y el programa calcula un resultado ponderado para determinar si se aprueba el control de calidad.

---

## 🧠 Explicación del Código Java – Paso a Paso

A continuación se explican las partes clave del código, organizadas en 15 pasos.

---

### 1. Definición de la clase principal
```java
public class ControlCalidad {
```
Se define la clase principal llamada `ControlCalidad`, que contiene el método principal `main`.

---

### 2. Método principal `main`
```java
public static void main(String[] args) {
```
Es el punto de inicio de ejecución del programa.

---

### 3. Crear el objeto `Scanner`
```java
Scanner scanner = new Scanner(System.in);
```
Se crea un objeto `Scanner` para capturar entradas del usuario desde la consola.

---

### 4. Mostrar mensaje de bienvenida
```java
System.out.println("🧼 Bienvenido/a al Sistema de Evaluación Interna...");
```
Se imprime un mensaje amigable de introducción al programa.

---

### 5. Mostrar subcategorías y explicaciones
```java
System.out.println("📋 A continuación se muestran las subcategorías...");
```
Se listan las subcategorías de evaluación, cada una con su ponderación y una breve justificación.

---

### 6. Recordatorio del criterio de aprobación
```java
System.out.println("📌 Para aprobar el control de calidad, debe obtener al menos un 70%");
```
Se indica claramente cuál es el puntaje mínimo necesario para aprobar.

---

### 7. Arreglo de ponderaciones
```java
double[] ponderaciones = {0.30, 0.25, 0.20, 0.15, 0.10};
```
Contiene los valores de peso (en formato decimal) para cada subcategoría. Por ejemplo, 30% es `0.30`.

---

### 8. Arreglo con nombres de las categorías
```java
String[] categorias = {
  "Temperaturas de conservación y cocción",
  "Manipulación de alimentos",
  "Limpieza de utensilios y áreas comunes",
  "Control de plagas",
  "Uso de guantes, gorros y uniformes"
};
```
Define los nombres de las subcategorías que se evaluarán.

---

### 9. Variable para acumular el resultado
```java
double resultadoFinal = 0;
```
Esta variable irá acumulando la suma ponderada de cada subcategoría evaluada.

---

### 10. Bucle para recorrer cada subcategoría
```java
for (int i = 0; i < categorias.length; i++) {
```
Un bucle `for` que recorre todas las categorías para pedir al usuario una calificación por cada una.

---

### 11. Solicitud de evaluación al usuario
```java
System.out.print((i+1) + ". " + categorias[i] + ": ");
double valor = scanner.nextDouble();
```
Pide al usuario que ingrese una calificación entre 0 y 1.

---

### 12. Cálculo del valor ponderado
```java
resultadoFinal += valor * ponderaciones[i];
```
Multiplica la calificación ingresada por su ponderación y la suma al resultado final.

---

### 13. Convertir a porcentaje
```java
resultadoFinal *= 100;
```
Una vez terminadas las evaluaciones, el resultado final se convierte a porcentaje.

---

### 14. Mostrar el resultado en pantalla
```java
System.out.printf("✅ Evaluación final: %.2f%%\n", resultadoFinal);
```
Se imprime el resultado con dos cifras decimales usando `printf`.

---

### 15. Validación del resultado
```java
if (resultadoFinal >= 90) {
  System.out.println("🎉 ¡Aprobado! Cumple con el control de calidad.");
} else {
  System.out.println("❌ No aprobado. No cumple con el control de calidad.");
}
```
Si el resultado es 70 o mayor, se aprueba; de lo contrario, no.

---
