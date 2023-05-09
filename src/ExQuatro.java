import java.util.*;

public class ExQuatro {

    public static void main(String[] args) {

        Scanner digite = new Scanner(System.in);
        List<Integer> listaNumeros = new ArrayList<>();

        for (int i = 0; i < 2; i++) {
            System.out.println("Informe um número: ");
            listaNumeros.add(digite.nextInt());
        }
        System.out.println("-----");

        if (listaNumeros.get(0) < listaNumeros.get(1)){
            System.out.println(listaNumeros.get(1) + "," + listaNumeros.get(0));
        }
        else if (listaNumeros.get(1) < listaNumeros.get(0)){
            System.out.println(listaNumeros.get(0) + "," + listaNumeros.get(1));
        }
        else {
            System.out.println("Números iguais");
        }
    }
}
