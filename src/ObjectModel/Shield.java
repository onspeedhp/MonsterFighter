package ObjectModel;

public class Shield extends Item {
    public int strength;
    public Shield(int sellPrice, int buyPrice, String Description, boolean consumed ){
        super(buyPrice, sellPrice, Description, consumed);
    }
    public void use(Monster a){
        a._defence += strength;
        setComsumed(true);
    }
}
