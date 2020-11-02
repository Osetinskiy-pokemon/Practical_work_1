package Task2;
public class Terminal {
    static void check(FixedPaymentPerMonthCard card){
        if (card.checkMonth()){
            System.out.println("*ЗЕЛЕНЫЙ*");
            System.out.printf("Карта действительна еще на %d месяцев.", card.getMonth());
        } else {
            System.out.println("*КРАСНЫЙ*");
            System.out.println("Карта не активна.");
        }
    }

    static void check(OneTimePaymentCard card){
        if (card.getNumberOfRides() > 0){
            System.out.println("*ЗЕЛЕНЫЙ*");
            card.minusRide();
        } else {
            System.out.println("*КРАСНЫЙ*");
            System.out.println("Поездки закончились.");
        }
        System.out.printf("Осталось %d поездок | Ваш баланс = %d", card.getNumberOfRides(), card.getBalance());
    }
}
