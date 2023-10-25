public class Person extends Animal{
    private String  firstName;
    private String lastName;
    private int phoneNum;
    private static int count = 0;

    public Person(){
        this.firstName = " ";
        this.lastName = " ";
        this.age = 0;
        this.phoneNum = 0;
        count++;

    }

    public Person(String firstName, String lastName){
        this.firstName = firstName;
        this.lastName = lastName;
        this.age = 0;
        this.phoneNum = 0;
        count++;
    }

    public Person(String firstName, String lastName, byte age, int phoneNum){
        this.firstName = firstName;
        this.lastName = lastName;
        this.age = age;
        this.phoneNum = phoneNum;
        count++;
    }

    public String speak(){
        if(this.firstName.equals(" ")){
            return ("I don't have a name.");
        }else if(this.age == 0){
            return ("My name is " + firstName + " " + lastName);
        }else{
            return ("My name is " + firstName + " " + lastName + " and I am " + age + " years old.");
        }
    }

    public String toString(){
        if(this.firstName.equals(" ")){
            return("N/A");
        }else if(this.phoneNum == 0){
            return(this.firstName + " " + this.lastName);
        }
        return(firstName + " " + lastName + " " + this.phoneNum);
    }

    public static int getPersonCount(){
        return count;
    }
    }
