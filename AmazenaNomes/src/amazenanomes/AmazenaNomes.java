package amazenanomes;

import java.util.Arrays;
import java.util.Scanner;

public class AmazenaNomes {
    public static void main(String[] args) {
        int[] vetorNumeros = new int[3];
        Scanner scan = new Scanner(System.in);
        
        for(int i=0; i<vetorNumeros.length; i++){
            System.out.println("Insira um numero: ");
            vetorNumeros[i] = scan.nextInt();
        }
        System.out.println("");
        
        Arrays.sort(vetorNumeros); //letra A
        
        System.out.println("Ordenacao em ordem crescente:");
        for(int j=0; j<vetorNumeros.length; j++){
            System.out.print(vetorNumeros[j]+ " ");
        }
        System.out.println("");
        
        int[] vetorAux = new int[3];

        int contador = 0;
        for(int k=vetorNumeros.length-1;k >= 0;k--) {
            vetorAux[contador]=vetorNumeros[k]; 
            contador++;
        }
        
        System.out.println("Ordenacao em ordem decrescente:");
        for(int l=0; l<vetorAux.length; l++){ //letra B
            System.out.print(vetorAux[l]+ " ");
        }
        System.out.println("");
        
        int soma = 0;
        int produto = 1;
        for (int m=0; m<vetorNumeros.length; m++){
            if(vetorNumeros[m]%2 == 0){
                soma += vetorNumeros[m]; //letra C
            }
            else{
                produto *= vetorNumeros[m]; //letra D
                
            }
            
        }
        System.out.println("Soma: \n"+soma);
        System.out.println("Produto: \n"+produto);
         
    }
    
}
