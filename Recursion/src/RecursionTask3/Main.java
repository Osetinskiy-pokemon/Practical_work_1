package RecursionTask3;
//Найдите корень уравнения на отрезке [0;10] с точностью по x не хуже 0.001. Известно, что
//на этом промежутке корень единственный. Используйте для этого метод деления отрезка
//пополам (и рекурсию).
//уравнение: cos(x)^3+x^2-243.8*x-11=0
public class Main {
    public static double f(double x){
        return Math.cos(Math.pow(x, 3)) + Math.pow(x, 2) - 243.8 * x - 11;
    }

    public static double solve(double y1, double y2){ //края наши
        if(y2 - y1 <= 0.001){
            return y1;
        }

        double x = y1 + (y2 - y1) / 2;

        if(f(y1) * f(x) > 0){
            return solve(x, y2);
        } else {
            return solve(y1, x);
        }
    }

    public static void main(String[] args) {
        System.out.println(solve(0, 10));
    }
}
