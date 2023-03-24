package Clase08Ejercicio01;

import Descuentos.DescuentoPorcentajeConTope;

import java.util.ArrayList;

public class CarritoCompra extends DescuentoPorcentajeConTope{
    private ArrayList<ItemCarrito> productos;

    public CarritoCompra(double descuentoConTope, ArrayList<ItemCarrito> productos) {
        super(descuentoConTope);
        this.productos = productos;
    }

    public double CarritoPrecio(){
        double total = 0;
        for (ItemCarrito item: productos) {
            total += item.precio();
        }
        return total;
    }

    public double DescPorcentajeFijoTotal (){
        double precioMaximo = 30;
        double descuentoMaximo = precioMaximo * (this.descuentoConTope / 100);
        double total = 0;

        for (ItemCarrito item: productos) {
            total += item.getPrecio() * item.getCantidad() - descuentoMaximo;
        }
        return total;
    }
}
