package practical1_task2;
import java.util.Random;
import java.awt.*;
import java.util.ArrayList;

public class Vector {

    private int x, y, z;
    public Vector(int x, int y, int z) {
        this.x = x;
        this.y = y;
        this.z = z;

    }

    public double length_v() {
        double res_1;
        res_1 = Math.sqrt(x*x+y*y+z*z);
        return res_1;
    }


    public double scalar(Vector v) {
        double res_3;
        res_3 = x*v.x + y*v.y + z*v.z;
        return res_3;
    }

    public Vector mult(Vector v) {
        int x = y*v.z-z*v.y;
        int y = z*v.x-x*v.z;
        int z = x*v.y-y*v.x;
        return new Vector(x, y, z);
    }

    public double cosin(Vector v){
        double sc = scalar(v);
        double l_1 = length_v();
        double l_2 = v.length_v();
        double res_5;
        res_5 = sc/(l_1*l_2);
        return res_5;

    }
    public Vector summa(Vector v){
        int x = this.x+v.x;
        int y = this.y+v.y;
        int z = this.z+v.z;
        return new Vector(x, y, z);

    }

    public Vector difference(Vector v){
        int x = this.x-v.x;
        int y = this.y-v.y;
        int z = this.z-v.z;
        return new Vector(x, y, z);
    }

    public static Vector[] generator(int N) {
        Vector vectorsArr[];
        vectorsArr = new Vector[N];
        for (int i = 0; i < N; i++) {
            Random rand = new Random();
            // Generate random integers in range 0 to 999
            int randx = rand.nextInt(100);
            int randy = rand.nextInt(100);
            int randz = rand.nextInt(100);
            vectorsArr[i] = new Vector(randx, randy, randz);
        }

        return vectorsArr;
    }
    public void value(){
        System.out.println(this.x+ " " + this.y + " " + this.z);
    }


}
