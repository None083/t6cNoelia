/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package t6c;

/**
 *
 * @author noelia
 */
public class Pantalon extends Ropa {
    
    private String talla;

    public Pantalon(String talla, String marca, String codigo, double precio, String descripcion, int iva) {
        super(marca, codigo, precio, descripcion, iva);
        this.talla = talla;
    }

    public String getTalla() {
        return talla;
    }

    public void setTalla(String talla) {
        this.talla = talla;
    }

    @Override
    public String toString() {
        return "Pantalon{" + "talla=" + talla + "\n" + super.toString() + '}';
    }

    @Override
    public void enviar(String direccion) {
        System.out.println("El pantalón de la marca " + super.getMarca() + " con talla " + this.talla + 
                " se añade al envío con dirección: " + direccion);
    }
    
    
    
}
