package org.example;

import java.util.ArrayList;

public class Cambio {

    Validaciones validaciones= new Validaciones();
    public void calcularCambio(int codigo , int dineroPago , ArrayList<Productos> productos){
        if (validaciones.validarIngresoDinero(codigo, dineroPago,productos)){
            int precioProducto = validaciones.obtenerPrecio(codigo, productos);
             int cambio = dineroPago - precioProducto;
            if(cambio>0){
                System.out.println("Aquí tiene la devolución de su dinero, en efectivo: " + cambio);
            }else{
                System.out.println("¡Su satisfacción es nuestra mayor recompensa!");
            }
        }else {
            System.out.println("Lo siento, pero necesitas más dinero para continuar. Te devolvemos lo que has introducido " + dineroPago);
        }
    }
}

