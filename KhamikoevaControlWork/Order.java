package KhamikoevaControlWork;

import java.util.ArrayList;

public class Order {
    private Integer tableNumber;
    private ArrayList<DishAndDrink> orders = new ArrayList<>(); //наши заказы
    private Integer price = 0; //стоимость
    private ArrayList<DishAndDrink> serve = new ArrayList<>(); //обслуживание - для того, чтобы фиксировать, что блюдо подано
    private Menu menu; //меню, конечно же
    private Menu stopList;
    boolean flag;

    public Order(Integer tableNumber, Menu menu){ //непосредственно заказ
        this.tableNumber = tableNumber;
        this.menu = menu;
        this.stopList = stopList;
        this.flag = false;
    }
    public void getMenu() {
        flag = false;
        for (int i=0; i<menu.getMenuArray().size(); i++){
            for (int j = 0; j < stopList.getStopListArray().size(); j++){
                if (stopList.getStopListArray().get(j).getName() == menu.getMenuArray().get(i).getName()){
                    flag = true;
                }
            }
            if (flag == false) {
                System.out.println("Доступно для заказа: " + menu.getMenuArray().get(i));
            } else if (flag == true){
                System.out.println("Недоступно для заказа: " + menu.getMenuArray().get(i));
            }
        }
    }
    public void addDish(DishAndDrink dish){
        if (menu.getMenuArray().indexOf(dish) == -1) {
            System.out.println("'" + dish.getName() + "'" + " нет в меню");
            return;
        }
        if(menu.getMenuArray().indexOf(dish) != -1 && menu.getStopListArray().indexOf(dish) == -1 ){
            orders.add(dish);
            price += dish.getPrice();
            System.out.println("'" + dish.getName() + "'" +" добавлено в заказ.");
        } else {
            if (dish.getTypeDishOrDrink() == 1){
                System.out.println("Сегодня блюдо " + "'" + dish.getName() + "'" +" отсутствует, поскольку находится в стоплисте");
            }else {
                System.out.println("Сегодня напиток " + "'" + dish.getName() + "'" + " отсутствует, поскольку находится в стоплисте");
            }
        }
    }
    public void getOrder() { //отображение информации о заказе по столику
        System.out.println("Заказ столика номер: " + tableNumber);
        for (int i=0; i<orders.size(); i++){
            if (orders.get(i).getTypeDishOrDrink() == 1){
                System.out.println("Блюдо: " + orders.get(i).getName() + " - " + orders.get(i).getPrice() + " рублей");
            }else {
                System.out.println("Напиток: " + orders.get(i).getName() + " - " + orders.get(i).getPrice() + " рублей");
            }
        }
        System.out.println("Итоговая стоимость: " + price + " рублей");
    }
    public void serveDish(DishAndDrink dish){
        if(orders.indexOf(dish) != -1 && serve.indexOf(dish) == -1 && menu.getMenuArray().indexOf(dish) != -1 && menu.getStopListArray().indexOf(dish) == -1) {
            serve.add(dish);
            System.out.println("Блюдо/напиток подано");
        }
        else {
            if (menu.getStopListArray().indexOf(dish) != -1) {
                System.out.println("Ошибка, блюдо/напиток отсутсвует");
                return;
            }
            if (menu.getMenuArray().indexOf(dish) == -1) {
                System.out.println("Ошибка, блюдо/напиток отсутсвует");
                return;
            }
            System.out.println("Блюдо/напиток уже было подано");
        }
    }

    public void getServe() {
        for (int i=0; i<serve.size(); i++){
            System.out.println("Подано: " + serve.get(i));
        }
    }

    public void closeOrder() {
        getOrder();
        System.out.println("Заказ закрыт.");
        orders = new ArrayList<>();
        price = 0;
    }
}
