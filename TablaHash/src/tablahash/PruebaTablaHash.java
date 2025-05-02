/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package tablahash;

/**
 *
 * @author LAB-USR-LNORTE
 */
public class PruebaTablaHash {
    public static void main(String[] args) {
        TablaHash miTabla = new TablaHash();
        miTabla.insertarElemento(1, "One");
        miTabla.insertarElemento(2, "Two");
        miTabla.insertarElemento(3, "Tree");
        miTabla.imprimir();
        miTabla.contarElementos();
        miTabla.Buscar(3);
        
        miTabla.limpiar();
        miTabla.imprimir();
        
        miTabla.insertarElemento("uno", "1");
        miTabla.insertarElemento("tres", "33");
        miTabla.insertarElemento("cinco", "5");
        
        miTabla.imprimir();
        miTabla.Eliminar("tres");
        
        miTabla.imprimir();
    }
}
