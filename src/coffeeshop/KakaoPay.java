package coffeeshop;

public class KakaoPay implements Pay {
    @Override
    public void pay(int sum) {
        System.out.println("KakaoPay 결제 진행");
        System.out.println("KakaoPay " + sum + "원 결제 완료 !");
    }
}
