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
        if(temperatuur>0){System.out.println("Sulab");}
        else{System.out.println("Jäätab");}
    }

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        System.out.println("Hello, Web!");
        ilmaKommentaar(5);
    }
    
}
