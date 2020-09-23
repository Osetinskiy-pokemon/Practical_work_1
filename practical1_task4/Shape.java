package practical1_task4;

abstract class Shape {
    private double vol;

    //Получаем объем
    public double get_vol() {
        return this.vol;
    }

    //Устанавливаем объем
    public void set_vol(double vol) {
        this.vol = vol;
    }
}

abstract class Pyramid extends Shape {
    private double h;
    private double s;

}


class Box extends Shape {


    //Добавляем фигуру в "коробку"
    public boolean add(Shape shape) {
        if (this.get_vol() < shape.get_vol()) {
            return false;
        } else {
            //Ищем свободное место
            double free_vol = this.get_vol() - shape.get_vol();
            this.set_vol(free_vol);
            return true;
        }
    }
}

class SolidOfRevolution extends Shape {
    private double radius;

    public double get_radius() {
        return radius;
    }

}

abstract class Cylinder extends SolidOfRevolution {
    private double height;


}

class Ball extends SolidOfRevolution {

}
