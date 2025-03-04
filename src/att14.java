import java.util.Scanner;
// Faça um programa que receba 2 números do usuário.
// Faça um método que descubra qual dos números é maior e retorne esse valor.
// Se os dois números forem iguais, retorne: número iguais
public class att14 {
public static void main(String[] args) {
    Scanner sc = new Scanner(System.in);
    System.out.println("Insira o primeiro número: ");
    double n1 = sc.nextDouble();
    System.out.println("Insira o segundo número: ");
    double n2 = sc.nextDouble();
    System.out.println(maior(n1,n2));
    sc.close();

}

public static String maior(double n1, double n2) {
    if(n1>n2){
        return "maior: "+n1;
    } else if(n2>n1){
        return "Maior: "+n2;
    } else {
        return "Números iguais";
    }

}
}
