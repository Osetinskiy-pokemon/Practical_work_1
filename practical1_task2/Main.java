package practical1_task2;

public class Main {
    public static void main(String[] args) {
        Vector vector = new Vector(1, 2, 3);
        Vector vector_2 = new Vector(4, 5, 6);
        System.out.println("Длина вектора: ");
        System.out.println(vector.length_v());
        System.out.println("Скалярное произведение: ");
        System.out.println(vector.scalar(vector_2));
        System.out.println("Векторное произведение с другим вектором: ");
        vector.mult(vector_2).value();
        System.out.println("Угол между векторами: ");
        System.out.println(vector.cosin(vector_2));
        System.out.println("Сумма: ");
        vector.summa(vector_2).value();
        System.out.println("Разность: ");
        vector.difference(vector_2).value();
        Vector[] vectors = Vector.generator(10);
        }
    }

