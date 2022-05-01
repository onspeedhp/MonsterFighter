package ObjectModel;

import Helper.Purchasable;

public class Item extends Purchasable {
    
    public Item(int buyPrice, int sellPrice, String Description, boolean consumed ){
        super(buyPrice,sellPrice,Description);
    }
    public void use(Monster a){

    }
    public boolean consumed = false;
    public void setComsumed(boolean consumed){
        consumed = this.consumed;
    }
    public boolean getConsumed(){
        return consumed;
    }
}
