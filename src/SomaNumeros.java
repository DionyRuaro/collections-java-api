import java.util.ArrayList;
import java.util.List;

public class SomaNumeros {
    private List<Integer> numeros;
    public SomaNumeros() {
        numeros = new ArrayList<>();
        numeros.add(10);
        numeros.add(20);
        numeros.add(30);
        numeros.add(40);
        numeros.add(50);
        numeros.add(60);
    }

    public void adicionarNumero(int num){
        numeros.add(num);
    }

    public void exibirNumeros(){
        System.out.println(numeros);
    }

        @Override
    public String toString() {
        return "SomaNumeros{" +
                "numeros=" + numeros +
                '}';
    }

    public Integer calcularSoma(){
        Integer total = 0;
        for (Integer num : numeros) {
            total += num;
        }

        return total;
    }
    public Integer encontrarMenorNumero(){
        Integer menorNumero=null;
        for (Integer num : numeros) {
            if (menorNumero == null){
                menorNumero = num;
            } else if(menorNumero > num){
                menorNumero = num;
            }
        }

        return menorNumero;
    }

    public Integer encontrarMaiorNumero(){
        Integer maiorNumero=null;
        for (Integer num : numeros) {
            if (maiorNumero == null){
                maiorNumero = num;
            } else if(maiorNumero < num){
                maiorNumero = num;
            }
        }

        return maiorNumero;
    }

    public static void main(String[] args) {
        SomaNumeros somaNumeros = new SomaNumeros();

        somaNumeros.adicionarNumero(7);
        somaNumeros.exibirNumeros();
        System.out.println("Total da lista: " + somaNumeros.calcularSoma());
        System.out.println("Maior número: " + somaNumeros.encontrarMaiorNumero());
        System.out.println("Maior número: " + somaNumeros.encontrarMenorNumero());
    }
}
