public class CreditCardPay implements PeymantSterategy{

   public String cardNumber;
    public String ownerName;
    
    // constructor
    public CreditCardPay(String cardNum, String owner)
    {
        this.cardNumber = cardNum;
        this.ownerName = owner;
    }

    @Override
    public void pay(double amount) {
        System.out.println("--------------------------------------");
        System.out.println("shaba (electronic creditcard payment)");
        System.out.println("Paymant : Currency : USD : from" + cardNumber + "in the Name : " + ownerName);
        System.out.println("Amount : " + amount);
        System.out.println("Checking creditcard balance");
        System.out.println("-------------------------------------");
    }

    @Override
    public String getPaymentDetale() {

        String payInfo = "Payment successfully . from number" + cardNumber+ "in the name " + ownerName + "ETC credit card payment.TM ";

        return payInfo;
    }
    
}
