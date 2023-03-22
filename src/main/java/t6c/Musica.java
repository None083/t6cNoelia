/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package t6c;

/**
 *
 * @author noelia
 */
public final class Musica extends Producto {
    
    private String grupo;

    public Musica(String grupo, String codigo, double precio, String descripcion, int iva) {
        super(codigo, precio, descripcion, iva);
        this.grupo = grupo;
    }

    public String getGrupo() {
        return grupo;
    }

    public void setGrupo(String grupo) {
        this.grupo = grupo;
    }

    @Override
    public String toString() {
        return "Musica{" + "grupo=" + grupo + "\n" + super.toString() + '}';
    }
    
    
    
}
