/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package arreglos_unidimencionales;

import java.util.Locale;
import java.util.Scanner;

/**
 *
 * @author User
 */
public class Ejercicio02 {

    public static void main(String[] args) {

        /* Una coordinación académica necesita registrar las calificaciones
        definitivas de seis estudiantes y obtener un
resumen del grupo.
1. Declare un arreglo double de seis posiciones.
2. Solicite las seis notas mediante Scanner y almacénelas en el arreglo. Valide que cada nota esté entre 0.0 y 5.0;
si no lo está, vuelva a solicitarla sin avanzar de posición.
3. Muestre las seis notas, identificadas como Estudiante 1, Estudiante 2, etc.
4. Calcule y muestre el promedio del grupo con dos decimales.
5. Identifique y muestre la nota mayor y la menor.
6. Cuente cuántos estudiantes aprobaron (nota >= 3.0) y cuántos reprobaron (nota < 3.0).
Caso de prueba obligatorio: 4.0, 2.5, 3.5, 5.0, 1.5, 3.0. Resultados esperados: promedio 3.25; mayor 5.0; menor
1.5; aprobados 4; reprobados 2. */
        double[] calificaciones = new double[6];
        double promedio;
        double suma = 0;
        double mayor = 0;
        double menor = 0;
        int aprobaron = 0;
        int reprobaron = 0;

        Scanner sc = new Scanner(System.in);

        // solicitar las notas
        for (int i = 0; i < calificaciones.length; i++) {

            do {

                System.out.println("Ingrese la nota del estudiante " + (i + 1));
                calificaciones[i] = sc.nextDouble();

                if (calificaciones[i] < 0 || calificaciones[i] > 5) {

                    System.out.println("Nota invalida. Ingrese una nota entre 0.0 y 5.0");

                }

            } while (calificaciones[i] < 0 || calificaciones[i] > 5);

            // suma cada una de las calificaciones
            suma = suma + calificaciones[i];

        }
        for (int i = 0; i < calificaciones.length; i++) {

            System.out.println("Estuduante " + (i + 1) + ": " + calificaciones[i]);
        }

        // hollar promedio
        promedio = suma / calificaciones.length;

        System.out.printf(Locale.US, "\nPromedio del grupo: %.2f%n", promedio);

        // identificar la mayor y menor nota
        mayor = calificaciones[0];
        menor = calificaciones[0];
        for (int i = 0; i < calificaciones.length; i++) {

            if (calificaciones[i] > mayor) {

                mayor = calificaciones[i];

            }

            if (calificaciones[i] < menor) {

                menor = calificaciones[i];

            }
        }
        System.out.println("La mayor calificacion es: " + mayor);
        System.out.println("La menor calificacion es: " + menor);

        for (int i = 0; i < calificaciones.length; i++) {

            if (calificaciones[i] >= 3.0) {

                aprobaron++;
            } else {

                reprobaron++;
            }
        }

        System.out.println("la cantidad de estudiantes que aprobaron fueron: " + aprobaron);
        System.out.println("la cantidad de estudiantes que aprobaron fueron: " + reprobaron);

    }
}
