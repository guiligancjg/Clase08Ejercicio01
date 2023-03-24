package Descuentos;

import Clase08Ejercicio01.ItemCarrito;

public class DescuentoPorcentajeConTope extends Descuento{
    protected double descuentoConTope;

    public DescuentoPorcentajeConTope(double descuentoConTope) {
        this.descuentoConTope = descuentoConTope;
    }

    public DescuentoPorcentajeConTope(String descripcion, int unidades, int descuento) {
        super(descripcion, unidades, descuento);
    }


    public double descuentoTopeFijo(ItemCarrito productos){
        double precioMaximo = 30;
        double descuentoMaximo = precioMaximo * (this.descuentoConTope / 100);
        double descuento = productos.getPrecio() * productos.getCantidad() - descuentoMaximo;
        return descuento;
    }


}

