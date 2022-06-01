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

    nodo(String valor, int valor2){
        this.dato = valor;
        this.edad = valor2;
    
    }
    
    nodo(nodo siguiente){
        this.sig = siguiente;
    }

    

}
