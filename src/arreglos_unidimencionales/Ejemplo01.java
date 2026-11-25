/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package arreglos_unidimencionales;

public class Ejemplo01 {

    public static void main(String[] args) {

        /* Una institución educativa puede utilizar un arreglo para almacenar las calificaciones de sus
        estudiantes y posteriormente calcular el promedio del grupo.*/
        double[] notas = {3.5, 4.0, 2.8, 4.5, 3.8};

        double suma = 0;

        for (int i = 0; i < notas.length; i++) {
            suma += notas[i];
        }

        double promedio = suma / notas.length;

        System.out.println("Promedio: " + promedio);
    }
}
