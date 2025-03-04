import java.util.Scanner;
public class att12 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        double h,b;
        System.out.println("Insira a altura do retângulo: ");
        h=sc.nextDouble();
        System.out.println("Insira a base do retângulo: ");
        b=sc.nextDouble();

        System.out.println("A área do retângulo é: "+area(h,b));
        System.out.println("O perímetro do retângulo é: "+perimetro(h,b));

    }
    public static double area(double h, double b){
        return h*b;
        
    }
    public static double perimetro(double h, double b){
        return 2*(h+b);
    }
}
