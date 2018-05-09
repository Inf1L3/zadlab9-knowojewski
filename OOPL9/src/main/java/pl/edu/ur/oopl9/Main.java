/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package pl.edu.ur.oopl9;
import java.util.Random;
import java.util.Iterator;
import java.util.TreeSet;

/**
 *
 * @author maarchyl
 */
public class Main {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
     /*   Random r = new Random();
        
        int[] tab = new int[100];
        for(int i=0 ; i<100 ; i++)
        {
           tab[i]= r.nextInt(100);
           System.out.println(tab[i]);
        }
        int a;
        int b = 1;
        while(b > 0){
        b = 0;
        for(int i=0; i<tab.length-1; i++){
        if(tab[i]>tab[i+1]){
        a = tab[i+1];
        tab[i+1] = tab[i];
        tab[i] = a;
        b=b+1;
        }
    }
}
        for(int i=0; i<tab.length; i++){
        System.out.print(tab[i]+" ");

}
     // ZADANIE 2:
    
        Random x = new Random();
        
        TreeSet<Integer> dzewo = new TreeSet<Integer>();
        int[] tab1 = new int[100];
                for(int i=0 ; i<100 ; i++)
        {
           dzewo.add(tab1[i]= x.nextInt(100));
        }        
        Iterator<Integer> iter = dzewo.iterator();
        while(iter.hasNext()) {
		System.out.print(iter.next() + " ");
        }*/
        
         
       String marka= "BMW";
       String nazwa = "Szybkie";
       int predkosc =800;
       int cena = 120000;
       Furki fasty= new Furki(marka,nazwa,predkosc,cena);
       fasty.output(); 
     
    }
}
    

