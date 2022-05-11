package main.java.model;

import main.java.model.exception.TeamIsAlreadyFullException;

import java.util.ArrayList;
//import java.util.ArrayList;
import java.util.HashMap;
import java.util.Map;

/**
 * A class represent a team of monster.
 */
public class Team {
    private final int maxTeamMember;
    private final int minTeamMember;
    // eg.. Map{0: Monster1, 1: Monster2, ...}
    private final ArrayList<Monster> teamMember;

    /**
     * Team's constructor. The default teamSize is three.
     * This constructor will initial a hashMap for storing the teamMember.
     */
    public Team() {
        this.maxTeamMember = 5;
        this.minTeamMember = 3;
        this.teamMember = new ArrayList<Monster>();
    }

    /**
     * Add a new monster to the team. An TeamIsAlreadyFullException will be thrown if the team is full.
     *
     * @param newMonster a monster instance
     * @throws TeamIsAlreadyFullException if team is already full.
     */
    public void addMonsterToTeam(Monster newMonster) {
    	this.teamMember.add(newMonster);
    }
    /**s
     * A function used to check if the team is full or not.
     *
     * @return true if the team is full. Otherwise, return false.
     */
    public boolean teamIsFull() {
        return this.teamMember.size() >= this.maxTeamMember;
    }
    public boolean teamIsMiss() {
        return this.teamMember.size() <= this.minTeamMember;
    }
    public void healMonster() {
    	for(Monster a : this.teamMember) {
    		a.heal();
    	}
    }
    public ArrayList<Monster> getTeamMember() {
        return this.teamMember;
    }
}
