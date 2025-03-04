import java.util.Scanner;

public class App {
    public static void aoquadrado (int n){
        int result = n*n;
        System.out.println(result);
    }    
    public static void main(String[] args) throws Exception {
        Scanner sc = new Scanner(System.in);

        System.out.println("Insira um número: ");
        int n = sc.nextInt();

        aoquadrado(n);
    }
}
