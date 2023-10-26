public class Item {
    private double price;
    private int quantity;
    private String itemName;

    public Item(){
        this.price = 0.0;
        this.quantity = 0;
        this.itemName = " ";
    }

    public Item(double price, int quantity, String itemName){
        this.price = price;
        this.quantity = quantity;
        this.itemName = itemName;
    }

    public double getPrice(){
        return this.price;
    }

    public int getQuantity(){
        return this.quantity;
    }

    public String getItemName(){
        return this.itemName;
    }
}
