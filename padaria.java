import java.util.Scanner;

public class padaria {
  public static void main(String[] args) {
    Scanner sc = new Scanner(System.in);

    double Pao, Pao_de_queijo, quant_Pao, quant_Pao_De_Queijo, valorAPagar_Pao_De_Queijo, valorAPagarPao, valorAPagar;
    Pao = 0.20;
    Pao_de_queijo = 2.80;

    System.out.print("Qual a quantidade de pães: ");
    quant_Pao = sc.nextDouble();
    System.out.print("Qual a quantidade de pães de queijo: ");
    quant_Pao_De_Queijo = sc.nextDouble();

    valorAPagar_Pao_De_Queijo = (quant_Pao_De_Queijo * Pao_de_queijo);
    valorAPagarPao = (quant_Pao * Pao);

    valorAPagar = valorAPagar_Pao_De_Queijo + valorAPagarPao;

    System.out.printf("O valor a ser pago pelo cliente é de: R$ %.2f", valorAPagar);

    sc.close();
  }
}