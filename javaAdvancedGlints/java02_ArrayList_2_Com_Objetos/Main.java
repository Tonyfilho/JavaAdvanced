package javaAdvancedGlints.java02_ArrayList_2_Com_Objetos;

import java.util.ArrayList;
import java.util.List;

public class Main {
    public static void main(String[] args) {

        Cachorro cao = new Cachorro("Ice", "Pitbull");
        Cachorro cao1 = new Cachorro("Bravo", "Pitch");
        Cachorro cao2 = new Cachorro("Miau", "Bullterier");
        Cachorro cao3 = new Cachorro("Miau", "Bullterier"); /**deixamos os dados repetidos para usamos metodos */

        /**Criando um lista de Objetos de uma class */
        List<Cachorro> listaDeCachorros = new ArrayList<>();

        /**Não adcionamos os Cão3 */
        listaDeCachorros.add(cao);
        listaDeCachorros.add(cao1);
        listaDeCachorros.add(cao2);

        /**Imprimindo a lista */
        System.out.println("\nLISTA DE CACHORROS COMPLETAS: ");
        for(int i = 0; i < listaDeCachorros.size(); i++) {
            System.out.println("Imprimindo os nomes e raça do Objeto Cachorro: ");
            System.out.println("Nome " + listaDeCachorros.get(i).getNome() +  " Raça " +listaDeCachorros.get(i).getRaca());           
            
        }
        
        /*************Removendo item da class, agora ao invez do INDICE temos q passar o OBJETO */
        
        /*******************************************REMOVENDO item de um lista de Objetos*/
        System.out.println("\nREMOVENDO ITEM DA LISTA DE CACHORROS : ");
        listaDeCachorros.remove(cao1);
        for(int i = 0; i < listaDeCachorros.size(); i++) {
            System.out.println("Imprimindo os nomes e raça do Objeto Cachorro: ");
            System.out.println("Nome " + listaDeCachorros.get(i).getNome() +  " Raça " +listaDeCachorros.get(i).getRaca());           
            
        }
        
        /********************FAZENDO COMPARAÇÕES USANDO METODO CONTAINS,T EMOS Q PASSAR O OBJETO************************************* */
        
        if (listaDeCachorros.contains(cao1)) {
            System.out.println("Conteim  Objeto Cachorro: " + cao1.getNome() + " raça: " + cao1.getRaca());
            
        } else {
            System.out.println("Nao existem na lista de cachorros: ");
            
        }
       
                  
            
       






    }//end class
}
