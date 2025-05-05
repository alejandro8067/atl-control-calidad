# atl-control-calidad
En este repositorio se encuentra el sistema de control de calidad.
---
# 🧼 Evaluador de Higiene y Seguridad Alimentaria (Consola Java)

Este programa permite realizar una **evaluación interna** en un entorno alimentario simulando un sistema de control de calidad. El usuario debe calificar distintas subcategorías según una ponderación específica. Al final, el programa calcula el porcentaje total y determina si aprueba o no el control de calidad.

---

## 🧩 Estructura del Programa

### 1. **Bienvenida al usuario**
Al iniciar, el sistema muestra un mensaje de bienvenida y explica los criterios de evaluación.

---

### 2. **Subcategorías evaluadas**

| N° | Subcategoría                              | Ponderación | Justificación                                                                 |
|----|--------------------------------------------|-------------|--------------------------------------------------------------------------------|
| 1  | Temperaturas de conservación y cocción     | 30%         | Esencial para prevenir proliferación bacteriana y evitar intoxicaciones.       |
| 2  | Manipulación de alimentos                  | 25%         | Evita contaminaciones cruzadas y asegura prácticas seguras desde el origen.    |
| 3  | Limpieza de utensilios y áreas comunes     | 20%         | Asegura que no haya vectores contaminantes indirectos.                         |
| 4  | Control de plagas                          | 15%         | Crítico para evitar infestaciones visibles y riesgos sanitarios mayores.       |
| 5  | Uso de guantes, gorros y uniformes         | 10%         | Refuerza la inocuidad, pero depende de una correcta manipulación previa.       |

---

### 3. **Evaluación**
El usuario debe ingresar un valor entre `0` y `1` por cada subcategoría.  
Por ejemplo:
- `1` → Cumplimiento total
- `0.5` → Cumplimiento parcial
- `0` → Incumplimiento

Cada valor ingresado se multiplica por su **ponderación** correspondiente.

---

### 4. **Resultado Final**
El sistema muestra el total acumulado en porcentaje y valida si se cumple con el **mínimo del 70%** para aprobar el control de calidad.

---

## 📌 Criterio de aprobación

El puntaje total debe ser **mayor o igual al 70%** para que la evaluación se considere aprobada.

---

## 🧪 Ejemplo de uso en consola

```bash
🧼 Bienvenido/a al Sistema de Evaluación Interna – Higiene y Seguridad Alimentaria

📋 A continuación se muestran las subcategorías y su ponderación:

1. Temperaturas de conservación y cocción - 30%
   → Esencial para prevenir proliferación bacteriana y evitar intoxicaciones.

2. Manipulación de alimentos - 25%
   → Evita contaminaciones cruzadas y asegura prácticas seguras desde el origen.

3. Limpieza de utensilios y áreas comunes - 20%
   → Asegura que no haya vectores contaminantes indirectos.

4. Control de plagas - 15%
   → Crítico para evitar infestaciones visibles y riesgos sanitarios mayores.

5. Uso de guantes, gorros y uniformes - 10%
   → Refuerza la inocuidad, pero depende de una correcta manipulación previa.

📌 Para aprobar el control de calidad, debe obtener al menos un 70%.

📝 Ingrese una evaluación entre 0 y 1 para cada subcategoría:
1. Temperaturas de conservación y cocción: 1
2. Manipulación de alimentos: 0.8
3. Limpieza de utensilios y áreas comunes: 0.9
4. Control de plagas: 1
5. Uso de guantes, gorros y uniformes: 1

✅ Evaluación final: 92.50%
🎉 ¡Aprobado! Cumple con el control de calidad.
