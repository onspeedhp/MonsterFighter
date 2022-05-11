package main.java.model;

public class Medicine extends GameItem {
	private int addHealth;


	public Medicine(String name, int price, int sell, String discription, boolean consumed, int addHealth) {
		super(name, price,sell,discription,consumed);
		this.addHealth = addHealth;
	}

	public void effects(Monster monster){
		monster.setCurrentHealth(monster.getCurrentHealth()+ this.addHealth);
	}

	
	public String getDescription() {
		return this.getName();
	}


}