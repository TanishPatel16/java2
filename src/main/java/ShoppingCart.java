import java.util.*;
public class ShoppingCart {
    private ArrayList<Item> arr;
    private float totalCost;
    public ShoppingCart(){
        this.arr = new ArrayList<Item>();
        this.totalCost = 0;
    }

    public void addItem(Item item){
        this.arr.add(item);
    }

    public void calculateTotal(){
        for(int i=0; i<this.arr.size(); ++i){
            totalCost += (this.arr.get(i).getCost() * this.arr.get(i).getQuantity());
        }
    }

    public String getTotal(){
        return "$" + this.totalCost;
    }
}
