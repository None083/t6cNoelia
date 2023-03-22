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
public abstract class Producto {
    
    private String codigo;
    private double precio;
    private String descripcion;
    private int iva;

    public Producto(String codigo, double precio, String descripcion, int iva) {
        this.codigo = codigo;
        this.precio = precio;
        this.descripcion = descripcion;
        this.iva = iva;
    }

    public String getCodigo() {
        return codigo;
    }

    public void setCodigo(String codigo) {
        this.codigo = codigo;
    }

    public double getPrecio() {
        return precio;
    }

    public void setPrecio(double precio) {
        this.precio = precio;
    }

    public String getDescripcion() {
        return descripcion;
    }

    public void setDescripcion(String descripcion) {
        this.descripcion = descripcion;
    }

    public int getIva() {
        return iva;
    }

    public void setIva(int iva) {
        this.iva = iva;
    }

    @Override
    public String toString() {
        return "Producto{" + "codigo=" + codigo + ", precio=" + precio + ", descripcion=" + descripcion + ", iva=" + iva + '}';
    }

    @Override
    public int hashCode() {
        int hash = 5;
        hash = 23 * hash + Objects.hashCode(this.codigo);
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
        final Producto other = (Producto) obj;
        return Objects.equals(this.codigo, other.codigo);
    }
    
    
    
}
