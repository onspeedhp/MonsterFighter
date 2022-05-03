package ObjectModel;

import java.util.ArrayList;
import java.util.Iterator;

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
    
    public void buy(Item item){
        inventory.add(item);
    }

    public void sell(Item item){
        inventory.remove(item);
    }

    public void setName(String name){
        _name = name;
    }

    public String getName(){
        return _name;
    }

    public void setGold(int gold){
        _gold = gold;
    }

    public int getGold(){
        return _gold;
    }

    public void setTotalGold(int totalGold){
        _totalGold = totalGold;
    }

    public int getToltalGold(){
        return _totalGold;
    }

    public void setPoint(int point){
        _point = point;
    }

    public int getPoint(){
        return _point;
    }
}

