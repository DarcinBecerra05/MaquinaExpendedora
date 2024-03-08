package org.example;
import java.util.ArrayList;
import java.util.Scanner;

public class Validaciones {

    public boolean validarNumero(Scanner scanner){
        try {
            if (!scanner.hasNextInt()) {
                System.out.println("No ha ingresado un número entero. Por favor, inténtelo de nuevo:");
                scanner.next();
                return validarNumero(scanner);
            }
            return true;
        } catch (Exception e) {
            throw new RuntimeException(e);
        }
    }
    public boolean ValidarproductoPresenteEnLista(int codigo, ArrayList<Productos> listaProductos) {
        for (Productos producto : listaProductos) {
            if (producto.getCodigo() == codigo) {
                System.out.println("El producto que ha elegido es:" + producto.getNombre());
                return true;
            }
        }
        return false;
    }
    public boolean validarCentimo(int centimo){
        int [] moneda={5,10,50,100,200};
        for (int mon : moneda){
            if (centimo==mon){
                return true;
            }
        }
        return false;
    }
    public boolean validarIngresoDinero(int codigo, int pago,  ArrayList<Productos> listaProductos){
        for (Productos producto : listaProductos) {
            if (producto.getCodigo() == codigo && pago >=  producto.getPrecio()) {
                return true;
            }
        }
        return false;
    }
    public int obtenerPrecio(int codigo, ArrayList<Productos> listaProductos){
        for (Productos producto : listaProductos) {
            if (producto.getCodigo() == codigo) {
                return producto.getPrecio();
            }
        }
        return 0;
    }
}
