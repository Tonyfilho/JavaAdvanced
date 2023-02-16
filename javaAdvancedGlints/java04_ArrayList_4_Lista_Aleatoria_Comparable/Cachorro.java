package javaAdvancedGlints.java04_ArrayList_4_Lista_Aleatoria_Comparable;


/**Implementando a interface COMPARABLE */
public class Cachorro implements Comparable<Cachorro>{
    private String nome;
    private String raca;
    private int idade;




    @Override
    public int compareTo(Cachorro oCachorro) {
        // Tbasta retorna o paramentro menos a propriedade da class, que o Camparable faz o restante
        return (this.getIdade() - oCachorro.getIdade());
    }

    
    public Cachorro(String nome, String raca, int idade) {
        this.nome = nome;
        this.raca = raca;
        this.idade = idade;
    }

    
    public String getNome() {
        return nome;
    }
    public void setNome(String nome) {
        this.nome = nome;
    }
    public String getRaca() {
        return raca;
    }
    public void setRaca(String raca) {
        this.raca = raca;
    }


    public int getIdade() {
        return idade;
    }


    public void setIdade(int idade) {
        this.idade = idade;
    }




    
    
    
}
