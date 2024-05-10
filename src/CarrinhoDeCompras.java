import java.util.ArrayList;
import java.util.List;

public class CarrinhoDeCompras {
    private List<Item> listaProdutos;

    public CarrinhoDeCompras() {
        this.listaProdutos = new ArrayList<>();
    }

    public void adicionarItem(String nome, double preco, int quantidade){
        listaProdutos.add(new Item(nome, preco, quantidade));
    }

    public void removerItem(String nome){
        List<Item> itensRemover = new ArrayList<>();
        for(Item item: listaProdutos){
            if(item.getNome().equalsIgnoreCase(nome)){
                itensRemover.add(item);
            }
        }

        listaProdutos.removeAll(itensRemover);
    }

    public Double calcularValorTotal(){
        Double total = 0.0;
        for(Item item: listaProdutos){
            total += item.getTotalItem();
        }

        return total;
    }

    public void exibirItens(){
        System.out.println(listaProdutos);
    }

    public static void main(String[] args) {
        CarrinhoDeCompras carrinho = new CarrinhoDeCompras();

        carrinho.adicionarItem("Farinha", 10.0, 1);
        carrinho.adicionarItem("Banana", 5.50, 3);
        carrinho.adicionarItem("Alface", 1.50, 10);

        System.out.println("Itens: " + carrinho.listaProdutos.size());
        System.out.println("Total Carrinho: " + carrinho.calcularValorTotal());

        carrinho.removerItem("Banana");

        System.out.println("Itens: " + carrinho.listaProdutos.size());
        System.out.println("Total Carrinho: " + carrinho.calcularValorTotal());

        carrinho.exibirItens();
    }
}
