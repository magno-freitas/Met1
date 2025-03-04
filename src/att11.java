import java.util.Scanner;
public class att11 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Insira um número:");
        double n=sc.nextDouble();
        double quadrado=0;
        double soma=0;
        double result =par(n, quadrado, soma);
        if(n%2==0){
            System.out.println("Quadrado do número par: "+ result);
        } else{
            System.out.println("Dobro do número ímpar: "+ result);
        }

    }
    public static double par(double n, double quadrado, double soma){
        if(n%2==0){
            quadrado=n*n;
            return quadrado;
        } else {
            soma=n+n;
            return soma;
        }
    }
}
