import java.util.Scanner;

public class valores {
    public static void main(String[] args) {
     Scanner sc = new Scanner(System.in);

     double qdiff;

     System.out.println("Insira o valor A: ");
      int A = sc.nextInt();
     System.out.println("Insira o valor B!");
      int B = sc.nextInt();
        
      qdiff = Math.pow(A - B, 2); 

     System.out.println("O quadrado da diferença do valor A em relação ao valor B é de: " + qdiff );
     sc.close();
    }

}