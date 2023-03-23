/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package t6c;

/**
 *
 * @author noelia
 */
public final class LibroDigital extends Libro implements SeDescarga {
    
    private int numKBytes;

    public LibroDigital(int numKBytes, String isbn, String codigo, double precio, String descripcion, int iva) {
        super(isbn, codigo, precio, descripcion, iva);
        this.numKBytes = numKBytes;
    }

    public int getNumKBytes() {
        return numKBytes;
    }

    public void setNumKBytes(int numKBytes) {
        this.numKBytes = numKBytes;
    }

    @Override
    public String toString() {
        return "LibroDigital{" + "numKBytes=" + numKBytes + "\n" + super.toString() + '}';
    }

    @Override
    public void descargar() {
        System.out.println("http://noelia.daw/" + this.hashCode());
    }

    @Override
    public void pasarPagina() {
        System.out.println("Para pasar la página de un toque a la pantalla");
    }
    
    
    
}
