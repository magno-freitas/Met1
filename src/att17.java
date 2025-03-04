// Faça um código que recebe uma palavra do usuário, se essa palavra tem tamanho par,
// retorne o primeiro caractere dessa palavra.
// Caso ela tenha tamanho ímpar, retorne o segundo caractere dessa palavra.

import java.util.Scanner;

public class att17 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Insira uma palavra: ");
        String palavra = sc.nextLine();
        char letra = met1(palavra);
        System.out.println(letra);
        sc.close();

    }
    public static char met1(String palavra){
        if(palavra.length()%2==0){
            return palavra.charAt(0);
        } else {
            return palavra.charAt(1);
        }
    }
}
