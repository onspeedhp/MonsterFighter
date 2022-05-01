package Main;
import java.util.*;
import ObjectModel.Player;
public class Main{
    public static void main(String[] args) throws InterruptedException{
        try (Scanner sc = new Scanner(System.in)) {
            Player player = new Player();

            System.out.print("Greetings, adventurer! What should we call you?");
            player._name = sc.nextLine();
            System.out.print("So be it, " + player.getName() + ". Your tale starts today!\n");
        }
        Thread.sleep(1000);
    }
}