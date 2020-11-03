package KhamikoevaControlWork;

public class Main {
    public static void main(String[] args) {
        System.out.println("Добро пожаловать в наше кафе 'Мне завтра ко второй'!");
        DishAndDrink roast = new DishAndDrink();
        roast.setTypeDishOrDrink(1);
        roast.setName("Жаркое");
        roast.setStructure("курица, картошка, чеснок, специи");
        roast.setUnit("grams");
        roast.setPortion("500g");
        roast.setPrice(700);

        DishAndDrink pancakes = new DishAndDrink();
        pancakes.setTypeDishOrDrink(1);
        pancakes.setName("Блинчики");
        pancakes.setStructure("тесто для блинов, соус на выбор");
        pancakes.setUnit("grams");
        pancakes.setPortion("250g");
        pancakes.setPrice(280);

        DishAndDrink greenTea = new DishAndDrink();
        greenTea.setTypeDishOrDrink(2);
        greenTea.setName("Зелёный чай"); // у меня чай в баре, да :) , другой напиток я не смогла придумать
        greenTea.setStructure("мята, душица, чабрец, смородина");
        greenTea.setUnit("milliliters");
        greenTea.setPortion("300ml");
        greenTea.setPrice(400);

        DishAndDrink caesar = new DishAndDrink();
        caesar.setTypeDishOrDrink(1);
        caesar.setName("Цезарь с курицей");
        caesar.setStructure("курица, томат, яйца, сухари, листья салата, оливковое масло, лимонный сок, специи");
        caesar.setUnit("grams");
        caesar.setPortion("400g");
        caesar.setPrice(390);

        DishAndDrink juice = new DishAndDrink();
        juice.setTypeDishOrDrink(2);
        juice.setName("Свежевыжатый сок"); //ему тоже место в баре, ну а какие еще напитки можно вписать
        juice.setStructure("яблоко, ананас, манго, персик");
        juice.setUnit("milliliters");
        juice.setPortion("250ml");
        juice.setPrice(120);

        Menu menu = new Menu(); //создаем наше меню
        menu.addInMenu(roast);
        menu.addInMenu(pancakes);
        menu.addInMenu(greenTea);
        menu.addInMenu(caesar);
        menu.addInMenu(juice);
        menu.getMenu();

        menu.addInStopList(pancakes);
        //menu.deleteFromStopList(pancakes);
        System.out.println("\n");
        menu.deleteFromMenu(juice);
        System.out.println("\n");
        menu.getMenu();
        System.out.println("\n");
        menu.getStopList();

        Order order = new Order(1, menu);
        System.out.println("\n");
        order.addDish(roast);
        order.addDish(pancakes);
        order.addDish(greenTea);
        order.addDish(juice);
        order.addDish(caesar);
        order.serveDish(caesar);
        order.closeOrder();

    }
}
