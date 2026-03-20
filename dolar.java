import java.util.Scanner;

public class dolar {
    public static void main(String[] args){
     Scanner sc = new Scanner(System.in);

     double vDolar, vDolarC;

     System.out.println("Insira o valor em Doláres: ");
      vDolar = sc.nextDouble();
    
      vDolarC = (vDolar * 5.24);

      System.out.println("O valor em reais é de: R$" + vDolarC);
      
     sc.close();

    }
}