/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package t6c;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;
import java.util.List;

/**
 *
 * @author noelia
 */
public class MiTienda {

    public static void main(String[] args) {

        List<Producto> listaProductos = new ArrayList<>();

        listaProductos.add(new LibroPapel(500, "100", "01",
                16, "Monty en el campo de flores", 4));
        listaProductos.add(new LibroDigital(4488, "101", "02",
                6, "Adi la gorda", 21));
        listaProductos.add(new Pantalon("L", "Parfois", "03",
                36, "Material: lino, lavar en máquina máximo 30º", 21));
        listaProductos.add(new Musica("Jungle", "04",
                12, "Loving in Stereo", 21));
        listaProductos.add(new LibroPapel(205, "102", "05",
                20, "Luna de Plutón", 4));
        listaProductos.add(new LibroDigital(4488, "103", "06",
                7, "Tengo sueño", 21));
        listaProductos.add(new Pantalon("40", "HM", "07",
                25, "Material: vaquero", 21));
        listaProductos.add(new Musica("The Foals", "08",
                15, "  ", 21));

        for (Producto p : listaProductos) {
            System.out.println(p);
        }

        Comparator<Producto> criterioPrecio = (p1, p2) -> Double.compare(p1.getPrecio(), p2.getPrecio());
        Collections.sort(listaProductos, criterioPrecio);

        System.out.println("------------Ordenado por precio-----------");
        for (Producto p : listaProductos) {
            System.out.println(p);
        }

        Comparator<Producto> criterioCodigo = (p1, p2) -> p1.getCodigo().compareTo(p2.getCodigo());
        Collections.sort(listaProductos, criterioCodigo);

        System.out.println("------------Ordenado por código-----------");
        for (Producto p : listaProductos) {
            System.out.println(p);
        }

        System.out.println("------------Binary search-------------");
        System.out.println(Collections.binarySearch(listaProductos, new Musica(" ", "02", 0, " ", 0), criterioCodigo));
        System.out.println(Collections.binarySearch(listaProductos, new Musica(" ", "15", 0, " ", 0), criterioCodigo));
        
        
        List<Libro> listaLibros = new ArrayList<>();
        
        for (Producto p : listaProductos) {
            if(p instanceof Libro){
                listaLibros.add((Libro) p);
            }
        }
        
        Collections.sort(listaLibros);
        
        System.out.println("--------Lista ordenada de libros por isbn------------");
        
        listaLibros.forEach(l -> System.out.println(l));
        
        System.out.println("-------Descargar/Enviar---------");
        for (Libro l : listaLibros) {
            if(l instanceof LibroDigital){
                ((LibroDigital) l).descargar();
            }
            if (l instanceof LibroPapel) {
                ((LibroPapel) l).enviar("Calle mimir");
            }
        }
        
        System.out.println("--------Contains------------");
        System.out.println(listaLibros.contains(new LibroDigital(0, 
                "101", " ", 0, " ", 0)));
        
        List<SeEnvia> listaEnvios = new ArrayList<>();
        for (Producto p : listaProductos) {
            if(p instanceof SeEnvia){
                listaEnvios.add((SeEnvia) p); //conversion explicita
            }
        }
        
        for (SeEnvia envio : listaEnvios) {
            envio.enviar("Calle ya estoy mimiendo");
        }
        
        

    }

}
