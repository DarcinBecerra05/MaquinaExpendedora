package org.example;

import java.util.*;

public class MaquinaExpendedora {
    private Scanner ingresarDatos = new Scanner(System.in);
    private Cambio cambio = new Cambio();
    private Validaciones validaciones = new Validaciones();
    private static CrearProducto crear = new CrearProducto();
    private static ArrayList<Productos> listaProductos;
    int codigo, pago;

    public void ingresarDatos() {
        listarProductos();
        try {
            int seguir = 0;
            while (seguir == 0) {
                System.out.println(" ");
                System.out.println("Ingrese el código del producto que desea comprar: ");
                validaciones.validarDenominacionMoneda(ingresarDatos);
                codigo = ingresarDatos.nextInt();


                if (validaciones.ValidarProductoPresenteEnLista(codigo, listaProductos)) {
                    System.out.println("Ingrese el dinero para comprar el producto: ");
                    validaciones.validarDenominacionMoneda(ingresarDatos);
                    pago = ingresarDatos.nextInt();
                    if (!validaciones.ValidarDenominacionLimiteMoneda(pago)) {
                        System.err.println("Debe ingresar una moneda válida para continuar. Dinero devuelto: " + pago + " \nIntentalo nuevamente ");
                        Thread.sleep(4000);
                        ingresarDatos();
                    } else {
                        if(!cambio.calcularCambio(codigo, pago, listaProductos)){
                            ingresarDatos();
                        }

                    }

                } else {
                    System.err.println("El producto que ha seleccionado no existe. Por favor, seleccione otro producto ");
                    Thread.sleep(2000);
                    ingresarDatos();
                }

                Thread.sleep(2000);
                System.out.println("Presiona 1 para apagar la Máquina. \nCualquier otro número para continuar");
                validaciones.validarDenominacionMoneda(ingresarDatos);
                seguir = ingresarDatos.nextInt();
                if (seguir !=  1){
                    Thread.sleep(2000);
                    ingresarDatos();
                }
            }
        } catch (Exception e) {
            throw new RuntimeException(e);
        }

    }


    public static void listarProductos() {
        System.out.println("                                        ¡BIENVENIDOS!                                           ");
        System.out.println(" ");
        System.out.println("\"Encuentra todo lo que necesitas. Ofrecemos una gran variedad de productos frescos y de calidad.\"");
        System.out.println(" ");
        System.out.println(" Cod " + " Nombre " + "     Cant  " + "   Precio \n");
        MaquinaExpendedora.listaProductos = crear.crearProducto();
        for (Productos productos : listaProductos) {
            System.out.println(productos.toString());
        }
    }
}