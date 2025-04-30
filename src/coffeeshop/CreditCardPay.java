package coffeeshop;

public class CreditCardPay implements Pay {
    @Override
    public void pay(int sum) {
        System.out.println("CreditCard 결제 진행");
        System.out.println("CreditCard " + sum + "원 결제 완료 !");
    }
}
