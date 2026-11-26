package ru.qa.study.module2;

public class OrderSummary {
    public static void main(String[] args) {
        String name = "Mechanical Keyboard";
        int count = 3;
        double price = 4999.50;
        int discount = 15;
        char currency = '$';
        boolean isPaid = true;
        String promoCode = null;
        final int MAX_ITEMS = 10;

        double totalBuy = count * price;
        double discountGoods = ((totalBuy/100) * discount);
        double totalPrice = totalBuy - discountGoods;


        System.out.println("Приобретен товар: " + name + " В количестве: " + count + " шт. (максимум в заказе: " + MAX_ITEMS + " шт.)");
        System.out.println("Цена одного товара: " + price + " Общая цена без скидки: " + totalBuy + " " + currency);
        System.out.println("Цена составила: "+ totalPrice + " " + currency + " Скидка составила: " + discountGoods + " " + currency);
        System.out.println("Промокод: " + promoCode + ". Процент скидки: " + discount);
        System.out.println("Оплата прошла: " + isPaid);
    }
}
