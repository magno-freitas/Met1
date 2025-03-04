import java.util.Scanner;

public class att4 {
    public static int maior(int[] vetor){
        int maior=vetor[0];
        for(int i = 0; i < 5; i++){
            if(vetor[i]>maior){
                maior=vetor[i];
            }
        }
        return maior;
        
    }
    public static int menor(int[] vetor){
        int menor=vetor[0];
        for(int i = 0; i < 5; i++){
            if(vetor[i]<menor){
                menor=vetor[i];
            }
        }
        return menor;
        
    }
    public static void main(String[] args) {
        int vetor [] = new int [5];
        int soma=0;
        Scanner sc = new Scanner(System.in);
        
        for(int i = 0; i < 5; i++){
            System.out.println("Insira um número: ");
            vetor[i] = sc.nextInt();
            soma+=vetor[i];
        }
        int maiorN=maior(vetor);
        System.out.println("O maior número é: "+maiorN);
        System.out.println("O menor número é: "+menor(vetor));
        System.out.println("A média dos números é: "+soma/5);


    }
}
