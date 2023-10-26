import java.util.*;
public class ShoppingCart {
    private ArrayList<Item> arr;
    private float totalCost;
    private float shippingCost;

    public ShoppingCart(){
        this.arr = new ArrayList<Item>();
        this.totalCost = 0;
    }

    public ShoppingCart(float shippingCost){
        this.arr = new ArrayList<Item>();
        this.shippingCost = shippingCost;
    }

    public void addItem(Item item){
        this.arr.add(item);
    }

    public void calculateTotal(){
        for(int i=0; i<this.arr.size(); ++i){
            totalCost += (this.arr.get(i).getCost() * this.arr.get(i).getQuantity());
        }
//        totalCost += totalCost * 0.1;
        if(totalCost < 10){
            totalCost += this.shippingCost;
        }
    }

    public String getTotal(){
        return "$" + this.totalCost;
    }

    public Invoice shipOrder(String name, String streetAddrss, String city, String state, int zip){
        Invoice invoice = new Invoice(name, streetAddrss, city, state, zip, this.arr, this.totalCost, this.shippingCost);
        return invoice;
    }

    public ArrayList<Item> getItems(){
        return this.arr;
    }
}
