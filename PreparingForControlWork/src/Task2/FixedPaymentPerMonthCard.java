package Task2;
import java.util.Scanner;
public class FixedPaymentPerMonthCard {

    private String type;
    private int fee;
    private int numberOfMonths;

    public void setType(String str) {
        if (str.toLowerCase().equals("школьный")) {
            this.type = "школьный";
        } else if (str.toLowerCase().equals("студенческий")) {
            this.type = "студенческий";
        } else if (str.toLowerCase().equals("социальный")) {
            this.type = "социальный";
        }
    }

    public String getType() {
        return this.type;
    }

    public void setFee() {
        if (this.type == "школьный") {
            this.fee = 199;
        } else if (this.type == "студенческий") {
            this.fee = 405;
        } else if (this.type == "социальный") {
            this.fee = 299;
        }
    }

    public FixedPaymentPerMonthCard(String str) {
        if (str.toLowerCase().equals("социальный")) {
            this.type = "социальный";
            this.fee = 299;
        } else if (str.toLowerCase().equals("школьный")) {
            this.type = "школьный";
            this.fee = 199;
        } else if (str.toLowerCase().equals("студенческий")) {
            this.type = "студенческий";
            this.fee = 405;
        }
    }

    public FixedPaymentPerMonthCard() {
        this.type = "взрослый";
        this.fee = 599;
    }

    public int getFee() {
        return this.fee;
    }

    public int PayForCard(int money) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Введите количество месяцев : ");
        int n = scanner.nextInt();
        int totalCost = (n * this.fee);
        System.out.printf("Тип Вышей карты:  %s  \n Оплата за %d месяцев = %d \n", this.type, n, totalCost);

        if (totalCost <= money) {
            System.out.println("Операция выполнена.");
            this.numberOfMonths = n;
            return (money - totalCost);
        } else {
            System.out.println("На вашем счете недостаточно средств.");
            return money;
        }
    }

    public int getMonth() {
        return this.numberOfMonths;
    }

    public boolean checkMonth() {
        return (this.getMonth() > 0);
    }
}


