package javaAdvancedGlints.java04_ArrayList_4_Lista_Aleatoria_Comparable;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

public class Main {
    public static void main(String[] args) {
        Cachorro cao = new Cachorro("Ice", "Pitbull", 10);
        Cachorro cao1 = new Cachorro("Bravo", "Pitch", 15);
        Cachorro cao2 = new Cachorro("Fera", "Bullterier", 2);
        Cachorro cao3 = new Cachorro("Miau", "Bullterier", 1);
        Cachorro cao4 = new Cachorro("Miau", "Bullterier", 1); /** deixamos os dados repetidos para usamos metodos */

        /** Criando um lista de Objetos de uma class */
        List<Cachorro> listaDeCachorros = new ArrayList<>();

        /** Não adcionamos os Cão3 */
        listaDeCachorros.add(cao);
        listaDeCachorros.add(cao1);
        listaDeCachorros.add(cao2);
        listaDeCachorros.add(cao3);
        listaDeCachorros.add(cao4);
        /**
         * NO Java temos a class COLLECTIONS que cuida das coleçoes,
         * 1º COLLECTIONS tem um Metodo chamado SORT().
         * 2º Recebe o 1º paramentro que recebe um lista,
         * 2º tem q se criar um metodo de comparação e que foi feito na CLASS Cachorros
         */
        /*******************************************
         * ORDENANDO item de um lista de Objetos com Comparable
         */
        System.out.println("\nORDENANDO  item de um lista de Objetos com Comparable: ");
        System.out.println("Imprimindo os nomes e raça do Objeto Cachorro Ordenadas ");
        
                Collections.sort(listaDeCachorros);

        for (int i = 0; i < listaDeCachorros.size(); i++) {
            System.out.println("Nome: " + listaDeCachorros.get(i).getNome() + " Raça: "
                    + listaDeCachorros.get(i).getRaca() + " Idade: " + listaDeCachorros.get(i).getIdade());

        }
        /**
         * 
         * ORDENANDO item de um lista de Objetos com Comparable Aleatoriamente usando 
         */
       
        System.out.println("\nORDENANDO  item de um lista de Objetos com Comparable usando shuffle: ");
        System.out.println("Imprimindo os nomes e raça do Objeto Cachorro ALEATORIA");
            Collections.shuffle(listaDeCachorros);
        for (int i = 0; i < listaDeCachorros.size(); i++) {
            System.out.println("Nome: " + listaDeCachorros.get(i).getNome() + " Raça: "
                    + listaDeCachorros.get(i).getRaca() + " Idade: " + listaDeCachorros.get(i).getIdade());

        }
        /**
         * 
         * ORDENANDO item de um lista de Objetos com Comparable Aleatoriamente usando 
         */
       
        System.out.println("\nORDENANDO  item de um lista de Objetos com Comparable usando Max e Min: ");
        System.out.println("Imprimindo os nomes e raça do Objeto Cachorro pelo mais Velho");
        System.out.println("**********************************MAIOR  p MENOR será EXTRAIDO da LISTA");
        Cachorro maisVelho =  Collections.max(listaDeCachorros);
        
            System.out.println("Nome: " + maisVelho.getNome() + " Raça: "
                    + maisVelho.getRaca() + " Idade maior: " + maisVelho.getIdade());

        
        System.out.println("**********************************MENOR p MAIOR será EXTRAIDO da LISTA");
         Cachorro menosVelho =    Collections.min(listaDeCachorros);
     
            System.out.println("Nome: " + menosVelho.getNome() + " Raça: "
                    + menosVelho.getRaca() + " Idade menor : " + menosVelho.getIdade());

        

    }// end class
}
