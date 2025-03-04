
import java.util.Scanner;

public class att7 {
    public static void main(String[] args) {
        String nome = null, sobrenome = null, mae = null, cidade = null;
        String starwars = gerarnome(nome, sobrenome,mae, cidade);
        Scanner sc = new Scanner(System.in);    
        System.out.println("Digite seu primero nome: ");
        nome = sc.nextLine();
        System.out.println("Digite seu sobrenome: ");
        sobrenome = sc.nextLine();
        System.out.println("Digite o nome da sua mae: ");
        mae = sc.nextLine();
        System.out.println("Digite o nome da cidade onde você nasceu: ");
        cidade = sc.nextLine();
        starwars = gerarnome(nome, sobrenome, mae, cidade);
        System.out.println("Seu nome na série Stars Wars: "+starwars);
        sc.close();  
    }

    public static String gerarnome(String nome, String sobrenome, String mae, String cidade) {
        String starwarsNome=""+sobrenome.charAt(0)+sobrenome.charAt(1)+sobrenome.charAt(2)+nome.charAt(0)+nome.charAt(1);
        String starwarsSobrenome=""+mae.charAt(0)+mae.charAt(1)+cidade.charAt(0)+cidade.charAt(1)+cidade.charAt(2);
        return starwarsNome.substring(1).toLowerCase()+ " "+ starwarsSobrenome.substring(1).toLowerCase();
    }
}