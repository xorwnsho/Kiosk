package coffeeshop;

public class ApplePay implements Pay {
    @Override
    public void pay(int sum) {
        System.out.println("ApplePay 결제 진행");
        System.out.println("ApplePay " + sum + "원 결제 완료 !");
    }
}
