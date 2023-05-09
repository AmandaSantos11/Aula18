import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class ExUm {
    public static Scanner digite = new Scanner(System.in);
    public static List<String> listaNomes = new ArrayList<>();

    public static void main(String[] args) {

        listaDeNomes(qntdUsuarioDeseja());
        removerNome();
    }
    public static int qntdUsuarioDeseja (){
        System.out.println("Deseja digitar quantos nomes na lista: ");
        int quantidade = digite.nextInt();
        System.out.println("A quantidade escolhida foi: " +quantidade);
        return quantidade;
    }
    public static void listaDeNomes(int quantidade){

        for (int i = 0; i < quantidade; i++) {
            System.out.println("Digite um nome: ");
            listaNomes.add(digite.next());
        }
        System.out.println("Nomes digitados: " +listaNomes);
    }
    public static void removerNome(){

        System.out.println("Deseja remover um nome? \n 1-SIM | 2-NÃO");
        int escolha = digite.nextInt();

        switch (escolha){
            case 1:
                System.out.println("Qual nome deseja remover: ");
                listaNomes.remove(digite.next());

                System.out.println("Lista atualizada: ");
                for (int i = 0; i < listaNomes.size(); i++) {
                    System.out.println(listaNomes.get(i));
                }
            break;

            case 2:
                System.exit(0);
            break;

            default:
                System.out.println("Opção inválida");
                }
        }
    }
