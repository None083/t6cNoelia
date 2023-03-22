/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package t6c;

import java.util.Objects;

/**
 *
 * @author noelia
 */
public abstract class Libro extends Producto implements Comparable<Libro>{
    
    private String isbn;

    public Libro(String isbn, String codigo, double precio, String descripcion, int iva) {
        super(codigo, precio, descripcion, iva);
        this.isbn = isbn;
    }

    public String getIsbn() {
        return isbn;
    }

    public void setIsbn(String isbn) {
        this.isbn = isbn;
    }

    @Override
    public String toString() {
        return "Libro{" + "isbn=" + isbn + "\n" + super.toString() + '}';
    }

    @Override
    public int compareTo(Libro o) {
        return this.isbn.compareToIgnoreCase(o.getIsbn());
    }

    @Override
    public int hashCode() {
        int hash = 7;
        hash = 41 * hash + Objects.hashCode(this.isbn);
        return hash;
    }

    @Override
    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj == null) {
            return false;
        }
        if (getClass() != obj.getClass()) {
            return false;
        }
        final Libro other = (Libro) obj;
        return Objects.equals(this.isbn, other.isbn);
    }
    
    
    
}
