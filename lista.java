package la.papa.caliente;

import java.io.*;

class Lista {

    

    nodo p, u, aux, anterior;
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
    
    

    nodo recorrer(int n, boolean horario) {
        aux = p;
        for (int i = 1; i < n; i++) {
            
            aux = horario ? aux.sig : aux.ant;

        }
        return aux;
         
        

    }
    
    void modhorario(){
    
    aux = p;   
    int n = (int)(Math.random()*10+1);
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
         nodo actual = new nodo();
         actual = p;
         do{
             System.out.println(actual.dato);
             actual = actual.sig;
         }while(actual!= p);
      }
}



   


