import java.util.Scanner;

public class att6 {
    public static int met1(int base) {
        Scanner sc = new Scanner(System.in);
        
        System.out.println("Insira o segundo numero: ");
        int n1= sc.nextInt();
        System.out.println("Insira o terceiro numero: ");
        int n2= sc.nextInt();
        
        int dif=base -n1;
        if(dif<0){
            dif=-dif;
        
        }

        int dif1=base -n2;
        if(dif1<0){
            dif1=-dif1;
        
        }
        
        if( dif<dif1){
            System.out.println("O número mais próximo é: "+n1);
            return n1;
        } else if (dif1<dif){
            System.out.println("O número mais próximo é: "+n2);
            return n2;
        } else {
            System.out.println("Os números são igualmente próximos");
            return base;
        }
        
    }
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Insira o número base: ");
        int base = sc.nextInt();
        met1(base);
    }
}
