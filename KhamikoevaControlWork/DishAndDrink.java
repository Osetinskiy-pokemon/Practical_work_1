package KhamikoevaControlWork;

public class DishAndDrink {
    private String name; //название блюда/напитка
    private String structure; //состав блюда/напитка
    private String unit; //единица измерения
    private String portion; //количество в единице измерения
    private Integer price; //цена блюда/напитка
    private Integer typeDishOrDrink; //нужно для того, чтобы понять, бар это или кухня (блюдо - 1, напиток - 2)

    //сеттеры-геттеры пошли-поехали
    public void setName(String name) { this.name = name;} //для того , чтобы класть значение элемента в параметр
    public String getName() { return name; } //для того, чтобы доставать значение элемента из параметра

    public void setStructure(String structure) { this.structure = structure; }
    public String getStructure() { return structure; }

    public void setUnit(String unit) { this.unit = unit; }
    public String getUnit() { return unit; }

    public void setPortion(String portion) {this.portion = portion; }
    public String getPortion() { return portion; }

    public void setPrice(Integer price) { this.price = price; }
    public Integer getPrice() { return price; }

    public void setTypeDishOrDrink(Integer typeDishOrDrink) {this.typeDishOrDrink = typeDishOrDrink;}
    public Integer getTypeDishOrDrink() { return typeDishOrDrink;}
}
