package practical3_task1;
public class Main {
    public static void main(String[] strings) {
        UndoableStringBuilder str = new UndoableStringBuilder();
        str.append(" ");
        str.append("Hello");
        System.out.println("Наша строка:"+str.toString());
        str.undo();
        System.out.println("Наша строка после отмены:"+str.toString());
        str.append("Hello");
        str.append(", ");
        System.out.println("Наша строка:"+str.toString());
        str.append("World!");
        System.out.println("Наша строка:"+str.toString());
        str.delete(1,3);
        System.out.println("Наша строка:"+str.toString());
        str.deleteIndex(6);
        System.out.println("Наша строка:"+str.toString());
        str.replace(1, 3, "222");
        System.out.println("Наша строка:"+str.toString());
        str.reverse();
        System.out.println("Наша строка:"+str.toString());
        str.undo();
        System.out.println("Наша строка после отмены:"+str.toString());
    }
}