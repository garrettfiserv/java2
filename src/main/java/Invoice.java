public class Invoice {
    private String name;
    private String address;
    private String city;
    private String state;
    private int zipCode;

    public Invoice(String name, String address, String city, String state, int zipCode){
        this.name = name;
        this.address = address;
        this.city = city;
        this.state = state;
        this.zipCode = zipCode;
    }

    public String toString(){
        return("" + this.name + "\n" + this.address + "\n" + this.city + ", " + this.state + " " + this.zipCode);
    }
}
