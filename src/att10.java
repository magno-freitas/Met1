import java.util.Scanner;

public class att10 {
        public static void main(String[] args) {
            Scanner sc=new Scanner(System.in);
            System.out.println("Insira um número: ");
            int n=sc.nextInt();
            System.out.println(par(n));
            if(par(n)){
                System.out.println("O número é par");
                System.out.println("O número é impar");
            }else{
            }
        }
        public static boolean par(int n){
            if(n%2==0){
                return true;
            }else{
                return false;
            }
            }
        }

