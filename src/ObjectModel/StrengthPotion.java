package ObjectModel;

public class StrengthPotion extends Item {
    public int strenght;
    public StrengthPotion(int sellPrice, int buyPrice, String Description, boolean consumed ){
        super(buyPrice, sellPrice, Description, consumed);
    }
    public void use(Monster a){
        a._damage += strenght;
        setComsumed(true);
    }
}
