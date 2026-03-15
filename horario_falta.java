import java.time.LocalTime;
import java.util.Scanner;

public class horario_falta {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        LocalTime agora = LocalTime.now(); 
        
        System.out.println("Agora são: " + agora.getHour() + ":" + agora.getMinute());
        
        int totalDoDia = 86400;
        int segundosP = agora.toSecondOfDay();
        int segundosF = (totalDoDia - segundosP);

        System.out.println("Faltam: " + segundosF + " segundos para o fim do dia.");

        sc.close();
    }
}