package Task1;
import java.util.*;
//у меня тут одновременно двое не сидят, чисто сел-встал, надо доработать со временем обеда

//есть несколько философов, допустим, пять,
// но одновременно за столом могут сидеть не более двух.
// И надо, чтобы все философы пообедали,
// но при этом не возникло взаимоблокировки философами друг друга в борьбе за тарелку и вилку:
public class Main {
    public static void main(String[] args) {
        int count = 0;
        Human h1 = new Human();
        h1.setLunch(false);
        Human h2 = new Human();
        h2.setLunch(false);
        Human h3 = new Human();
        h3.setLunch(false);
        Human h4 = new Human();
        h4.setLunch(false);
        Human h5 = new Human();
        h5.setLunch(false);
        Table table = new Table();
        table.setPlace(2);
        List<Human> humans = new ArrayList<>();
        humans.add(h1);
        humans.add(h2);
        humans.add(h3);
        humans.add(h4);
        humans.add(h5);
        while (true){
            for (int i = 0; i < humans.size(); i++){
                if(table.getPlace() > 0){
                    if(humans.get(i).getLunch() == false){
                        humans.get(i).setLunch(true);
                        count++;
                    }
                }
            }
            if(table.lunched(count) > 4){
                break;
            }
        }
    }
}
