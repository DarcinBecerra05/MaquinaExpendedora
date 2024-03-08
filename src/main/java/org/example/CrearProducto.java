package org.example;
import java.util.ArrayList;
import org.example.Productos;

public class CrearProducto {


    public ArrayList<Productos> crearProducto() {
        ArrayList<Productos> listaProductos = new ArrayList<>();
        Productos p1 = new Productos(1, "  Chocorramo    ", 8, 50);
        Productos p2 = new Productos(2, "  Coca-cola     ", 5, 10);
        Productos p3 = new Productos(3, "  Chocolatina   ", 3, 50);
        Productos p4 = new Productos(4, "  Coffe Express ", 1, 100);
        Productos p5 = new Productos(5, "  Yogurt        ", 7, 200);
        listaProductos.add(p1);
        listaProductos.add(p2);
        listaProductos.add(p3);
        listaProductos.add(p4);
        listaProductos.add(p5);
        return listaProductos;
    }

}
