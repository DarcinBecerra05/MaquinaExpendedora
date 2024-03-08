package org.example;

import java.util.*;

public class MaquinaExpendedora {
    Scanner ingresarDatos = new Scanner(System.in);
    Cambio cambio = new Cambio();
    Validaciones validaciones = new Validaciones();
    CrearProducto crear = new CrearProducto();
    ArrayList<Productos> listaProductos;
    int codigo, pago;

    public void ingresarDatos() {

        try {
            int seguir = 0;
            while (seguir == 0) {
                System.out.println(" ");
                System.out.println("Ingrese el código del producto que desea comprar: ");
                validaciones.validarNumero(ingresarDatos);
                codigo = ingresarDatos.nextInt();

                listaProductos = crear.crearProducto();
                if (validaciones.ValidarproductoPresenteEnLista(codigo, listaProductos)) {
                    System.out.println("Ingrese el dinero para comprar el producto: ");
                    validaciones.validarNumero(ingresarDatos);
                    pago = ingresarDatos.nextInt();
                    if (!validaciones.validarCentimo(pago)) {
                        System.out.println("No puedo aceptar esta cantidad. Te la devuelvo para que lo intentes de nuevo " + pago);
                    } else {
                        cambio.calcularCambio(codigo, pago, listaProductos);
                    }

                } else {
                    System.err.println("El producto que ha seleccionado no existe. Por favor, seleccione otro producto ");
                    Thread.sleep(2000);
                    ingresarDatos();
                }
                System.out.println("0 te abre las puertas a más productos. Elige otro número para finalizar");
                validaciones.validarNumero(ingresarDatos);
                seguir = ingresarDatos.nextInt();
            }
        } catch (Exception e) {
            throw new RuntimeException(e);
        }

    }


    public void listarProductos() {
        System.out.println("                                        ¡BIENVENIDOS!                                           ");
        System.out.println(" ");
        System.out.println("\"Encuentra todo lo que necesitas. Ofrecemos una gran variedad de productos frescos y de calidad.\"");
        System.out.println(" ");
        System.out.println(" Cod " + " Nombre " + "     Cant  " + "   Precio \n");
        listaProductos = crear.crearProducto();
        for (Productos productos : listaProductos) {
            System.out.println(productos.toString());
        }
    }
}