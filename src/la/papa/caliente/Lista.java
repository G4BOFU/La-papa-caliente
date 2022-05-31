/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package la.papa.caliente;

    class Lista {
    
        nodo L, aux, aux2;
    

    nodo recorrer(int n, boolean horario){
        aux = L;
        for(int i = 1; i<n; i++){   
            aux = horario?aux.sig : aux.ant;           
        
        }
        
        return aux;

}
    
    
}