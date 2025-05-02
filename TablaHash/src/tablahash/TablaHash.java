/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package tablahash;
import java.util.*;
/**
 *
 * @author LAB-USR-LNORTE
 */
public class TablaHash {
    Hashtable tabla;

    public TablaHash() {
        tabla = new Hashtable();
    }
    
    public void insertarElemento(Object Position, Object Valor){
        tabla.put(Position, Valor);
    }
    
    public void Eliminar (Object Position){
        tabla.remove(Position);
    }
    
    public void Buscar(Object Position){
        if(tabla.containsKey(Position))
            System.out.println("El Valor en la posicion "+Position+"es: "+tabla.get(Position));
        else
            System.out.println("El Valor no existe en la tabla");
    }
    
    public void limpiar(){
        tabla.clear();
    }
    
    public void contarElementos(){
        System.out.println("El numero de elementos en la tabla es: " + tabla.size());
    }
    
    public Boolean verificarVacios(){
        return tabla.isEmpty();
    }
    
    public void imprimir(){
        Enumeration e = tabla.keys();
        Object obj;
        if (verificarVacios()){
            System.out.println("La tabla esta vacia");
        return;
        }
        while (e.hasMoreElements()){
            obj = e.nextElement();
            System.out.println("Poscion "+obj+": "+tabla.get(obj));
        }
    }    
}
