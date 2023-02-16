package javaAdvancedGlints.java03_ArrayList_3_Ordenacao_com_Collection_Sort;

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

        Collections.sort(listaDeCachorros);
        /*******************************************
         * ORDENANDO item de um lista de Objetos com Comparable
         */
        System.out.println("\nORDENANDO  item de um lista de Objetos com Comparable: ");
        System.out.println("Imprimindo os nomes e raça do Objeto Cachorro Ordenadas ");

        for (int i = 0; i < listaDeCachorros.size(); i++) {
            System.out.println("Nome: " + listaDeCachorros.get(i).getNome() + " Raça: "
                    + listaDeCachorros.get(i).getRaca() + " Idade: " + listaDeCachorros.get(i).getIdade());

        }

    }// end class
}
