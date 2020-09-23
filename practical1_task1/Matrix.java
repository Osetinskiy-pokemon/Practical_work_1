package practical1_task1;

public class Matrix{

    private int[][] m_1;
    private int[][] m_2;
    private int number;

    public Matrix(int[][] m_1, int[][] m_2, int number){
        this.m_1 = m_1;
        this.m_2 = m_2;
        this.number = number;
    }

    public int[][] multiplication(){
        int m = this.m_1.length;
        int n = this.m_2[0].length;
        int k = this.m_2.length;
        int res_1[][] = new int[m][n];

        for (int i = 0; i < m; i++) {
            for (int j = 0; j < n; j++) {
                for (int o = 0; o < k; o++) {
                    res_1[i][j] += this.m_1[i][o] * this.m_2[o][j];
                }
            }
        }

        for (int i = 0; i < res_1.length; i++) {
            for (int j = 0; j < res_1[0].length; j++) {
                System.out.format("%6d", res_1[i][j]);
            }
            System.out.println();
        }
        return res_1;
    }

    public int[][] multiplication_by_a_number() {
        int numb = this.number;
        int m = this.m_1.length;
        int n = m_1[0].length;
        int res_2[][] = new int[m][n];

        for (int i = 0; i < m; i++) {
            for (int j = 0; j < n; j++) {
                res_2[i][j] += this.m_1[i][j] * numb;
            }
        }

        for (int i = 0; i < res_2.length; i++) {
            for (int j = 0; j < res_2.length; j++) {
                System.out.format("%6d", res_2[i][j]);
            }
            System.out.println();
        }
        return res_2;

    }

    public int[][] addition() {
        int m = this.m_1.length; //количество строк
        int n = this.m_2[0].length; //количество столбцов
        int res_3[][] = new int[m][n];

        for (int i = 0; i < m; i++) {
            for (int j = 0; j < n; j++) {
                res_3[i][j] += this.m_1[i][j] + this.m_2[i][j];
            }
        }

        for (int i = 0; i < res_3.length; i++) {
            for (int j = 0; j < res_3.length; j++) {
                System.out.format("%6d", res_3[i][j]);
            }
            System.out.println();
        }
        return res_3;

    }

    public int[][] subtraction() {
        int m = this.m_1.length; //количество строк
        int n = this.m_2[0].length; //количество столбцов
        int res_4[][] = new int[m][n];

        for (int i = 0; i < m; i++) {
            for (int j = 0; j < n; j++) {
                res_4[i][j] += this.m_1[i][j] - this.m_2[i][j];
            }
        }

        for (int i = 0; i < res_4.length; i++) {
            for (int j = 0; j < res_4.length; j++) {
                System.out.format("%6d", res_4[i][j]);
            }
            System.out.println();
        }
        return res_4;
    }
    public int[][] transposition() {
        int m = this.m_1.length;
        int n = this.m_2[0].length;
        int res_5[][] = new int[m][n];

        for (int i = 0; i < m; i++) {
            for (int j = 0; j < n; j++) {
                res_5[i][j] = this.m_1[j][i];
            }
        }
        for (int i = 0; i < res_5.length; i++) {
            for (int j = 0; j < res_5.length; j++) {
                System.out.format("%6d", res_5[i][j]);
            }
            System.out.println();
        }
        return res_5;
    }

    public int[][] exponentiation() {
        int m = this.m_1.length;
        int n = this.m_1[0].length;
        int k = this.m_1.length;
        int res_6[][] = new int[m][n];

        for (int i = 0; i < m; i++) {
            for (int j = 0; j < n; j++) {
                for (int o = 0; o < k; o++) {
                    res_6[i][j] += this.m_1[i][o] * this.m_1[o][j];
                }
            }
        }

        for (int i = 0; i < res_6.length; i++) {
            for (int j = 0; j < res_6[0].length; j++) {
                System.out.format("%6d", res_6[i][j]);
            }
            System.out.println();
        }
        return res_6;
    }
}