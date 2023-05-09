import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class ExTres {
    public static Scanner digite = new Scanner(System.in);

    public static void main(String[] args) {

        System.out.println("Digite a capacidade da sua lista: ");
        int tamanho = digite.nextInt();
        List<Integer> listaNumero = capacidadeDaLista(tamanho);

        recebendoValoresNaLista(listaNumero, tamanho);

        System.out.println("-----");
        System.out.println("A média da lista é: " +mediaNumeros(listaNumero));
    }
    public static List<Integer> capacidadeDaLista (int tamanho){

        List<Integer> listaDeNumero = new ArrayList<>(tamanho);
        return listaDeNumero;
    }
    public static boolean recebendoValoresNaLista (List<Integer> listaDeNumero, int tamanho){

        for (int i = 0; i < tamanho; i++) {
            System.out.println("Digite um número: ");
            listaDeNumero.add(digite.nextInt());
        }
    return true;
    }
    public static double mediaNumeros (List<Integer>listaDeNumero){

        int total=0;

        for (int i = 0; i < listaDeNumero.size(); i++) {
            total += listaDeNumero.get(i);
        }

        double media;
        media = total / listaDeNumero.size();

    return media;
    }
}
