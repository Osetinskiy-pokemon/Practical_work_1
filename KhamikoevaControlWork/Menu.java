package KhamikoevaControlWork;
import java.util.*;
public class Menu {
    private ArrayList<DishAndDrink> menu = new ArrayList<>(); //наше меню
    private ArrayList<DishAndDrink> stopList = new ArrayList<>(); //наш стоплист
    public Menu() {
        System.out.println("Создание меню прошло успешно.");
    }

    public ArrayList<DishAndDrink> getMenuArray() { return menu; } //наше меню
    public ArrayList<DishAndDrink> getStopListArray() { return stopList; } //наш стоплист

    public void addInMenu(DishAndDrink dish) { //добавление блюда/напитка в меню
        menu.add(dish);
    }

    public void deleteFromMenu(DishAndDrink dishAndDrink) { //удаление из меню
        int c = 0;
        for (int i=0; i<menu.size(); i++){
            if (dishAndDrink.getName() == menu.get(i).getName()){
                menu.remove(i);
                c = 1;
            }
        }
        if (c == 1){
            System.out.println("Удалено из меню.");
        }else if (c == 0) {
            System.out.println("Не удалено из меню, поскольку не найдено.");
        }
    }
    public ArrayList<DishAndDrink> addInStopList(DishAndDrink dish){ //добавление в стоплист
        stopList.add(dish);
        return stopList;
    }

    public void deleteFromStopList(DishAndDrink dishAndDrink) { //удаление из стоплиста
        for (int i=0; i<stopList.size(); i++){
            if (dishAndDrink.getName() == stopList.get(i).getName()){
                stopList.remove(i);
                System.out.println("Удалено из стоплиста");
            } else{
                System.out.println("Не найдено в стоплисте.");
            }
        }
    }

    public void getMenu() {
        System.out.println("Наше меню:");
        for (int i=0; i<menu.size(); i++){
            System.out.println("\n");
            if (menu.get(i).getTypeDishOrDrink() == 1){
                System.out.println("Блюдо " + "'" + menu.get(i).getName() + "'");
                System.out.println("Характеристики:");
                System.out.println("Состав:" + menu.get(i).getStructure());
                System.out.println("Единица измерения: " + menu.get(i).getUnit());
                System.out.println("Количество в единице измерения: " + menu.get(i).getPortion());
                System.out.println("Цена: " + menu.get(i).getPrice() + " рублей");
            }else {
                System.out.println("Напиток " + "'" + menu.get(i).getName() + "'");
                System.out.println("Характеристики:");
                System.out.println("Состав:" + menu.get(i).getStructure());
                System.out.println("Единица измерения: " + menu.get(i).getUnit());
                System.out.println("Количество в единице измерения: " + menu.get(i).getPortion());
                System.out.println("Цена: " + menu.get(i).getPrice() + " рублей");
            }
        }
    }
    public void getStopList() {
        if (stopList.size() == 0) {
            System.out.println("На данный момент стоплист пуст.");
        } else {
            System.out.println("Сегодня в стоплисте:");
            for (int i = 0; i < stopList.size(); i++) {
                System.out.println(stopList.get(i).getName() + ": " + stopList.get(i).getPrice() + " рублей"); //красивый вывод стоплиста делаем
            }
        }
    }
}
