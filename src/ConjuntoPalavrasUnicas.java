import java.util.HashSet;
import java.util.Set;

public class ConjuntoPalavrasUnicas {
    private Set<String> palavrasUnicas;

    public ConjuntoPalavrasUnicas() {
        this.palavrasUnicas = new HashSet<>();
    }

    public void adicionarPalavra(String palavra){
        palavrasUnicas.add(palavra);
    }

    public void removerPalavra(String palavra){
        palavrasUnicas.remove(palavra);
    }

    public void exibirPalavrasUnicas(){
        System.out.println(palavrasUnicas);
    }

    public boolean verificarPalavra(String palavra){
        return palavrasUnicas.contains(palavra);
    }

    public static void main(String[] args) {
        ConjuntoPalavrasUnicas palavras = new ConjuntoPalavrasUnicas();

        palavras.adicionarPalavra("Java");
        palavras.adicionarPalavra("Python");
        palavras.adicionarPalavra("JavaScript");
        palavras.adicionarPalavra("Python");
        palavras.adicionarPalavra("C++");
        palavras.adicionarPalavra("Ruby");

        palavras.removerPalavra("Python");
        palavras.exibirPalavrasUnicas();

        System.out.println("A linguagem 'Java' está no conjunto? " + palavras.verificarPalavra("Java"));
        System.out.println("A linguagem 'Python' está no conjunto? " + palavras.verificarPalavra("Python"));
    }
}
