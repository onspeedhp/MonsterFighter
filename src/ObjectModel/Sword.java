package ObjectModel;

public class Sword extends Item {
    public int damage = 10;
    public Sword(int sellPrice, int buyPrice, String Description, boolean consumed ){
        super(buyPrice, sellPrice, Description, consumed);
    }
    public void use(Monster a){
        a._attack += damage;
        setComsumed(true);
    }
}
