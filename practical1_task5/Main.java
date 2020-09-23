package practical1_task5;

public class Main {
    public static void main(String[] args) {

        int[] val = {1, 2, 3};
        int[] scope = {1, 2, 10};

        Comeback comeback = new Comeback(val, scope);
        int back_val = comeback.get_numb();
        System.out.println("Возвращаемое значение: "+back_val);
    }

}
