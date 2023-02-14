package javaAdvancedGlints.java01_ArrayList_1;

import java.util.ArrayList;

public class ArrayList01 {


    public static void main(String[] args) {

        /**Array List */
        ArrayList<String> lista = new ArrayList<>();

        /**Add dados usando metodo ADD */
        lista.add("Computador");
        lista.add("Mouse");
        lista.add("Teclado");
        lista.add("Monitor");
        lista.add("Notebook");

        /************************************Para buscar 1 item usamos o metodo GET */
        System.out.println(lista.get(0));
        System.out.println(lista.get(1));
        /************************************LENDO com FOR  */
        System.out.println("\nLista no For: ");
        for(int i = 0; i < lista.size(); i ++) {
            System.out.println(lista.get(i));
            
        }
        
        /************************Altera item na lista */
        System.out.println("\nUpdate na Lista com metodo SET(): ");
        /**Temos q passar o indice e o valor */
        lista.set(4, "Monitor de 32 pol");
        
        for(int i = 0; i < lista.size(); i ++) {
            System.out.println(lista.get(i));
            
        }
        /************************REMOVER item na lista */
        System.out.println("\nRemover na Lista com metodo REMOVE(): ");
        /**Temos q passar o indice e o valor */
        lista.remove(4);        
        for(int i = 0; i < lista.size(); i ++) {
            System.out.println(lista.get(i));
            
        }
        /************************REMOVER item na lista */
        System.out.println("\nLimpar toda a Lista com metodo CLEAR(): ");
        /**Temos q passar somente chamar */
        lista.clear();
        
        for(int i = 0; i < lista.size(); i ++) {
            System.out.println(lista.get(i));
            
        }
        /************************REMOVER item na lista */
        System.out.println("\nChecar se a Lista esta vazia com metodo ISEMPTY(): ");
        /**Temos q passar somente chamar */
       if (lista.isEmpty()) {           
               System.out.println("Is emptyyyyy");        
        
       }
       
       
    }//end class
}
