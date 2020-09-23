package practical1_task3;

class Shape {
    private double vol;

    //Получаем объём
    public double get_vol() {
        return this.vol;
    }

    //Устанаавливаем объём
    public void set_vol(double vol) {
        this.vol = vol;
    }
}

class Pyramid extends Shape {
    private double h;
    private double s;

}


class Box extends Shape {


    //Добавляем фигуру в "коробку"
    public boolean add(Shape shape) {
        if (this.get_vol() < shape.get_vol()) { //если добавляемый объем превышает текущий в коробке
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

class Cylinder extends SolidOfRevolution {
    private double height;


}

class Ball extends SolidOfRevolution {

}
