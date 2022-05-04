package gamerule;

import java.util.ArrayList;
import ObjectModel.*;
public class Game{
    // public ArrayList<Battles>();
    ArrayList<Item> shopItems = new ArrayList<Item>();
    public int _day;
    public void sleep(){
        
    }
    public void refreshBattles(){

    }
    public void refreshShop(){
        
    }
    public int _currentDay;
    public int _difficulty;
    public Game(){}
    public void setDifficulty(int difficulty){
        _difficulty = difficulty;

    }
}