import java.util.Scanner;
public class att9 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
         double soma=0;
         int count=0;
         
         while(count<4){
            System.out.println("Insira um número "+(count+1)+ ": ");
            double n=sc.nextDouble();
            soma=retorno(soma, n);
            count++;
        }
        System.out.println("A soma dos números é: "+soma);
    }
    public static double retorno(double soma, double n){
        return soma+n;
    }
}
