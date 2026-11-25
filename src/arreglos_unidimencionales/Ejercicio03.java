/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package arreglos_unidimencionales;

import java.util.Scanner;

/**
 *
 * @author User
 */
public class Ejercicio03 {

    public static void main(String[] args) {

        /* Una tienda necesita registrar cinco productos y consultar su inventario durante la ejecución del programa.
7. Cree dos arreglos paralelos: String[] nombres e int[] cantidades, ambos de cinco posiciones.
8. Registre el nombre y la cantidad de cada producto. No permita cantidades negativas.
9. Muestre un listado numerado con el nombre y la cantidad disponible de cada producto.
10. Calcule y muestre el total de unidades almacenadas.
11. Solicite el nombre de un producto a buscar y muestre su cantidad si existe; si no existe, informe que no fue
encontrado. La búsqueda debe ignorar diferencias entre mayúsculas y minúsculas.
Caso de prueba sugerido: Arroz (10), Leche (5), Pan (12), Huevos (30), Café (8). Total esperado: 65 unidades.
Buscar «pan» debe mostrar 12 unidades. */
        Scanner sc = new Scanner(System.in);

        String[] Nombre_Producto = new String[5];
        int[] Cant_productos = new int[5];

        int total_cantidad_prod = 0;
        boolean encontrado = false;
        String buscar;

        for (int i = 0; i < Nombre_Producto.length; i++) {

            System.out.println("Ingrese el nombre del producto: " + (i + 1));
            Nombre_Producto[i] = sc.nextLine();

            System.out.println("Ingrese la cantidad ");
            Cant_productos[i] = sc.nextInt();
            sc.nextLine();

            while (Cant_productos[i] < 0) {

                System.out.print("Cantidad invalida. Ingrese nuevamente: ");
                Cant_productos[i] = sc.nextInt();
                sc.nextLine();
            }

        }

        for (int i = 0; i < 5; i++) {

            System.out.println((i + 1) + ". " + Nombre_Producto[i] + " - Cantidad: " + Cant_productos[i]);
            total_cantidad_prod = total_cantidad_prod + Cant_productos[i];

        }

        System.out.println("Total de productos: " + total_cantidad_prod);
        
         // Buscar producto
        System.out.print("\nIngrese el producto que desea buscar: ");
        buscar = sc.nextLine();

        for (int i = 0; i < 5; i++) {

            if (Nombre_Producto[i].equalsIgnoreCase(buscar)) {

                System.out.println("Producto encontrado: " + Nombre_Producto[i]);
                System.out.println("Cantidad disponible: " + Cant_productos[i]);

                encontrado = true;
            }
        }

        if (encontrado == false) {
            System.out.println("Producto no encontrado.");
        }

    }
}
