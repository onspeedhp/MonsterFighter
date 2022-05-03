package GameRule;
import java.util.ArrayList;
import ObjectModel.*;
import Math;
public class Battles{
    ArrayList<Monster> monsters = new ArrayList<Monster>();
    public Battles(){}

    public boolean toMove = false;
    public boolean completed = false;
    Monster playerMonster = new Monster();
    
    public void currentOpponentMonster(){
        Monster enemy = new Monster();
        return enemy;
    }
    public void processAtaack(){
        enemy = currentOpponentMonster();
        enemy._health = Math.abs(enemy._health - playerMonster._damage);
    }
    public void reward(Player player){
        setGold(player._gold + 10);
        setPoint(player._point + 10);
    }
}