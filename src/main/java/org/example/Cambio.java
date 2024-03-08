package org.example;

import java.util.ArrayList;

public class Cambio {

    Validaciones validaciones= new Validaciones();
    public boolean calcularCambio(int codigo , int dineroPago , ArrayList<Productos> productos){
        if (validaciones.validarCantidadDinero(codigo, dineroPago,productos)){
            int precioProducto = validaciones.obtenerPrecioProducto(codigo, productos);
             int cambio = dineroPago - precioProducto;
            if(cambio>0){
                System.out.println("¡Su compra fue exitosa.!" +"\n Sus vueltas son : " + cambio  );
                return true;
            }else{
                System.out.println("¡Compra Exitosa!");
                return true;
            }
        }else {
            System.err.println("Lo siento, pero necesitas más dinero para continuar. Te devolvemos lo que has introducido " + dineroPago);
            return false;
        }
    }

}

