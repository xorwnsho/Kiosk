package coffeeshop;

public class SamsungPay implements Pay {
    @Override
    public void pay(int sum) {
        System.out.println("SamsungPay 결제 진행");
        System.out.println("SamsungPay " + sum + "원 결제 완료 !");
    }
}
