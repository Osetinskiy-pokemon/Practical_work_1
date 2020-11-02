package Task2;
public class OneTimePaymentCard {
    private final int priceOfRide = 36;

    private int numberOfRides = 0;
    private int balance = 0;

    public OneTimePaymentCard(int rides){
        this.numberOfRides = rides;
    }

    public OneTimePaymentCard(int rides, int balance){
        this.numberOfRides = rides;
        this.balance = balance;
    }

    public void addRide(int n){
        this.numberOfRides += n;
    }

    public int addMoney(int money) throws Exception {
        if (money < 0){
            throw new Exception("Операция проведена неверно.");
        } else {
            this.balance += money;
            int nums = (money / priceOfRide);
            this.addRide(nums);
            return (money - (priceOfRide*nums));
        }
    }

    public int getBalance(){
        return this.balance;
    }

    public void minusRide(){
        this.numberOfRides = this.numberOfRides - 1;
    }

    public int getNumberOfRides(){
        return this.numberOfRides;
    }
}
