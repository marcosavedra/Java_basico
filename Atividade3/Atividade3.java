import java.util.Scanner;

class Atividade3{
  public static void main(String[] args){
    Scanner scan = new Scanner(System.in);

    System.out.println("Digite um valor: ");
    int valor1 = scan.nextInt();

    System.out.println("Digite o segundo valor: ");
    int valor2 = scan.nextInt();

    int sum = valor1 + valor2;

    System.out.println("O resultado da soma é " + sum);
  }
}
