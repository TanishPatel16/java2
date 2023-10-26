public class Item {
    private float cost;
    private int quantity;
    private String name;

    public Item(float cost, int quantity, String name){
        this.cost = cost;
        this.quantity = quantity;
        this.name = name;
    }

    public float getCost(){
        return this.cost;
    }

    public int getQuantity(){
        return this.quantity;
    }
}
