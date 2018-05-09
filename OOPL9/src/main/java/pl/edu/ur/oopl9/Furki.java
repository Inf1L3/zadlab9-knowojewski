/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package pl.edu.ur.oopl9;

/**
 *
 * @author student
 */
public class Furki<F, M> {
   F marka, nazwa;
   M predkosc, cena;
   
  

     public Furki(F marka, F nazwa, M predkosc, M cena) {
         
        this.marka = marka;
        this.nazwa = nazwa;
        this.predkosc = predkosc;
        this.cena = cena;
    
        }
        public void output()
        {
         System.out.println("Marka furki to: " + marka + " |||||||||||||||| Klasa: " + marka.getClass());   
         System.out.println("Nazwa furki to: " + nazwa + " |||||||||||| Klasa: " + nazwa.getClass());   
         System.out.println("Predkosc maksymalna to: " + predkosc + " |||||| Klasa: " + predkosc.getClass());   
         System.out.println("Cena furki to: " + cena + " |||||||||||||| Klasa: " + cena.getClass());   
        }
    
    
}
