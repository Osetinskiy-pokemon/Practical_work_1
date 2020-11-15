package RecursionTask4;
//4) Реализуйте бинарное дерево поиска

public class Main {
    public static void main(String[] args) {
        Functions func = new Functions();
        func.insert(func.root, 12);
        func.insert(func.root, 44);
        func.insert(func.root, 2);
        func.insert(func.root, 1);
        func.insert(func.root, 6);
        func.insert(func.root, 17);
        func.insert(func.root, 22);
        func.printInOrder(func.root);
        System.out.println("");
        func.printPostOrder(func.root);
        System.out.println("");
        func.printPreOrder(func.root);
        System.out.println("");
        System.out.println(func.search(func.root, 24) ? "Значение найдено" : "Значение не найдено");
        System.out.println(func.search(func.root, 17) ? "Значение найдено" : "Значение не найдено");
    }
}