import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

public class OrdenacaoNumeros{
    private List<Integer> numeros;
    public OrdenacaoNumeros() {
        numeros = new ArrayList<>();
        numeros.add(100);
        numeros.add(20);
        numeros.add(30);
        numeros.add(40);
        numeros.add(50);
        numeros.add(60);
    }

    public void adicionarNumero(int num){
        numeros.add(num);
    }

    public List<Integer> ordenarAscendente() {
        List<Integer> numerosAscendente = new ArrayList<>(this.numeros);
        Collections.sort(numerosAscendente);
        return numerosAscendente;
    }

    public List<Integer> ordenarDescendente() {
        List<Integer> numerosAscendente = new ArrayList<>(this.numeros);
        numerosAscendente.sort(Collections.reverseOrder());
        return numerosAscendente;
    }

    public static void main(String[] args) {
        OrdenacaoNumeros numeros = new OrdenacaoNumeros();

        numeros.adicionarNumero(7);
        System.out.println(numeros.ordenarAscendente());
        System.out.println(numeros.ordenarDescendente());
    }

}
