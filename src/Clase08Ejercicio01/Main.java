package Clase08Ejercicio01;

import Descuentos.DescuentoPorcentajeConTope;
import java.util.ArrayList;


public class Main {

 /* 1. Modifique el ejercicio del carrito de la clase 5-7, para tener una cantidad ilimitada de
    ítems. Verifique que cuando lea un archivo pueda leer items de cualquier tamaño.

    ** Cantidad ilimitada de ítems se uso la clase "ArrayList".
    ** Para leer items de cualquier tamaño, se uso la Clase "BufferedReader" en la Clase LeerArchivo.
  */



    public static void main(String[] args) {
        String nombreArchivo = "src/Clase08Ejercicio01/productos.txt";
        ArrayList<ItemCarrito> items = new LeerArchivo(nombreArchivo).leerProductos();
        CarritoCompra carrito = new CarritoCompra(20,items);

        System.out.println("---El descuento fijo se limito a un máximo de $30 con un porcentaje del 20%---");
        System.out.println("");
        System.out.println("Registros\t-cant\t-precioUnitario\t\t-Descuento del 20%\t\t\t-producto");

        for (ItemCarrito item : items){
            System.out.println("\t" + item.getIdItems() + "\t\t\t" +
                            item.getCantidad() + "\t\t\t$" +
                            item.getPrecio() + "\t\t\t\t$" +
                            carrito.descuentoTopeFijo(item) + "\t\t\t\t" +
                            item.getNombre());
        }

        System.out.println("");
        System.out.println("Total a Pagar del Carrito: $" + carrito.DescPorcentajeFijoTotal());
    }
}
