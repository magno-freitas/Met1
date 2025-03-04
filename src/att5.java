import java.util.Scanner;

public class att5 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.println("Insira um número: ");
        int n = sc.nextInt();
        System.out.println("Insira outro número: ");
        int n1 = sc.nextInt();

        boolean diferenca = (n - n1 == 5) || (n1 - n == 5);
        
        if(n==5 || n1==5|| (n+n1)==5|| diferenca ){
            int cuboN= n*n*n;
            int cuboN1= n1*n1*n1;
            System.out.println("O cubo do primeiro número é: "+cuboN);
            System.out.println("O cubo do segundo número é: "+cuboN1);

            int quadradoN= n*n;
            int quadradoN1= n1*n1;
            System.out.println("O quadrado do primeiro número é: "+quadradoN);
            System.out.println("O quadrado do segundo número é: "+quadradoN1);
            
        }



    }
    public static int cinco(int n, int n1){
                System.out.println(n + " " + n1);
        return 5;
        
    }
}
