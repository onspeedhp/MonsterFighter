package main.java.controller;

import main.java.model.*;

import main.java.ui.*;
import java.util.ArrayList;

/**
 * A java.controller handling the game logic.
 */
public class GameController {
    // classes
    private Generator generator;
    private final Team team;
    private final Bag bag;
    private final Shop shop;
    private String playerName;
    private String difficulty;
    private int currentDay;
    private int totalDay;
    private int gold;
    private int point;

    /**
     * Constructor for the GameController.
     */
    public GameController() {
        this.team = new Team();
        this.bag = new Bag();
        this.generator = new Generator();
        this.shop = new Shop();
        startGame();
    }

    /**
     * A function used to start the game.
     */
    public void startGame() {
    	launchStartScreen();
    }
    
    public void setPlayerName(String playerName) {
    	this.playerName = playerName;
    }

    public void launchBattle() {
    	new BattleScreen(this);
    }
    public void launchStartScreen() {
        new StartScreen(this);
    }
    public void launchToShop() {
        new ToShop(this);
    }

    /**
     * Launch a new chooseMonsterScreen
     */
    public void launchWindowTitle() {
        new WindowTitle(this);
    }
    public void launchMainScreen() {
        new MainGame(this);
    }
    public void launchFightScreen() {
    	new BattleFight(this);
    }

    /**
     * Launch a new mainScreen
     */

    /**
     * Return a list of initialMonster for the player.
     * This function is designed for the chooseMonsterScreen.
     *
     * @return a list of initialMonster for the player.
     */
    public ArrayList<Monster> getInitMonsters() {
    	return this.generator.generateInitialMonsters();
    }
    public ArrayList<Monster> getenemyMonsters() {
    	return this.generator.generateenemyMonsters();
    }
    public ArrayList<Monster> getinitshopMonsters() {
    	return this.generator.generatshopMonsters();
    }
    public ArrayList<GameItem> getinitshopitem() {
    	return this.generator.generatshopitem();
    }
    /**
     * Add a new monster into the team. A TeamIsAlreadyFullException err will be thrown if the team is full.
     *
     * @param monster a monster instance
     */
    public void addMonsterToTeam(Monster monster) {
        this.team.addMonsterToTeam(monster);
    }
    public void removeMonsterToTeam(Monster monster) {
        this.team.removeMonsterToTeam(monster);
    }
    public void addItemrBag(GameItem item) {
        this.bag.addItemtoBag(item);;
    }


    /*
    getters go here
     */

    /**
     * Return the playerName stored in the gameController.
     *
     * @return the playerName stored in the gameController.
     */
    public String getPlayerName() {
        return this.playerName;
    }

    /**
     * Return the difficulty stored in the gameController.
     *
     * @return the difficulty stored in the gameController.
     */
    public String getDifficulty() {
        return this.difficulty;
    }
    public int getGold() {
        return this.gold;
    }

    public int getPoint() {
        return this.point;
    }
    public int setTotalDay(int a) {
        this.totalDay = a;
        return a;
    }
    public int setCurrentDay(int a) {
        this.currentDay = a;
        return a;
    }
    public int getCurrentDay() {
        return this.currentDay;
    }

    public int getTotalDay() {
        return this.totalDay;
    }

    /*
    setters go here
     */

    /**
     * Store the playerName in the gameController.
     *
     * @param playerName a string represent the player's name.
     */

    /**
     * Store the difficulty in the gameController.
     *
     * @param difficulty a string represent the difficulty level. (easy, hard)
     */
    public void healMonster() {
    	this.team.healMonster();
    }
    public void setDifficulty(String difficulty) {
        this.difficulty = difficulty;
    }
    
    public ArrayList<Monster> getTeamMember() {
    	return this.team.getTeamMember();
    }
    public ArrayList<GameItem> getItemBag() {
    	return this.bag.getItemBag();
    }
    /**
     * Store the gold in the gameController.
     *
     * @param gold an integer represent the current gold the player has.
     */
    public void setGold(int gold) {
        this.gold = gold;
    }

    /**
     * Store the point in the gameController.
     *
     * @param point a integer represent the current point the player has.
     */
    public void setPoint(int point) {
        this.point = point;
    }
    
}
