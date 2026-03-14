import java.time.LocalTime;
import java.util.Scanner;

public class horario_passado {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        LocalTime agora = LocalTime.now(); 
        
        System.out.println("Agora são: " + agora.getHour() + ":" + agora.getMinute());
    
        int segundosPassado = agora.toSecondOfDay();

        System.out.println("Já se passaram: " + segundosPassado + " segundos desde o início do dia.");

        sc.close();
    }
}