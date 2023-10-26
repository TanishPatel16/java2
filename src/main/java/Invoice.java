import java.util.*;
public class Invoice {
    private String name;
    private String streetAddr;
    private String city;
    private String state;
    private int zip;
    private ArrayList<Item> items;
    private float totalCost;
    private float shippingCost;
    public Invoice(String name, String streetAddr, String city, String state, int zip, ArrayList<Item> items, float totalCost, float shippingCost){
        this.name = name;
        this.streetAddr = streetAddr;
        this.city = city;
        this.state = state;
        this.zip = zip;
        this.items = items;
        this.totalCost = totalCost;
        this.shippingCost = shippingCost;
    }

    public String toString(){
        String shipTo = "Ship to: " + "\n" + "\t" + this.name + "\n" + "\t" + this.streetAddr + "\n" + "\t" + this.city + ", " + this.state + " " + this.zip;
        String itemString = "Items: " + "\n" + "------" + "\n";
        for(int i=0; i<this.items.size(); ++i){
            String item ="";
            Item it = this.items.get(i);
            item += it.getName() + "\t" + "(" + it.getQuantity() + ")" + "\t" + "$" + it.getCost() + "\t" + "$" + Float.toString(it.getCost() * it.getQuantity());
            itemString +=item + "\n";
        }
        String shipCostString = "Shipping: ";
        if(this.totalCost >= 10)
            shipCostString += "Free";
        else
            shipCostString += Float.toString(this.shippingCost);

        String totalCostString = "Total Cost" + "\n" + "------" + "\n" + "$" + Float.toString(this.totalCost);


        return shipTo + "\n" + "\n" + itemString + "\n"  + shipCostString + "\n" + "\n" + totalCostString;
    }
}
