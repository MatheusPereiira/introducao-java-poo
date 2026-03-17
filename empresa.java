import java.util.Scanner;

public class empresa {
    public static void main(String[] args){
     Scanner sc = new Scanner(System.in);
  
     double s, novoS;
     
     System.out.println("Qual é o atual salário do funcionário? ");
      s = sc.nextDouble();

      novoS = ((s / 100) *25 + (s));
      
      System.out.println("O novo salário é de: R$" + novoS);


     sc.close();

    }

}