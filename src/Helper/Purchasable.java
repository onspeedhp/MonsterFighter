package Helper;

public class Purchasable {
    public int buyPrice;
    public int sellPrice;
    public String Description;
    public Purchasable(){}
    public Purchasable(int buyPrice, int sellPrice, String Description) {
        buyPrice = this.buyPrice;
        sellPrice = this.sellPrice;
        Description = this.Description;
    }
    public String getDescription(){
        return this.Description;
    }

}
