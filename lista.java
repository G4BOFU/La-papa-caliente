package la.papa.caliente;

import java.io.*;
import java.util.Scanner;

class Lista {
    Scanner teclado = new Scanner(System.in);
    nodo anterior;
    int pase = 1;
    int turno = 0;
    String perdedores;
    String ganador = null;
    int modo;
    int a;

    

    nodo p, u, aux;
    
    
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
    
    

    nodo recorrer(int a, boolean horario) {
        System.out.println("**ingrese cantidad de turnos igual a la cantidad de participantes**");
        a = teclado.nextInt();
        while (pase <= a){
        int n = (int)(Math.random()*10+1);
        System.out.println("juegue en modo horario (1) o anti-horario (2)");
        modo = teclado.nextInt();
        aux = p;
        turno++;
        pase++;
        aux = horario ? aux.sig: aux.ant;
        switch(modo){
        case 1:
            horario = true;
        for(int A = 0; A <= n; A++){
            anterior = aux;
            aux = horario ? aux.sig : aux.ant;   
        if(A == n){
            System.out.println("caliente");
            anterior.sig = aux.sig;
            aux.sig.ant = anterior;
            ganador = aux.dato;
            System.out.println("**"+aux.dato+" salio en el turno "+turno+"**");
        }else{
            System.out.println("papa");
        }
    }break;
      case 2:
          horario = false;
       for(int y = 0; y <= n; y++){
        anterior = aux;
        aux = horario ? aux.sig : aux.ant;
       if(y == n){
           System.out.println("caliente");
           anterior.ant =aux.ant;
           aux.ant.sig = anterior;
           ganador = aux.dato;
           System.out.println("**"+aux.dato+" Salio en el turno "+turno+"**");
       }else{
           System.out.println("papa");
       }
           
    }break;
       
    }
   
         
        

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



   



