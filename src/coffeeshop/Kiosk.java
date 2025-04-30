package coffeeshop;

public class Kiosk {
    public static void main(String[] args) {
        Drink[] drinks = new Drink[5];
        Drink drink = new Drink();
        ChoosePayment choosePayment = new ChoosePayment();
        drinks[0] = new Drink("Americano", 2000);
        drinks[1] = new Drink("Latte", 2500);
        drinks[2] = new Drink("Chocolate Latte", 3000);
        drinks[3] = new Drink("Green Tea Latte", 3000);
        drinks[4] = new Drink("Ice Tea", 2000);

        drink.seeManu(drinks);
        int sum = drink.chooseDrink(drinks);
        choosePayment.choosePay(sum);
    }
}


