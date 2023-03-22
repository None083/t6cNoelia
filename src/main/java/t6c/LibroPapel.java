/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package t6c;

/**
 *
 * @author noelia
 */
public final class LibroPapel extends Libro implements SeEnvia {
    
    private int numPaginas;

    public LibroPapel(int numPaginas, String isbn, String codigo, double precio, String descripcion, int iva) {
        super(isbn, codigo, precio, descripcion, iva);
        this.numPaginas = numPaginas;
    }

    public int getNumPaginas() {
        return numPaginas;
    }

    public void setNumPaginas(int numPaginas) {
        this.numPaginas = numPaginas;
    }

    @Override
    public String toString() {
        return "LibroPapel{" + "numPaginas=" + numPaginas + "\n" + super.toString() + '}';
    }

    @Override
    public void enviar(String direccion) {
        System.out.println("El libro de papel con isbn " + super.getIsbn() + " y número de páginas " + this.numPaginas + 
                " se añade al envío con dirección: " + direccion);
    }
    
    
    
}
