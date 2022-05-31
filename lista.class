package papacaliente;
import java.util.Scanner;
public class Lista {
    Scanner teclado = new Scanner(System.in);
    nodo primero;
    nodo ultimo;
    nodo aux;
    nodo anterior;
    int cantidad = 1;
    int turno = 0;
    String perdedores;
    String ganador = null;
    int modo;
    int a;
    public Lista (){ 
        primero = null;
        ultimo = null;
       
    }
    public void insertarjugador(){
    
        nodo nuevo = new nodo();
        System.out.println("Ingrese nombre del participante");
        nuevo.Jugadores = teclado.next();
        
        if (primero == null){
        primero = nuevo;
        ultimo = nuevo;
        primero.siguiente = primero;
        primero.siguiente = ultimo;
        }else{
            ultimo.siguiente = nuevo;
            nuevo.siguiente = primero;
            nuevo.anterior = ultimo;
            ultimo = nuevo;
            primero.anterior = ultimo;
        }
        System.out.println("El jugador a sido agregado");
        
    }
    public void papacaliente(){
        System.out.println("**ingrese cantidad de jugadores**");
        a = teclado.nextInt();
        while(cantidad <= a ) {
        System.out.println("juegue en modo horario (1) o anti-horario (2)");
        modo = teclado.nextInt();
        turno++;
        cantidad++;
        
    switch(modo){
        case 1:
    aux = primero;   
    int n = (int)(Math.random()*10+1);
        for(int A = 0; A <= n; A++){
            anterior = aux;
            aux = aux.siguiente;
        if(A == n){
            System.out.println("caliente");
            anterior.siguiente = aux.siguiente;
            aux.siguiente.anterior = anterior;
            ganador = aux.Jugadores;
            perdedores = aux.Jugadores; 
            System.out.println("**"+perdedores+" salio en el turno "+turno+"**");
        
        }else{
            System.out.println("papa");
        }
    }break;
      case 2:
       int b = (int)(Math.random()*10+1);
       aux = ultimo;
       for(int y = 0; y <= b; y++){
        anterior = aux;
        aux = aux.anterior;
       if(y == b){
           System.out.println("caliente");
           anterior.anterior =aux.anterior;
           aux.anterior.siguiente = anterior;
           ganador = aux.Jugadores;
           perdedores = aux.Jugadores;
           System.out.println("**"+perdedores+" Salio en el turno"+turno+"**");
           
       }else{
           System.out.println("papa");
       }
           
    }break;
       
    }
    
  }
       System.out.println("**Gano: "+ganador+"**");
        System.out.println("**Di la verda, te gusto la partida**");
 
 }
}
