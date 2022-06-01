/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package la.papa.caliente;

import java.io.*;

class Lista {

    

    nodo p, u, aux;
    
    
    nodo recorrer(int n, boolean horario) {
        aux = p;
        for (int i = 1; i < n; i++) {
            aux = horario ? aux.sig : aux.ant;

        }

        return aux;
        
        

    }

      void read(Lista lis) throws  IOException {
        
            BufferedReader br = new BufferedReader(new FileReader("Jugadores.in"));

            String linea;
        
        while((linea = br.readLine()) != null){
            String[] datos = linea.split("//");
            String nombre = datos[0];
            int edad = Integer.parseInt(datos[1]);
            
            
            lis.add(nombre,edad);
        
        }

    }
}


   


