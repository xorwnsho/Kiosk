package coffeeshop;

import java.util.Scanner;

public class ChoosePayment {

    public static void choosePay(int sum){
        System.out.println("총 금액 : " + sum);
        System.out.println("결제 방법 : creditCard or kakaoPay or applePay or samsungPay");
        while(true) {
            Scanner sc = new Scanner(System.in);
            String inputCard = sc.nextLine();
            Pay pay;
            if(inputCard.equals("kakaoPay")){
                pay= new KakaoPay();
                pay.pay(sum);
                break;
            } else if(inputCard.equals("applePay")){
                pay= new ApplePay();
                pay.pay(sum);
                break;

            } else if(inputCard.equals("samsungPay")){
                pay= new SamsungPay();
                pay.pay(sum);
                break;

            } else if(inputCard.equals("creditCard")){
                pay= new CreditCardPay();
                pay.pay(sum);
                break;
            }
            System.out.println("다시 입력하시오.");
        }
    }
}
