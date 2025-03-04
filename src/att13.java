import java.util.Scanner;
//Faça um programa que receba 3 notas do usuário e informe a média dessas notas.
// Retorne a média
public class att13 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Insira a primeira nota: ");
        double n1 = sc.nextDouble();
        System.out.println("Insira a segunda nota: ");
        double n2 = sc.nextDouble();
        System.out.println("Insira a terceira nota: ");
        double n3 = sc.nextDouble();
        System.out.println("Média: "+media(n1,n2,n3));
//teste atualizar commit git
        sc.close();
    }
    public static double media(double n1,double n2,double n3){
        double media=(n1+n2+n3)/3;
        return media;
    }
    }

