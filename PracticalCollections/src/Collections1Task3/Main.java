package Collections1Task3;
import java.util.*;
/*
Реализовать частотный словарь слов русского языка (на вход принимается текст любой
размерности)

public class Main {
    public static void main(String[] strings){
        buildDict("Добрый вечер. Сейчас на часах три часа ночи. Я хочу спать. Доброго вечера.");
    }
    public static void buildDict(String text){
        text = text.toLowerCase(); //сделаем строчными, чтобы можно было сравнить с ними

        int[] res = new int['я' - 'а' + 1];
        for(int i = 0; i < text.length(); i++){
            char ch = text.charAt(i);
            if(ch >= 'а' && ch <= 'я'){
                res[ch - 'а']++;
            }
        }
        System.out.println("Всего символов:" + text.length());
        System.out.println("Из них букв:");
        for(int i = 0; i < res.length; i++){
            System.out.println((char) (i + 'а') + " = " + res[i]);
        }
    }
}
 */
public class Main {
    public static void main(String[] strings) {
        String[] words;
        String text = "asd sfd asd rdgdf hhhd";
        words = text.split(" ");
        HashMap<String, Integer> result = new HashMap<>();
        for (int i = 0; i < words.length; i++){
            result.put(words[i], (result.get(words[i]) == null) ? 1 : result.get(words[i]) + 1);
        }
        Set<String> keys = result.keySet();
        System.out.println(result);
    }
}

