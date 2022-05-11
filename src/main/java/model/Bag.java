package main.java.model;

import main.java.model.exception.TeamIsAlreadyFullException;

import java.util.ArrayList;
//import java.util.ArrayList;
import java.util.HashMap;
import java.util.Map;

/**
 * A class represent a team of monster.
 */
public class Bag {
    private final int maxitem;
    private final int minitem;
    // eg.. Map{0: Monster1, 1: Monster2, ...}
    private final ArrayList<GameItem> bagitem;

    /**
     * Team's constructor. The default teamSize is three.
     * This constructor will initial a hashMap for storing the teamMember.
     */
    public Bag() {
        this.maxitem = 5;
        this.minitem = 3;
        this.bagitem = new ArrayList<GameItem>();
    }

    /**
     * Add a new monster to the team. An TeamIsAlreadyFullException will be thrown if the team is full.
     *
     * @param newMonster a monster instance
     * @throws TeamIsAlreadyFullException if team is already full.
     */
    public void addItemtoBag(GameItem item) {
    	this.bagitem.add(item);
    }
    /**s
     * A function used to check if the team is full or not.
     *
     * @return true if the team is full. Otherwise, return false.
     */
    public boolean teamIsFull() {
        return this.bagitem.size() >= this.maxitem;
    }
    public boolean teamIsMiss() {
        return this.bagitem.size() <= this.minitem;
    }

    public ArrayList<GameItem> getItemBag() {
        return this.bagitem;
    }
}
