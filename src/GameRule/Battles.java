package gamerule;
import java.util.ArrayList;
import ObjectModel.*;
import java.lang.Math;
public class Battles{
    ArrayList<Monster> monsters = new ArrayList<Monster>();
    public Battles(){}

    public boolean toMove = false;
    public boolean completed = false;
    Monster playerMonster = new Monster();
    
    public Monster currentOpponentMonster(){
        Monster enemy = new Monster();
        return enemy;
    }
    public void processAtaack(){
        Monster enemy = currentOpponentMonster();
        enemy._health = Math.abs(enemy._health - playerMonster._damage);
    }
    public void reward(Player player){
        player. setGold(player._gold + 10);
        player.setPoint(player._point + 10);
    }
}