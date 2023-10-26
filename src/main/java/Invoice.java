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
        return("Ship to: \n\t" + this.name + "\n\t" + this.address + "\n\t" + this.city + ", " + this.state + " " + this.zipCode + "\n\nItems\n-----");

    }


}
