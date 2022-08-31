package Poker;

import java.util.Arrays;
import java.util.Collections;
import java.util.List;

/**
 *
 * @author Edgar Parada
 */
public class Barajas {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        Carta[] crearPalo1 = crearPalo("Corazones", "Rojo");
        Carta[] crearPalo2 = crearPalo("Diamantes" , "Negro");
        Carta[] crearPalo3 = crearPalo("Trevoles" , "Rojo");
        Carta[] crearPalo4 = crearPalo("Pica" , "Negro");
        
        
        
    }
        
    public static Carta[] crearPalo(String tipo, String color){
        
        System.out.println("Las cartas de color "+ color + " de "+ tipo + " son las siguientes : ");
        
        String[] cartas = {"A" , "2" , "3" , "4" , "5" , "6" , "7" , "8" , "9" , "10" , "J" , "Q" , "K"}; 
        Carta[] palo = new Carta[cartas.length];
        for (int i = 0; i < cartas.length; i++) {
            palo[i] = new Carta(color , tipo , i+1 , cartas[i]);
            System.out.println(palo[i]);
            
        }
        
        System.out.println("+++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++");
        //Mezclar las cartas
       
        return palo;
        
      
    }
    
    public static Carta[] unirArreglos(Carta[] crearPalo1, Carta[] crearPalo2, Carta[] crearPalo3, Carta[] crearPalo4 ){
        
        Carta[] unionArreglos = new Carta[8];
        int j = 0;
        for (int i = 0; i < 2; i++) {
            unionArreglos[j] = crearPalo1[i];
            j++;
            unionArreglos[j] = crearPalo2[i];
            j++;
            unionArreglos[j] = crearPalo3[i];
            j++;
            unionArreglos[j] = crearPalo4[i];
            j++;
                 
        }
        
        System.out.println("La union de los arreglos es: ");
        for (int i = 0; i < 8; i++) {
            System.out.println(unionArreglos[i]+" ");
        }
        
        System.out.println();
        return unionArreglos;
        
        
    }
        
    
     //reparten las 2 cartas entre 5 jugadores - juntar todos los array
     //se sacan 3 cartas del array
}
