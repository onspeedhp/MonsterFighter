package Main;
import java.util.*;
import ObjectModel.*;
import gamerule.*;
public class Main{
    public static void main(String[] args) throws InterruptedException{
    	Scanner sc = new Scanner(System.in);
        Player player = new Player();
        Monster monster = new Monster("Offence Monster - Common",40,21,20,13,16);
        player.addMonster(monster);
        Game game = new Game();
        System.out.println("Greetings, adventurer! What should we call you?");
        player._name = sc.nextLine();
        System.out.println("So be it, " + player.getName() + ". Your tale starts today!");
        Thread.sleep(1000);
        System.out.println("How many days you would like to game last? (between 5 and 15 days)");
        game._day = 5;
        Thread.sleep(1000);
        System.out.println("Yes. Do you want to name the monster ?");
        monster._name = sc.nextLine();
        System.out.println(monster._name);
        Thread.sleep(1000);
        System.out.print("Done");
        sc.close();
    }
}