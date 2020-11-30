package vetornome;
import java.util.Scanner;

public class VetorNome {

    public static void main(String[] args) {
        String[] vetorNomes = {"Julia", "Pedro", "Fernando", "Sabrina", "Henrique"};
        Scanner scan = new Scanner(System.in);
        int i = 0;
        
        System.out.println("Qual nome deseja buscar?");
        String nomeBusca = scan.nextLine();
        
        boolean encontrado = false;
        while (i< vetorNomes.length){
            if (vetorNomes[i].equalsIgnoreCase(nomeBusca)){
                encontrado = true;
                break;
            }
            else{
                i++;
            }
        }
        
        if (encontrado){
            System.out.println("Nome: " +vetorNomes[i]+ "; Posicao:  "+ i);
        }
        else{
            System.out.println("Nome nao encontrado");
        }
    } 
}
