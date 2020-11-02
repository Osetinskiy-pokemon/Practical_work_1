package Task1;

public class EmployeeWithHourlyPay extends Employee {

    private int ratePerHour;
    private double salary;

    public void setRatePerHour(int ratePerHour){ this.ratePerHour = ratePerHour;}
    public int getRatePerHour(){ return ratePerHour;}

    @Override
    public double calculationSalary() {
        this.salary = 28.8 * 8 * this.ratePerHour;
        return this.salary;
    }
}
