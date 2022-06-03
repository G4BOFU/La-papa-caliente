/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package la.papa.caliente;

/**
 *
 * @author Gabo
 */
public class nodo {

    String dato;
    int edad;
    nodo ant;
    nodo sig;

    nodo(String nombre){
        this.dato = nombre;

    
    }
    
    nodo(nodo siguiente){
        this.sig = siguiente;
    }

    nodo() {
    }

 
   

    

}
