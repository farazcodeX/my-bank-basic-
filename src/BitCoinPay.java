public class BitCoinPay implements PeymantSterategy {

    String walletAdress;

    public BitCoinPay(String adress)
    {
        this.walletAdress = adress;
    }

    @Override
    public void pay(double amount) {
       
        System.out.println("--------------------------------------");
        System.out.println("Paymant : Currency : BitCoin : from  : " + walletAdress);
        System.out.println("Amount : " + amount + "BTC");
        System.out.println("Checking wallet balnce ");
        //System.out.println("-------------------------------------");
        
    }

    @Override
    public String getPaymentDetale() {

        String payInfo = "Payment successfully . from adress" + walletAdress + "BTC" + "  with using digital currensy : BitCoin.tm";


        return payInfo; 
        
       
    }
    
}
