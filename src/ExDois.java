import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class ExDois {
    public static Scanner digite = new Scanner(System.in);
    public static List<Integer> listaDeNumeros = new ArrayList<>();

    public static void main(String[] args) {
        numerosDigitados();
        adicionarNumero();
    }
    public static void numerosDigitados(){

        for (int i = 0; i < 4; i++) {
            System.out.println("Digite um número: ");
            listaDeNumeros.add(digite.nextInt());
        }

       System.out.println("Os números digitados foram: " +listaDeNumeros);
        System.out.println("-----");
    }
    public static void adicionarNumero(){
        System.out.println("Adicione mais um número: ");
        listaDeNumeros.add(2, digite.nextInt());

        System.out.println("Lista atualizada: ");
        System.out.println(listaDeNumeros);
        }
    }

