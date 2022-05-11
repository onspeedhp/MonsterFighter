package main.java.model;

import static java.lang.Math.max;

/**
 * The class is used for creating a gameItem.
 *
 * @see Monster
 * @see Medicine
 */
public class GameItem {
    private String name;
    private int price;
    private int sell;
    private boolean comsumed;
    private String discription;

    /**
     * The constructor for GameItems.
     * @param name Item's name
     * @param price Item's price
     */
    public GameItem(String name, int price, int sell) {
        this.name = name;
        this.price = price;
        this.sell = sell;
    }
    public GameItem(String name, int price, int sell, String discription, boolean consumed) {
        this.name = name;
        this.price = price;
        this.sell = sell;
        this.discription = discription;
        this.comsumed = consumed;
    }
    public void setConsumed(boolean a) {
    	this.comsumed = a;
    }
    /* getters go here */
    /**
     * Return the item's name.
     *
     * @return Item's name
     */
    public String getName() {
        return this.name;
    }

    /**
     * Return the item's price.
     *
     * @return Item's price
     */
    public int getPrice() {
        return this.price;
    }

    /**
     * Return the item's refund price.
     *
     * @return Item's refund price if the user wants to refund this item
     */
    public int getRefundPrice() {
        return max(0, this.price-50);
    }

    /* setters go here */
    /**
     * Set the new name to current monster.
     *
     * @param name a new name for this monster
     */
    public void setName(String name) {
        this.name = name;
    }

    /**
     * Set the new price to current monster.
     *
     * @param price a new price for this monster
     */
    public void setPrice(int price) {
        this.price = price;
    }
    public void setSell(int sell) {
    	this.sell = sell;
    }
    public int getSell() {
    	return this.sell;
    }
}
