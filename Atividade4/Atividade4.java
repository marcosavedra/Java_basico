import java.util.Scanner;


class Atividade4{
  public static void main(String[] args){
    Scanner scan = new Scanner(System.in);

    System.out.println("Digite a primeira nota: ");
    float nota1 = scan.nextFloat();

    System.out.println("Digite a primeira nota: ");
    float nota2 = scan.nextFloat();

    System.out.println("Digite a primeira nota: ");
    float nota3 = scan.nextFloat();

    System.out.println("Digite a primeira nota: ");
    float nota4 = scan.nextFloat();

    float media_bimestre = (nota1 + nota2 + nota3 + nota4) / 4; 
    System.out.println("A media do bimestre é: " + media_bimestre);
 
  }
}
