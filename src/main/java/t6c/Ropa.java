/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package t6c;

/**
 *
 * @author noelia
 */
public abstract class Ropa extends Producto implements SeEnvia {
    
    private String marca;

    public Ropa(String marca, String codigo, double precio, String descripcion, int iva) {
        super(codigo, precio, descripcion, iva);
        this.marca = marca;
    }

    public String getMarca() {
        return marca;
    }

    public void setMarca(String marca) {
        this.marca = marca;
    }

    @Override
    public String toString() {
        return "Ropa{" + "marca=" + marca + "\n" + super.toString() + '}';
    }
    
    
    
}
