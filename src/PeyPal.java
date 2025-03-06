import java.net.Socket;

public class PeyPal implements PeymantSterategy {
    // when a class implements an interface u must override thy methods first

    String ownerEmail;

    // dependency injection trough contructor
    public PeyPal(String email)
    {
        this.ownerEmail = email;
    }

    @Override
    public void pay(double amount) {
        System.out.println("--------------------------------------");
        System.out.println("PayPal ");
        System.out.println();
        System.out.println("Paymant : Currency : USD : from email :   " + ownerEmail);
        System.out.println("Amount : " + amount + "4");
        System.out.println("Checking PayPal balance");
        System.out.println("-------------------------------------");
    }

    @Override
    public String getPaymentDetale() {

        String payInfo = "Payment successfully . from email" + ownerEmail + "PayPal.TM ";

        return payInfo;
       
    }
    
}
