/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package la.papa.caliente;

import java.io.IOException;

/**
 *
 * @author Gabo
 */
public class LaPapaCaliente {

    /**
     * @param args the command line arguments
     * @throws java.io.IOException
     */
    public static void main(String[] args) throws IOException {

        Lista l = new Lista();
        Lista lis = new Lista();
        
        l.add("Gabo");
        l.add("Diego");
        l.add("Gabo2");
        l.add("Gabo3");
        l.add("Gabo4");
        l.add("Gabo5");
        l.recorrer(20, false);
        l.mostrar();
        
    }

}
