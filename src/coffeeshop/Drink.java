package coffeeshop;

import java.util.Scanner;

public class Drink {
    String drinkName;
    int price;

    public Drink(){

    }
    public Drink(String drinkName, int price) {
        this.drinkName = drinkName;
        this.price = price;
    }
    public int chooseDrink(Drink[] drinks) {
        int sum = 0;
        while (true) {
            Scanner sc = new Scanner(System.in);
            System.out.print("메뉴 입력 : ");
            String inputDrink = sc.nextLine();
            if (inputDrink.equals("exit")) {
                break;
            }
            for(int i = 0; i < drinks.length; i++) {
                if(inputDrink.equals(drinks[i].drinkName)){
                    System.out.print("수량 입력 : ");
                    int inputQuantity = sc.nextInt();
                    sum += drinks[i].price * inputQuantity;
                }
            }
        }
        return sum;
    }
    public static void seeManu(Drink[] drinks) {
        for (Drink drink : drinks) {
            System.out.println("Drink : " +  drink.drinkName + ", price : " + drink.price);
        }
    }
}