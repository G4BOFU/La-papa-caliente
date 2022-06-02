/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package la.papa.caliente;

import java.io.*;

class Lista {

    

    nodo p, u, aux;
    nodo aux2  = aux;
    
    
    void add(String nombre){
        
        nodo nuevo = new nodo(nombre);
        nuevo.dato = nombre;
        if(p == null){
            p = nuevo;
            p.sig = p;
            nuevo.ant = u;
            u = nuevo;
        } else {
            u.sig = nuevo;
            nuevo.sig = p;
            nuevo.ant = u;
            u = nuevo;
            p.ant = u;

            }
        }
    
    

    nodo recorrer(int n, boolean horario) {
        aux = p;
        for (int i = 1; i < n; i++) {
            
            aux = horario ? aux.sig : aux.ant;

        }
        return aux;
         
        

    }
    


      void read(String Nombref,Lista lis) throws  IOException {
        
          FileReader fr = new FileReader(Nombref);
          BufferedReader br = new BufferedReader(fr);
          String linea;
        
        while((linea = br.readLine()) != null){

            
            lis.add(linea);
        
        }

    }
      
      void mostrar(){
         nodo actual = new nodo();
         actual = p;
         do{
             System.out.println(actual.dato);
             actual = actual.sig;
         }while(actual!= p);
      }
}



   


