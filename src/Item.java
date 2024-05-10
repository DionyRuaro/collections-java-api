public class Item {

    public Item(String nome, Double preco, int quantidade) {
        this.nome = nome;
        this.preco = preco;
        this.quantidade = quantidade;
    }

    private String nome;
    private Double preco;
    private int quantidade;

    public String getNome() {
        return nome;
    }

    @Override
    public String toString() {
        return "Item{" +
                "nome='" + nome + '\'' +
                ", preco=" + preco +
                ", quantidade=" + quantidade +
                '}';
    }

    public Double getTotalItem() {
        return preco * quantidade;
    }
}
