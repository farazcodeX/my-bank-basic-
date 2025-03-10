public class PremiumCustomer extends Customer {

    public PremiumCustomer(String name) {

            super(name);
            
            
        }
    
        @Override
    public void displayCustomerInfo() {
        // this method basicly prints customer info
        System.out.println("---------------------------------");
        System.out.println("Premium Customer : " + name);
        for(int i = 0; i < paymentHistory.size(); ++i)
        {
            System.out.println(paymentHistory.get(i));
        }
        System.out.println("--------------------------------");
    }
   
}
