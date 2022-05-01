package ObjectModel;

public class Food extends Item {
    public int bonusHealth;
    public Food(int sellPrice, int buyPrice, String Description, boolean consumed ){
        super(buyPrice, sellPrice, Description, consumed);
    }
    public void use(Monster a){
        a._health += bonusHealth;
        setComsumed(true);
    }
}
