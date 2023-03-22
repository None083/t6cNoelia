/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package t6c;

import java.util.ArrayList;
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
                16, "Monty en el campo de flores", 4));
        listaProductos.add(new LibroDigital(4488, "103", "06", 
                6, "Adi la gorda", 21));
        listaProductos.add(new Pantalon("L", "Parfois", "07", 
                36, "Material: lino, lavar en máquina máximo 30º", 21));
        listaProductos.add(new Musica("Jungle", "08", 
                12, "Loving in Stereo", 21));
    }
    
}
