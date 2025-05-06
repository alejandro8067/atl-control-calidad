import java.util.Scanner;

public class ControlCalidad {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        String[] subcategorias = {
                "Temperaturas de conservación y cocción",
                "Manipulación de alimentos",
                "Limpieza de utensilios y áreas comunes",
                "Control de plagas",
                "Uso de guantes, gorros y uniformes"
        };

        String[] justificaciones = {
                "Esencial para prevenir proliferación bacteriana y evitar intoxicaciones.",
                "Evita contaminaciones cruzadas y asegura prácticas seguras desde el origen.",
                "Asegura que no haya vectores contaminantes indirectos.",
                "Crítico para evitar infestaciones visibles y riesgos sanitarios mayores.",
                "Refuerza la inocuidad, pero depende de una correcta manipulación previa."
        };

        double[] ponderaciones = {30, 25, 20, 15, 10};
        double total = 0;

        System.out.println("🧼 Bienvenido/a al Sistema de Evaluación Interna – Higiene y Seguridad Alimentaria\n");
        System.out.println("📋 A continuación se muestran las subcategorías y su ponderación:\n");

        for (int i = 0; i < subcategorias.length; i++) {
            System.out.printf("%d. %s - %.0f%%\n   → %s\n\n", i + 1, subcategorias[i], ponderaciones[i], justificaciones[i]);
        }

        System.out.println("📌 Para aprobar el control de calidad, debe obtener al menos un 70%.\n");
        System.out.println("📝 Ingrese una evaluación entre 0 y 1 para cada subcategoría (Ej: 1 = cumple, 0,5 = parcial, 0 = no cumple):\n");
        System.out.println("!! Recordar ingresar los números decimales con coma y no con punto. Ejemplo correcto: 0,7\n");

        System.out.println("Ingresar evaluaciones: \n");
        for (int i = 0; i < subcategorias.length; i++) {
            System.out.print((i + 1) + ". " + subcategorias[i] + ": ");
            double valor = scanner.nextDouble();
            total += valor * ponderaciones[i];
        }

        System.out.printf("\n✅ Evaluación final: %.2f%%\n", total);

        if (total >= 90) {
            System.out.println("🎉 ¡Aprobado! Cumple con el control de calidad.");
        } else {
            System.out.println("❌ No aprobado. No cumple con el mínimo requerido para el control de calidad.");
        }

        scanner.close();
    }
}
