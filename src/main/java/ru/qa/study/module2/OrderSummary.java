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
        double discountGoods = ((price/100) * discount);
        //System.out.println(discountGoods);
        double totalPrice = totalBuy - 3*discountGoods;
        //System.out.println(totalPrice);

        double discount2 = (discount/100);
        System.out.println(discount2);

        System.out.println("Приобретен товар: " + name + " В колличестве: " + count + " шт.");
        System.out.println("Цена составила: "+ totalPrice + " " + valuta + " " + "Скидка составила: " + discountGoods + " " + valuta);
        System.out.println("Цена одного товара: " + price);
        System.out.println("Промокод: " + promoCode + ". Процент скидки: " + discount);
    }
}
