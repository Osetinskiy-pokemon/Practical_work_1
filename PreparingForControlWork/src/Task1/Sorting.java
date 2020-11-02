package Task1;
import java.util.Comparator;
public class Sorting implements Comparator<Employee>{
    public int compare (Employee a, Employee b) {
        if (a.calculationSalary() == b.calculationSalary()) {
            return a.getName().compareTo(b.getName());
        } else {
        //    return (int) (a.calculationSalary() - b.calculationSalary());
            return (int) (b.calculationSalary() - a.calculationSalary());
        }
    }
}
