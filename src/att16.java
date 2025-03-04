// Faça um programa que descubra:
// a) O maior elemento de um vetor.
// b) O menor elemento.
// c) A média dos valores
// Retorne esses valores

public class att16 {
public static void main(String[] args) {
    int[] vetor = { 1, 2, 3, 4, 5, 6, 7, 8, 9, 10 };
    int maior = maior(vetor);
    int menor = menor(vetor);
    double media=media(vetor);
System.out.println("Maior: "+maior);
System.out.println("Menor: "+menor);
System.out.println("Média: "+media);
  
}
 public static int maior(int[] vetor) {
     int maior = vetor[0];
     for (int i = 0; i < vetor.length; i++) {
         if (vetor[i] > maior) {
             maior = vetor[i];
         }
     }
    return maior;
}
 public static int menor(int[] vetor) {
     int menor = vetor[0];
     for (int i = 0; i < vetor.length; i++) {
         if (vetor[i] < menor) {
             menor = vetor[i];
         }
     }
    return menor;
}
 public static double media(int[] vetor) {
     double media = 0;
     for (int i = 0; i < vetor.length; i++) {
         media += vetor[i];
     }
    return media / vetor.length;
}
}
