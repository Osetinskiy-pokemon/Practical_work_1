package practical1_task1;

public class Main{
    public static void main(String[] args) {
        int[][] m_1 = {{1, 2, 3}, {4, 5, 6}, {7, 8, 9}};
        int[][] m_2 = {{10, 11, 12}, {13, 14, 15}, {3, 2, 8}};
        int number = 3;
        Matrix matrix = new Matrix(m_1, m_2, number);
        System.out.println("\nСложение матриц: ");
        matrix.addition();
        System.out.println("\nВычитание матриц: ");
        matrix.subtraction();
        System.out.println("\nПроизведение матриц:");
        matrix.multiplication();
        System.out.println("\nУмножение матрицы на число: ");
        matrix.multiplication_by_a_number();
        System.out.println("\nТранспонирование матрицы: ");
        matrix.transposition();
        System.out.println("\nВозведение матрицы в степень: ");
        matrix.exponentiation();


    }

}