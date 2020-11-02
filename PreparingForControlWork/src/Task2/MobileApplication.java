package Task2;
public class MobileApplication {
    static void start(FixedPaymentPerMonthCard card, int money){
        int change = card.PayForCard(money);
        System.out.printf("Остаток от операции: %d", change);
    }

    static void start(OneTimePaymentCard card, int money) throws Exception {
        int change = card.addMoney(money);
        System.out.printf("Остаток от операции: %d", change);
    }
}
