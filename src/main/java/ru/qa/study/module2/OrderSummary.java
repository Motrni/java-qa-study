package ru.qa.study.module2;

public class OrderSummary {
    public static void main(String[] args) {
        String name = "Mechanical Keyboard";
        int count = 3;
        double price = 4999.50;
        int discount = 15;
        char valuta = '$';
        boolean isPaid = true;
        String promoCode = null;
        final int MAX_ITEMS = 10;

        double totalBuy = count * price;
        //System.out.println(totalBuy);
        double discountGoods = Math.round((price/100) * discount);
        //System.out.println(discountGoods);
        double totalPrice = totalBuy - discountGoods;
        //System.out.println(totalPrice);

        System.out.println("Приобретен товар: " + name + " В колличестве: " + count + "шт.");
        System.out.println("Цена составила: "+ totalPrice + " " + valuta + " " + "Сидка составила: " + discountGoods + " " + valuta);
        System.out.println("Промокод: " + promoCode + ". Процент скидки: " + discount);
    }
}
