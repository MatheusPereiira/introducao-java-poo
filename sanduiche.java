import java.util.Scanner;

public class sanduiche {
 public static void main(String[] args){
 Scanner sc = new Scanner(System.in);
      
 double qtd_peso_queijo, qtd_peso_presunto, qtd_peso_hamburguer, totalP, totalH, totalQ;    
      
 qtd_peso_presunto = 50;
 qtd_peso_queijo= 50;
 qtd_peso_hamburguer = 100;

 System.out.print("Quantos sanduíches o cliente deseja comprar? ");
 int qtdSanduiches = sc.nextInt();

 totalP = (qtdSanduiches * (qtd_peso_presunto * 2));
 totalH = (qtdSanduiches * qtd_peso_hamburguer);
 totalQ = (qtdSanduiches * qtd_peso_queijo); 

 System.out.print("Você precisa comprar " + totalQ + " Grama de queijo, " + totalP + " Grama de presunto e " + totalH + " Gramade hamburguer." );

 sc.close();
 }
 
}