/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package algus;

/**
 *
 * @author Anu
 */
public class Algus {
    
    public static void ilmaKommentaar(int temperatuur){
        if(temperatuur>0){System.out.println("Soe");}
        else if(temperatuur<0){System.out.println("Külm");}
        else{System.out.println("Sula");}
    }

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        System.out.println("Hello, Web!");
        ilmaKommentaar(0);
    }
    
}
