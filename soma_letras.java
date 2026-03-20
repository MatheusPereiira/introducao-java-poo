import java.util.Scanner;

public class soma_letras{
    public static void main(String[] args){
     Scanner sc = new Scanner(System.in);

     int a, b, c;

     System.out.println("Insira o valor de A: ");
      a = sc.nextInt();
     System.out.println("Insira o valor de B: ");
      b = sc.nextInt();
     System.out.println("Insira o valor de C: ");
      c = sc.nextInt();
      
     int soma = a + b + c;
     int resultado = (soma * soma);
     
      System.out.println("O valor do quadrado da soma dos três valores é: " + resultado );
      
     sc.close();

    }
}