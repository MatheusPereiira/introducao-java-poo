import java.util.Scanner;

public class time {
    public static void main(String[] args){
     Scanner sc = new Scanner(System.in);
     
     int vitoria, empate, pontuacao, totalV1, totalE1;

     vitoria = 3;
     empate = 1;
     

     System.out.println("Quantas vitórias seu time teve nas 10 partidas?: ");
      int totalV = sc.nextInt();
     System.out.println("Quantos empates seu time teve nas 10 partidas?: ");
      int totalE = sc.nextInt();


      totalE1 = (totalE * empate);
      totalV1 = (totalV * vitoria);

     pontuacao = (totalE1 + totalV1);
    
     System.out.println("Seu time fez " + pontuacao + " pontos no campeonato");
      if (pontuacao >= 18) {
       System.out.println("o time fez uma boa campanha! ");
      }
      else {
        System.out.println("o time fez uma campanha ruim! ");
      }
     sc.close();

    }
}