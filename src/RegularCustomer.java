public class RegularCustomer extends Customer{

    public RegularCustomer(String name) {


            super(name);
            
        }
    
        @Override
    public void displayCustomerInfo() {

        System.out.println("Regular Customer" + name);
        
        for(int i = 0; i < paymentHistory.size(); ++i)
        {
            System.out.println(paymentHistory.get(i));
        }
        System.out.println("-------------------------");

        
        
    }
    
}
