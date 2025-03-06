public class Main {
    public static void main(String[] args) {

        RegularCustomer customer1 = new RegularCustomer("ALi");
        PremiumCustomer customer2 = new PremiumCustomer("FARAZ");
        RegularCustomer customer3 = new RegularCustomer("Mobin");

        // do payment
        BitCoinPay bitpay1 = new BitCoinPay("farazTrader21");
        bitpay1.pay(0.00002);
        customer2.paymentHistory.add(bitpay1.getPaymentDetale());

        PeyPal peyPal1 = new PeyPal("farazn8364@gamil.com");
        peyPal1.pay(300);
        customer2.paymentHistory.add(peyPal1.getPaymentDetale());

        customer2.displayCustomerInfo();

        CreditCardPay creditPay2 = new CreditCardPay("1269", "ALi");
        PeyPal peyPal2 = new PeyPal("alizTR1258@gmail.com");
        creditPay2.pay(200);
        peyPal2.pay(100);

        customer1.paymentHistory.add(creditPay2.getPaymentDetale());
        customer1.paymentHistory.add(peyPal2.getPaymentDetale());
        customer1.displayCustomerInfo();

        BitCoinPay bitCoinPay3 = new BitCoinPay("mbnDDGR096");
        bitCoinPay3.pay(0.7);
        customer3.paymentHistory.add(bitCoinPay3.getPaymentDetale());

        CreditCardPay creditCardPay3 = new CreditCardPay("98876", "Mobin");
        creditCardPay3.pay(700000);
        customer3.paymentHistory.add(creditCardPay3.getPaymentDetale());

        customer3.displayCustomerInfo();


        
    }
}
