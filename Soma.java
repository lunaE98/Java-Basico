import java.util.Scanner;

public class SomaSimples {
  public static void main(String[] args) {
    Scanner ler = new Scanner(System.in);
    int A, B, soma = 0;

    A = ler.nextInt();
    B = ler.nextInt();
    
    soma = A + B;
    System.out.println( "SOMA = " + soma);
  }
}