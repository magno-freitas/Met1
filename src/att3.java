import java.util.Scanner;

public class att3 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n;
        System.out.println("Insira um número: ");
        n = sc.nextInt();
        exibir(n);

    }
    public static void exibir(int n){
        System.out.println("Numero inserido: "+n);
        for(int i = 0; i < 20; i++){
            System.out.println("Numero " +(i) + " Após o número inserido: "+(n+i));
        }
    }
}
