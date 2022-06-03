/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package la.papa.caliente;

import java.io.*;

class Lista {

     PrintWriter pw;
    FileReader fr;

    nodo p, u, aux, anterior, actual;
    nodo aux2  = aux;
    int turno = 0;
    
    
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
    
    void modhorario(){
    
    aux = p;   
    int n = (int)(Math.random()*10+1);
    turno++;
        for(int A = 0; A <= n; A++){
            anterior = aux;
            aux = aux.sig;
        if(A == n){
            System.out.println("caliente");
            anterior.sig = aux.sig;
            aux.sig.ant = anterior;
            System.out.println("**"+aux.dato+" salio en el turno "+turno+"**");
        
        }else{
            System.out.println("papa");
        }
    
    
        }
    }
    
    void modantihorario(){
    int b = (int)(Math.random()*10+1);
    turno++;
       aux = u;
       for(int y = 0; y <= b; y++){
        anterior = aux;
        aux = aux.ant;
       if(y == b){
           System.out.println("caliente");
           anterior.ant =aux.ant;
           aux.ant.sig = anterior;
           System.out.println("**"+aux.dato+" Salio en el turno "+turno+"**");
           
       }else{
           System.out.println("papa");
       }
           
    }
    
    
    
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
       actual = anterior;
        
       
        
        System.out.println("**gano: "+actual.dato+"**");
             
      }
       void escribir(String nombrear, String dato) throws IOException {

        pw = new PrintWriter(new FileWriter(nombrear, true));
        pw.println(dato);
        pw.close();

    }
}



   


