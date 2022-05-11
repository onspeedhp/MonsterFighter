package main.java.model;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;
import java.util.Map;


public class Generator {


    /**
     * Constructor for Generator
     *
     * @param itemDataStorage ItemDataStorage instance
     * @param randomPicker RandomPicker instance
     * @see ItemDataStorage
     * @see RandomPicker
     */
    public Generator(){
    	
    }

    /**
     * Randomly generate a monster.
     * This function will construct a monster by using the data stored in the ItemDataStorage.
     *
     * @return a single randomly generated monster.
     */

    /**
     * This function is aim to generate the initMonsters for the very first round of the game.
     *
     * @return a list of initMonster
     */
    public ArrayList<Monster> generateInitialMonsters() {
        ArrayList<Monster> initMonsters = new ArrayList<>();
        Monster monster1 = new Monster("Acidh", 100, 50, 40, 21, 1);
        Monster monster2 = new Monster("Putrid", 100, 50, 65, 12, 1);
        Monster monster3 = new Monster("Spiri", 100, 50, 50, 15, 1);
        Monster monster4 = new Monster("Duskmut", 100, 50, 75, 20, 1);
        Monster monster5 = new Monster("Noxious", 100, 50, 60, 18, 1);
        Collections.addAll(initMonsters, monster1, monster2, monster3, monster4, monster5);
        return initMonsters;
    }
    public ArrayList<Monster> generateenemyMonsters() {
        ArrayList<Monster> initMonsters = new ArrayList<>();
        Monster enemy1 = new Monster("Darius", 100, 50, 1, 35, 1);
        Monster enemy2 = new Monster("Malphile", 100, 50, 60, 15, 1);
        Monster enemy3 = new Monster("Ashe", 100, 50, 60, 25, 1);
        Monster enemy4 = new Monster("Victor", 100, 50, 60, 50, 1);
        Monster enemy5 = new Monster("Ezreal", 100, 50, 40, 21, 1);
        Collections.addAll(initMonsters, enemy1, enemy2, enemy3, enemy4, enemy5);
        return initMonsters;
    }
    public ArrayList<Monster> generatshopMonsters() {
        ArrayList<Monster> initshopMonsters = new ArrayList<>();
        Monster enemy1 = new Monster("Darius", 100, 50, 500, 200, 1);
        Monster enemy2 = new Monster("Malphile", 100, 50, 550, 150, 1);
        Monster enemy3 = new Monster("Ashe", 100, 50, 600, 100, 1);
        Monster enemy4 = new Monster("Victor", 100, 50, 700, 50, 1);
        Monster enemy5 = new Monster("Ezreal", 100, 50, 800, 30, 1);
        Collections.addAll(initshopMonsters, enemy1, enemy2, enemy3, enemy4, enemy5);
        return initshopMonsters;
    }
    public ArrayList<GameItem> generatshopitem() {
        ArrayList<GameItem> initshopitem = new ArrayList<>();
        Weapon sword = new Weapon("Sword", 100, 50,"Add 50 to monster's damage", true, 50);
        Medicine medicine = new Medicine("Pill", 100, 50, "Add 50 to monster's health", true, 50);
        Weapon knife = new Weapon("Knife", 60, 30, "Add 30 to monster's damage", true, 30);
        Medicine shield = new Medicine("shield", 60, 30, "Add 50 to monster's health", true, 30);
        Collections.addAll(initshopitem, sword, medicine, knife, shield);
        return initshopitem;
    }

//	public Monster generateMonster() {
//		
//		Monster = new Monster("")
//		return null;
//	}
    
}