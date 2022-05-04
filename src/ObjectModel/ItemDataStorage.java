package ObjectModel;

import java.util.*;

import main.java.utilities.ListGenerator;


/**
 * This class is used for initialize and store all gameItems data. This class will be used by generator.
 *
 * @see GameItem
 * @see Generator
 */
public class ItemDataStorage {
    private final ListGenerator listGenerator;
    // {monsters: {monsterName: {price: [a list of integer], health: [a list of integer], ...}}
    private final Map<String, Map<MonsterListKey, List<Integer>>> monsters;


    /**
     * The constructor for ItemDataStorage
     */
    public ItemDataStorage(ListGenerator listGenerator) {
        this.listGenerator = listGenerator;
        monsters = new HashMap<>();

        initMonsters();
    }

    /* getters go here */
    /**
     * Return a map which representing all monsters.
     * User can retrieve a monster's property via the map.
     * Example code:
     * monsterPrice = ItemDataStorage.getMonsters().get("MonsterName").get("price");
     * monsterHealth = ItemDataStorage.getMonsters().get("MonsterName").get("health");
     *
     * @return A map which representing all monsters.
     */
    public Map<String, Map<MonsterListKey, List<Integer>>> getMonsters() {
        return this.monsters;
    }

    /* private functions */
    /**
     * Initialize all default monsters. Users can assess monsters' data via the variable "monsters"
     */
    private void initMonsters() {
        // Monster 1
        this.monsters.put("Monster1", initMonsterProperties(1, 100, 400, 500,
                50, 60, 1,4,1,1,1,1));
        // Monster 2
        this.monsters.put("Monster2", initMonsterProperties(50, 200, 500, 600,
                60, 500, 5,6,1,1,1,1);
        this.monsters.put("Monster3", initMonsterProperties(50, 200, 500, 600,
                60, 500, 5,6,1,1,1,1));
        this.monsters.put("Monster4", initMonsterProperties(50, 200, 500, 600,
                60, 500, 5,6,1,1,1,1));
        this.monsters.put("Monster5", initMonsterProperties(50, 200, 500, 600,
                60, 500, 5,6,1,1,1,1));
    }

    /**
     * Initialize a single monster's properties (price, health, damage, level)
     *
     * @param minPrice an integer value which indicate the lower bound of the monster's price (inclusive)
     * @param maxPrice an integer value which indicate the upper bound of the monster's price (inclusive)
     * @param minHealth an integer value which indicate the lower bound of the monster's health (inclusive)
     * @param maxHealth an integer value which indicate the upper bound of the monster's health (inclusive)
     * @param minDamage an integer value which indicate the lower bound of the monster's damage (inclusive)
     * @param maxDamage an integer value which indicate the upper bound of the monster's damage (inclusive)
     * @param minLevel an integer value which indicate the lower bound of the monster's level (inclusive)
     * @param maxLevel an integer value which indicate the upper bound of the monster's level (inclusive)
     * @return a HashMap<String, List<Integer>. e.g. {"price": [a list of integer], "health", [a list of integer]...}
     */
    private HashMap<MonsterListKey, List<Integer>> initMonsterProperties(int minPrice, int maxPrice, int minHealth, int maxHealth,
                                                                 int minDamage, int maxDamage,int minHeal_Amount, int maxHeal_Amount, int minAttack, int maxAttack, int minDefence, int maxDefence) {
        HashMap<MonsterListKey, List<Integer>> result = new HashMap<>();

        result.put(MonsterListKey.NAME, listGenerator.createListFromRange(minPrice, maxPrice));
        result.put(MonsterListKey.HEALTH, listGenerator.createListFromRange(minHealth, maxHealth));
        result.put(MonsterListKey.DAMAGE, listGenerator.createListFromRange(minDamage, maxDamage));
        result.put(MonsterListKey.HEAL_AMOUNT, listGenerator.createListFromRange(minHeal_Amount, maxHeal_Amount));
        result.put(MonsterListKey.ATTACK, listGenerator.createListFromRange(minAttack, maxAttack));
        result.put(MonsterListKey.DEFENCE, listGenerator.createListFromRange(minDefence, maxDefence));
        return result;
    }
}

