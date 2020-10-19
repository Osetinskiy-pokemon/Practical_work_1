package practical3_task2;
import java.util.Scanner;

public class Main {
    public static void main(String[] strings) {
        OvserverableStringBuilder sss = new OvserverableStringBuilder();
        sss.setChangedOnListener(new OurListener());
        Scanner scaner = new Scanner(System.in);
        boolean flag = true;
        while (flag){
            System.out.println("Введите 1, если хотите продолжить работу с программой, другой ввод будет расцениваться как нежелание:");
            int intInput1 = scaner.nextInt();
            if (intInput1 == 1) {
                System.out.println("Если Вы хотите добавить в строку символы, то введите 1");
                System.out.println("Если Вы хотите заменить подстроку в строке, введите 2");
                System.out.println("Если Вы хотите перевернуть строку, то введите 3");
                System.out.println("Любой другой ввод будет расцениваться как выход из программы");
                int intInput2 = scaner.nextInt();
                if (intInput2 == 1) {
                    System.out.println("Введите строку, которую хотите добавить: ");
                    String strInpyt1 = scaner.next();//scaner.nextLine();
                    sss.append(strInpyt1);
                } else if (intInput2 == 2) {
                    System.out.println("Введите начало, откуда заменять символы:");
                    int startInput = scaner.nextInt();
                    System.out.println("Введите конец, до которого хотите заменить символы: ");
                    int endInput = scaner.nextInt();
                    System.out.println("Введите строку, на которую нужно заменить: ");
                    String replaceInput = scaner.next();//scaner.nextLine();
                    sss.replace(startInput, endInput, replaceInput);
                } else if (intInput2 == 3) {
                    sss.reverce();
                } else {
                    System.out.println("Конец!");
                    flag = false;
                }
            } else {
                System.out.println("Конец!");
                flag = false;
            }
        }
    }
}

