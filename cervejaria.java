import java.util.Scanner;

public class cervejaria {
  public static void main(String[] args) {
    Scanner sc = new Scanner(System.in);

    double chopp300, chopp500, chopp800, quantp, quantm, quantg, valorAPagar;
    chopp300 = 12.0;
    chopp500 = 15.0;
    chopp800 = 18.0;

    System.out.print("Qual a quantidade de chopps pequenos: ");
    quantp = sc.nextDouble();
    System.out.print("Qual a quantidade de chopps médios: ");
    quantm = sc.nextDouble();
    System.out.print("Qual a quantidade de chopps grandes: ");
    quantg = sc.nextDouble();

    valorAPagar = ((quantp * chopp300) + (quantm * chopp500) + (quantg * chopp800));

    System.out.printf("O valor a ser pago pelo cliente é de: R$ %.2f" + valorAPagar);
  }
}