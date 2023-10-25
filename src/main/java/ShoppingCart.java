import java.util.ArrayList;

public class ShoppingCart {
    private double sum = 0.0;
    private String name;
    private String address;
    private String state;
    private String city;
    private int zipCode;

    private ArrayList<Item> items;
    private double shipCharge;

    public ShoppingCart(double shipCharge){
        this.items = new ArrayList<Item>();
        this.shipCharge = shipCharge;
    }


    public void addItem(Item item){
        items.add(item);
    }

    public void calculateTotal(){
        for(Item item : items) {
            sum += ((double) item.getQuantity() * item.getPrice());
        }
    }
    public void addShipping(){
        sum += shipCharge;
    }
    public double getTotal(){
        return sum;
    }

    public Invoice shipOrder(String name, String address, String city, String state, int zipCode){
        return(new Invoice(name, address, city, state, zipCode));

    }



}
