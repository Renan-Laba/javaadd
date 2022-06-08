public class Pessoa implements Comparable <Pessoa>{
    private String nome;
    private int idade;
    private int peso;

    public Pessoa(String nome, int idade, int peso) {
        this.nome = nome;
        this.idade = idade;
        this.peso = peso;
    }

    @Override
    public String toString() {
        return String.format("Nome: %s; \nIdade: %d; \nPeso: %d\n", nome, idade, peso);
    }

    @Override
    public int compareTo(Pessoa o) {
        if (this.idade > o.idade) {
            return 1;
        } else if(this.idade < o.idade) {
            return -1;
        }
        return 0;
    }
}