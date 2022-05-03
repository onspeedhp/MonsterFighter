package Main;
import java.util.*;
import ObjectModel.*;
public class Main{
    public static void main(String[] args) throws InterruptedException{
        try (Scanner sc = new Scanner(System.in)) {
            Player player = new Player();

            System.out.println("Greetings, adventurer! What should we call you?");
            player._name = sc.nextLine();
            System.out.println("So be it, " + player.getName() + ". Your tale starts today!e");
            Thread.sleep(1000);
            System.out.println("How many days you would like to game last? (between 5 and 15 days)");

            Thread.sleep(1000);
            System.out.println("Then, please choose monsters for your team.");
            Thread.sleep(1000);
            System.out.println("There are 4 type of monster: Offence Monster, Defence Monster, General Monster");
            Thread.sleep(1000);
            System.out.println("Which type of monster do you want ?");
            
            
            // Monster monster = new Monster() ;

        }
        Thread.sleep(1000);
    }
}