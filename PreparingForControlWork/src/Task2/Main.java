package Task2;
public class Main {
    public static void main(String[] args){
        FixedPaymentPerMonthCard card = new FixedPaymentPerMonthCard("школьный");
        System.out.println(card.getType());
        System.out.println(card.getFee());
        ATM.start(card, 1000);
    }
}
