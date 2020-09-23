package practical1_task5;

public class Comeback {
    int[] val_arr;
    int[] scope_arr;
    int[] range_arr;
    int sum = 0;

    public Comeback(int[] val, int[] scope) {
        val_arr = val;
        scope_arr = scope;
        range_arr = new int[val_arr.length];

        // Сумма длин всех отрезков
        sum = 0;

        for (int i = 0; i < scope_arr.length; i++)
            sum += scope_arr[i];

        int s = 0;
        for (int i = 0; i < range_arr.length; i++) {
            range_arr[i] = s;
            s += scope_arr[i];
        }
    }


    public int get_numb() {
        int random = (int) (Math.random() * (sum - 1));

        int index = 0;
        for (int i = 0; i < range_arr.length; i++) {
            if (range_arr[i] > random)
                break;
            index = i;
        }

        return val_arr[index];
    }
}
