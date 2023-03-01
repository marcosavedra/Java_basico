import java.util.Scanner;

class Atividade6{
  public static void main(String[] args){
    Scanner scan = new Scanner(System.in);
    System.out.println("Digite o valor do raio do circulo");
    int raio = scan.nextInt();
    float area = 3.14*(raio*raio);
  }
}
