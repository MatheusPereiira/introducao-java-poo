import java.util.Scanner;

public class multiplos{
    public static void main(String[] args){
     Scanner sc = new Scanner(System.in);

     System.out.println("Insira o número: ");
     int numero = sc.nextInt();
      if (numero % 2 == 0){
        System.out.println("Seu número é múltiplo de 2!: ");
      }
      else {
       System.out.println("Seu número não é múltiplo de 2! : ");
      }

     sc.close();
    }
}