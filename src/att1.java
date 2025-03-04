import java.util.Scanner;

public class att1 {
    public static void verao() {
        System.out.println("Verão");
        System.out.println("Está quente");
    }
    public static void outono(){
        System.out.println("Outono");
        System.out.println("Está frio");
    }
    public static void primavera(){
        System.out.println("Primavera");
        System.out.println("Está ameno");
    }
    public static void inverno (){
        System.out.println("Inverno");
        System.out.println("Está frio");
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.println("Insira um número: ");
        int n = sc.nextInt();

        if (n == 1){
            verao();
        } else if (n == 2){
            outono();
        } else if (n == 3){
            primavera();
        } else if (n == 4){
            inverno();
        } else {
            System.out.println("Número inválido");
        }
    }
}