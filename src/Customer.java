import java.util.ArrayList;

abstract class Customer {
    // this abs classes are special they r just like interfaces but have own features
    // for example you can create whole meethod for them and big difference is : you can give them data and even abs method for them

    String name;
    
    ArrayList<String> paymentHistory = new ArrayList<>();

    public Customer(String name)
    {
        this.name = name;

    }
    public abstract void displayCustomerInfo();
    
}
