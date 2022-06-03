/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package la.papa.caliente;

import java.io.IOException;
import java.util.Scanner;

/**
 *
 * @author Gabo
 */
public class LaPapaCaliente {
   
    public static void main(String[] args) throws IOException {
        int modo;
        Lista l = new Lista();
        Lista lis = new Lista();
        Scanner t = new Scanner(System.in);
        l.read("Jugadores.in", lis);
        System.out.println("**Bienvenido a la mayor partida de papa caliente de tu vida**");
         for(int i=1; i<6;i++){
             System.out.println("juegue en modo horario (1) o anti-horario (2)");
             modo = t.nextInt();
             switch (modo){
                 case 1 :
                     lis.modhorario();
                     lis.escribir(nombrear, dato);
                     break;
                     
                     
                 case 2:
                     lis.modantihorario();
                     lis.escribir(nombrear, dato);
                     break;        
        
        
        }
        
        }
        lis.mostrar();
        System.out.println("**Di la verdad, te encanto el juego**");
        
    }

}
