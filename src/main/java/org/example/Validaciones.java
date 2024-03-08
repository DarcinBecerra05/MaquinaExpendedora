package org.example;
import java.util.ArrayList;
import java.util.Scanner;

public class Validaciones {

    public boolean validarDenominacionMoneda(Scanner scanner){
        try {
            if (!scanner.hasNextInt()) {
                System.err.println("No ha ingresado un número entero. Por favor, inténtelo de nuevo:");
                scanner.next();
                return validarDenominacionMoneda(scanner);
            }
            return true;
        } catch (Exception e) {
            throw new RuntimeException(e);
        }
    }
    public boolean ValidarProductoPresenteEnLista(int codigo, ArrayList<Productos> listaProductos) {
        for (Productos producto : listaProductos) {
            if (producto.getCodigo() == codigo) {
                System.out.println("El producto que ha elegido es:" + producto.getNombre());
                return true;
            }
        }
        return false;
    }
    public boolean ValidarDenominacionLimiteMoneda(int moneda){
        int [] monedas={5,10,50,100,200};
        for (int mon : monedas){
            if (moneda==mon){
                return true;
            }
        }
        return false;
    }
    public boolean validarCantidadDinero(int codigo, int pago,  ArrayList<Productos> listaProductos){
        for (Productos producto : listaProductos) {
            if (producto.getCodigo() == codigo && pago >=  producto.getPrecio()) {
                return true;
            }
        }
        return false;
    }
    public int obtenerPrecioProducto(int codigo, ArrayList<Productos> listaProductos){
        for (Productos producto : listaProductos) {
            if (producto.getCodigo() == codigo) {
                return producto.getPrecio();
            }
        }
        return 0;
    }
}
