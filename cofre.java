import java.util.Scanner;

public class cofre { 
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        
        Double moeda1, moeda2, moeda3, moeda4, moeda5, moeda6, totalAcumulado;

        moeda1 = 0.01;
        moeda2 = 0.05;
        moeda3 = 0.10;
        moeda4 = 0.25;
        moeda5 = 0.50;
        moeda6 = 1.00;
           
        System.out.println("Quantas moedas você tem no cofrinho de 1 centavo? ");
           int qtdMoeda1 = sc.nextInt();
        System.out.println("Quantas moedas você tem no cofrinho de 5 centavos? ");
            int qtdMoeda2 = sc.nextInt();
        System.out.println("Quantas moedas você tem no cofrinho de 10 centavos? ");
            int qtdMoeda3 = sc.nextInt();
        System.out.println("Quantas moedas você tem no cofrinho de 25 centavos? ");
            int qtdMoeda4 = sc.nextInt();
        System.out.println("Quantas moedas você tem no cofrinho de 50 centavos? ");
            int qtdMoeda5 = sc.nextInt();
        System.out.println("Quantas moedas você tem no cofrinho de 1 real?");
            int qtdMoeda6 = sc.nextInt();

        
        totalAcumulado = ((qtdMoeda1*moeda1) + (qtdMoeda2*moeda2) + (qtdMoeda3*moeda3) + (qtdMoeda4*moeda4) + (qtdMoeda5*moeda5) + (qtdMoeda6*moeda6));
    
        System.out.println("O valor que você juntou no cofrinho foi de: R$" + totalAcumulado );
        
        sc.close();
    } 
    
}