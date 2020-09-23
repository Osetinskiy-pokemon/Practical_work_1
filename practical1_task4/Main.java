package practical1_task4;

public class Main {

    public static void main(String[] args) {
        // Коробка
        Box box = new Box();
        //Максимальный объём коробки
        box.set_vol(100.5);

        //Шар с объёмом 33.5
        Ball ball1 = new Ball();
        ball1.set_vol(33.5);


        //Кидаем шарик в коробку
        System.out.println("\nТекущий объём контейнера: " + box.get_vol());
        boolean res = box.add(ball1);
        System.out.println("Флаг добавления фигуры: " + res);
        System.out.println("Текущий объём контейнера: " + box.get_vol());

        //Добавляем слишком объёмный объект в коробку
        SolidOfRevolution obj = new SolidOfRevolution();
        obj.set_vol(435);
        System.out.println("\nТекущий объём контейнера: " + box.get_vol());
        res = box.add(obj);
        System.out.println("Флаг добавления фигуры: " + res);
        System.out.println("Текущий объём контейнера: " + box.get_vol());


    }
}
