package ObjectModel;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.Random;

public class Player {
    public String _name;
    ArrayList<Monster> party  = new ArrayList<Monster>();
    ArrayList<Item> inventory  = new ArrayList<Item>();
    public int _gold;
    public int _totalGold;
    public int _point;
    public void helParty(){ 

    }
    Iterator<Monster> iterator = party.iterator();
    Iterator<Item> iterator1 = inventory.iterator();
    public void buy(ArrayList<Item> inventory){
        
    }
    public void sell(ArrayList<Item> inventory){
        
    }
    public void setName(String name){
        _name = name;
    }
    public String getName(){
        return _name;
    }
}

