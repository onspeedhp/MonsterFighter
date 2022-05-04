package ObjectModel;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;
import java.util.Map;
import ObjectModel.*;
import main.java.utilities.RandomPicker;

public class Generator {
    private ItemDataStorage itemDataStorage;
    private RandomPicker randomPicker;


   
    public Generator(ItemDataStorage itemDataStorage, RandomPicker randomPicker) {
        this.itemDataStorage = itemDataStorage;
        this.randomPicker = randomPicker;
    }

    public Monster generateMonster() {
        List<String> names = new ArrayList<>(this.itemDataStorage.getMonsters().keySet());
        String name = this.randomPicker.getItemFromStrList(names);
        Map<MonsterListKey, List<Integer>> monsterInfo = this.itemDataStorage.getMonsters().get(name);
        int health = this.randomPicker.getItemFromIntList(monsterInfo.get(MonsterListKey.HEALTH));
        int damage = this.randomPicker.getItemFromIntList(monsterInfo.get(MonsterListKey.DAMAGE));
        int heal_amount = this.randomPicker.getItemFromIntList(monsterInfo.get(MonsterListKey.HEAL_AMOUNT));
        int attack =  this.randomPicker.getItemFromIntList(monsterInfo.get(MonsterListKey.ATTACK));
        int defence =  this.randomPicker.getItemFromIntList(monsterInfo.get(MonsterListKey.DEFENCE));
        // generate and return a new monster
        return new Monster(name, health, damage, heal_amount, attack, defence);
    }

    /**
     * This function is aim to generate the initMonsters for the very first round of the game.
     *
     * @return a list of initMonster
     */
    public ArrayList<Monster> generateInitialMonsters() {
        ArrayList<Monster> initMonsters = new ArrayList<>();
        Monster monster1 = new Monster("Monster 1", 100, 500, 200, 1,1);
        Monster monster2 = new Monster("Monster 2", 100, 550, 150, 1,1);
        Monster monster3 = new Monster("Monster 3", 100, 600, 100, 1,1);
        Monster monster4 = new Monster("Monster 4", 100, 700, 50, 1,1);
        Monster monster5 = new Monster("Monster 5", 100, 800, 30, 1,1);
        Collections.addAll(initMonsters, monster1, monster2, monster3, monster4, monster5);
        return initMonsters;
    }
}