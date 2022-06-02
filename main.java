
package papacaliente;
import java.util.Scanner;
public class Papacaliente {
     
             
    public static void main(String[] args) {
        int a;
        Lista z = new Lista();
        Scanner t = new Scanner(System.in);
        System.out.println("**Bienvenido a la mayor partida de papa caliente de tu vida**");
        System.out.println("");
        System.out.println("ingrese numero de jugadores");
        a = t.nextInt();
        for(int i=1; i<=a;i++){
            z.insertarjugador();
        
        }
        z.papacaliente();
    }
}
