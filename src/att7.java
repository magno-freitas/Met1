public class att7 {
    public static void main(String[] args) {
        String nome = null, sobrenome = null, mae = null, cidade = null;
        String starwars = gerarnome(nome, sobrenome,mae, cidade);
        
        System.out.println("Seu nome na série Stars Wars: "+starwars);

    }
    public static String gerarnome(String nome, String sobrenome, String mae, String cidade){
        String snome=""+sobrenome.charAt(0)+sobrenome.charAt(1)+sobrenome.charAt(2)+nome.charAt(0)+nome.charAt(1);

        String wsobrenome=""+ mae.charAt(0)+mae.charAt(1)+cidade.chatAt(0)+cidade.chatAt(1)+cidade.chatAt(2);

        return nome.substring(1).toLowerCase()+ " "+ wsobrenome.substring(1).toLowerCase();
    }
}
