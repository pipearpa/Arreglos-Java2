/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package arreglos_unidimencionales;


public class Ejemplo02 {
    
    public static void main(String[] args) {
        
        /* Una tienda puede utilizar un arreglo para almacenar las cantidades disponibles de
        diferentes productos y controlar sus existencias. */
        
        int[] productos = {20, 15, 30, 10, 25};
        
        
        for (int i = 0; i < productos.length; i++) {
            
            System.out.println("Unidades disponibles: " + productos[i]);
        }
        
    }
}
