// Faça um programa que diz se um número inserido está dentro de um limite imposto
// pelo usuário
// Por exemplo:
// Usuário inseriu o limite máximo como 100.
// Usuário inseriu o limite mínimo como 70.
// Depois ele inseriu o número 80.
// O retorno deve ser: 80 está nos limites impostos.
import java.util.Scanner;
public class att15 {
public static void main(String[] args) {
    Scanner sc = new Scanner(System.in);
    System.out.println("Insira o limite máximo: ");
    int max = sc.nextInt();
    System.out.println("Insira o limite mínimo: ");
    int min = sc.nextInt();
    System.out.println("Insira o número: ");
    int num = sc.nextInt();
    met1(max, min, num);
    sc.close();
}
public static void met1(int max, int min, int num) {
    if(num>=min && num<=max){
        System.out.println(num+" está nos limites impostos");
    } else {
        System.out.println(num+" não está nos limites impostos");
    }
}
}
