package ObjectModel;

import Helper.Purchasable;

public class Monster extends Purchasable {

    public String _type;
    public String _species;
    public String _name;
    public int _health;
    public int _damage;
    public int _heal_amount;
    public int _max_health;
    public int _experience;
    public int _level;
    public int _attack;
    public int _defence;
    public boolean _alive = true;
    public int gold;

    public Monster(){}
    public Monster(int buyPrice, int sellPrice, String Description){
        super(buyPrice, sellPrice, Description);
    }
    public Monster(String name, int health, int damage,int heal_amount, int attack, int defence) {
        _name = name;
        _health = health;
        _damage = damage;
        _heal_amount = heal_amount;
        _attack = attack;
        _defence = defence;
    }
    public Monster(String mtype, String mspecies){
        switch(mtype){
            case("Offence type"):{
                switch(mspecies){
                    case("Common"):{
                        setHealth(15);
                        setDamge(15);
                        setHealthAmount(15);
                        setAttack(15);;
                        setDefence(15);
                    }
                    case("Uncommon"):{
                        setHealth(15);
                        setDamge(15);
                        setHealthAmount(15);
                        setAttack(15);;
                        setDefence(15);
                    }
                    case("Rare"):{
                        setHealth(15);
                        setDamge(15);
                        setHealthAmount(15);
                        setAttack(15);;
                        setDefence(15);
                    }
                }
            }
            case("Defence type"):{
                switch(mspecies){
                    case("Common"):{
                        setHealth(15);
                        setDamge(15);
                        setHealthAmount(15);
                        setAttack(15);;
                        setDefence(15);
                    }
                    case("Uncommon"):{
                        setHealth(15);
                        setDamge(15);
                        setHealthAmount(15);
                        setAttack(15);;
                        setDefence(15);
                    }
                    case("Rare"):{
                        setHealth(15);
                        setDamge(15);
                        setHealthAmount(15);
                        setAttack(15);;
                        setDefence(15);
                    }
                }
                
            }
            case("General type"):{
                switch(mspecies){
                    case("Common"):{
                        setHealth(15);
                        setDamge(15);
                        setHealthAmount(15);
                        setAttack(15);;
                        setDefence(15);
                    }
                    case("Uncommon"):{
                        setHealth(15);
                        setDamge(15);
                        setHealthAmount(15);
                        setAttack(15);;
                        setDefence(15);
                    }
                    case("Rare"):{
                        setHealth(15);
                        setDamge(15);
                        setHealthAmount(15);
                        setAttack(15);;
                        setDefence(15);
                    }
                }
                
            }
            case("Unique type"):{
                switch(mspecies){
                    case("Common"):{
                        setHealth(15);
                        setDamge(15);
                        setHealthAmount(15);
                        setAttack(15);;
                        setDefence(15);
                    }
                    case("Uncommon"):{
                        setHealth(15);
                        setDamge(15);
                        setHealthAmount(15);
                        setAttack(15);;
                        setDefence(15);
                    }
                    case("Rare"):{
                        setHealth(15);
                        setDamge(15);
                        setHealthAmount(15);
                        setAttack(15);;
                        setDefence(15);
                    }
                }
            }
        }
    }
    public void setDefence(int defence) {
        _defence = defence;
    }
    public void setHealthAmount(int heal_amount) {
        _heal_amount = heal_amount;
    }
    public void setDamge(int damage) {
        _damage = damage;
    }

    public void setName(String name) {
            _name = name;
        }

    public String getName() {
        return _name;
    }

    public int getDamage(){
        return _damage;   
    }
    public void setHealth(int health) {
        _health = health;
    }

    public int getHealth() {
        return _health;
    }
    public void setAlive(boolean alive){
        _alive = alive;
    }
    public boolean getalive(){
        if (_health <=0 ){
            _alive = false;
        }
        return _alive;
    }


    public void setAttack(int attack) {
        _attack = attack;
    }
    public int getAttack(){
        return _attack;
    }
    public void attack(Monster enemy){
        int live;
        live = enemy._health - getDamage();
        enemy._health = live;
        if(enemy._health <= 0){
            enemy.setAlive(false);
            System.out.println(enemy._name + "is defeated");
        }
        else {
            System.out.println(enemy._name + "is not defeated");
        }

    }
    public void heal(){

    }
    public void reset(){

    }
    public void levelUp(){
        ++_level;
        _attack += 5;
        _health += 10;
        _defence += 5;
        _damage += 5;
    }
}
