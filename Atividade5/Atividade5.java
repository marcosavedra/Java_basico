import java.util.Scanner;

class Atividade5{
  public static void main(String[] args){
    Scanner scan = new Scanner(System.in);

    System.out.println("Digite um valor em metros para converter: ");
    double valorMetro = scan.nextDouble();

    System.out.println("O valor da conversão é " + valorMetro*100 + "  Centimetros");
  }
}
