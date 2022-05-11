package main.java.model;

import java.util.ArrayList;
import java.util.Map;
import java.util.Scanner;
import java.lang.*;
public class Battles {
	private ArrayList<Monster> monster;
	private ArrayList<Monster> enemy;
//	private ArrayList<Battles> battle;
//	private Monster playerMonster ;
//	private Monster enemyMonster;
	private int baseGoldGivenOnWin;
	private int pointsGivenOnWin;
	private boolean isPlayerTurn = true;
	public Battles() {
		this.monster = monster;
		this.enemy = enemy;
	}
	
	public int getRandomNumber(int min, int max) {
	    return (int) ((Math.random() * (max - min)) + min);
	}
	
	
}
