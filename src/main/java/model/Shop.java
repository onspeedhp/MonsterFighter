package main.java.model;

import java.util.ArrayList;

/**
 * A class representing the shop.
 */
public class Shop {
    private ArrayList<GameItem> itemForSell;
    private ArrayList<Monster> monsterForSell;
    public Shop(Generator generator, ArrayList<GameItem> itemForSell, ArrayList<Monster> monsterForSell) {
    	this.monsterForSell = monsterForSell;
    	this.itemForSell = itemForSell;
    }
    public Shop() {
    	
    }
    private void refreshShop() {
    	
    }
    public void setItemForSell(ArrayList<GameItem> itemForSell) {
    	this.itemForSell = itemForSell;
    	
    }
    public void setMonsterForSell(ArrayList<GameItem> itemForSell) {
    	this.itemForSell = itemForSell;
    	
    }
    public ArrayList<GameItem>  getItemForSell() {
    	return this.itemForSell;
    }
    public ArrayList<Monster>  getMonsterForSell() {
    	return this.monsterForSell;
    }
}