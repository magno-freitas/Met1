import java.util.Scanner;

public class att2 {
    public static void Carlos(){
        System.out.println("O nome dele é Carlos");
        System.out.println("Ele tem 17 anos");
        System.out.println("Ele é estudante do SENAI");
    }
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String nome;
        System.out.println("Insira o nome do aluno: ");
        nome= sc.nextLine();
        if(nome.equals("Carlos")){
            Carlos();
        } else {
            System.out.println("O nome dele é "+(nome));
            System.out.println("Ele não é estudante do SENAI");
        }
            
       
    }
}
