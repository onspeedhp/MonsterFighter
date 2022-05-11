package main.java.model;

import java.util.Map;

public class Weapon extends GameItem {
	int damage;


	public Weapon(String name, int price, int sell, String discription, boolean consumed, int damage) {
		super(name, price,sell,discription,consumed );
		this.damage = damage;
	}

	public void effects(Monster monster){
		monster.setDamage(monster.getDamage()+ this.damage);
	}
	public String getDescription() {
		return this.getName();
	}
}
