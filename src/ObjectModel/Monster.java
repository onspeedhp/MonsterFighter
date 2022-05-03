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
    public Monster(String type, String species, String name, int health, int damage,int heal_amount, int max_health, int experience, int level, int attack, int defence, boolean alive) {
       _type = type;
       _species = species;
        _name = name;
        _health = health;
        _damage = damage;
        _heal_amount = heal_amount;
        _max_health = max_health;
        _experience = experience;
        _level = level;
        _attack = attack;
        _defence = defence;
        _alive = alive;
    }
    public Monster(String mtype, String mspecies){
        switch(mtype){
            case("Offence type"):{
                switch(mspecies){
                    case("Common"):{
                        sethealth(15);
                        setDamge();
                        set;
                        atk = 13;
                        def = 16;
                    }
                    case("Uncommon"):{
                        hp = 1;
                        dmg = 35;
                        ha = 1;
                        atk = 17;
                        def = 19;
                    }
                    case("Rare"):{
                        hp = 65;
                        dmg = 25;
                        ha = 32;
                        atk = 18;
                        def = 18;
                    }
                }
            }
            case("Defence type"):{
                switch(mspecies){
                    case("Common"):{
                        hp = 65;
                        dmg = 12;
                        ha = 35;
                        atk = 9;
                        def = 20;
                    }
                    case("Uncommon"):{
                        hp = 60;
                        dmg = 15;
                        ha = 25;
                        atk = 10;
                        def = 23;
                    }
                    case("Rare"):{
                        hp = 110;
                        dmg = 18;
                        ha = 50;
                        atk = 11;
                        def = 19;
                    }
                }
                
            }
            case("General type"):{
                switch(mspecies){
                    case("Common"):{
                        hp = 50;
                        dmg = 15;
                        ha = 25;
                        atk = 10;
                        def = 18;
                    }
                    case("Uncommon"):{
                        hp = 60;
                        dmg = 25;
                        ha = 30;
                        atk = 9;
                        def = 19;
                    }
                    case("Rare"):{
                        hp = 70;
                        dmg = 25;
                        ha = 9999;
                        atk = 12;
                        def = 20;
                    }
                }
                
            }
            case("Unique type"):{
                switch(mspecies){
                    case("Common"):{
                        hp = 75;
                        dmg = 20;
                        ha = 35;
                        atk = 13;
                        def = 13;
                    }
                    case("Uncommon"):{
                        hp = 60;
                        dmg = 50;
                        ha = 30;
                        atk = 6;
                        def = 18;
                    }
                    case("Rare"):{
                        hp = 150;
                        dmg = 20;
                        ha = 0;
                        atk = 12;
                        def = 21;
                    }
                }
            }
        }
    }
    // public int target(Monster e){
    //     int damage;
    //     damage = (int)(e.get)
    // }
    // protected
    protected void setMonsterName(String name) {
            _name = name;
        }

    public String getMonsterName() {
        return _name;
    }

    public int getDamage(){
        return _damage;   
    }
    protected void setHealth(int health) {
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
    

    // public int getAttack(boolean isSkillUsed) {
    //     if (isSkillUsed) {
    //         switch (_skill) {
    //             case BITE:
    //                 return _attack * 2;
    //             case KICK:
    //                 return _attack * 5;
    //             case CLAW:
    //                 return _attack * 10;
    //             default:
    //                 return _attack;
    //         }
    //     }
    //     return _attack;
    // }

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
    // protected boolean attackUsingSkill(Monster enemy, boolean isSkillUsed) {

    //     int live;
    //     if (isSkillUsed) {
    //         System.out.println(_name+ " attack using skill " + _skill.name() + "(" + getAttack(true) + ")");
    //         live = enemy.health - getAttack(true);
    //     } else {
    //         System.out.println(getMonsterName() + " attack (" + getAttack(false) + ")");
    //         live = enemy.health - getAttack(false);
    //     }
    //     enemy.health=live;
    //     if (enemy.gethealth() > 0) {
    //         System.out.println(enemy._name + "(" + enemy.health + ")");
    //         return false;
    //     } else {
    //         System.out.println(enemy._name + "(DEFEATED)");
    //         return true;
    //     }
    // }
}
