package Million;

import java.util.ArrayList;
import java.util.LinkedList;
import java.util.List;

public class ListMethods {
//        * Напишите метод, который добавляет 1 млн элементов
//        в ArrayList и LinkedList.

    //Метод с заполнением ArrayList - count раз
    public static List<Object> fillList(ArrayList<Object> list, Integer count) {
        List<Object> result = new ArrayList<>();
        //Заполняем Object'ами - count раз

        for (int i = 0; i < count; i++) {
            result.add(new Object());
        }
        return result;
    }

    //Метод с заполнением LinkedList - count раз
    public static List<Object> fillList(LinkedList<Object> list, Integer count) {
        List<Object> result = new LinkedList<>();
        //Заполняем Object'ами - count раз
        for (int i = 0; i < count; i++) {
            result.add(new Object());
        }
        return result;
    }

    //Выбираем count-раз случайные элементы ArrayList
    public static void getRandom(ArrayList<Object> list, Integer count) {
        for (int i = 0; i < count; i++) {
            int pos = (int) (Math.random() * list.size());
            list.get(pos);
        }

    }

    //Выбираем count-раз случайные элементы LinkedList
    public static void getRandom(LinkedList<Object> list, Integer count) {
        for (int i = 0; i < count; i++) {
            int pos = (int) (Math.random() * list.size());
            list.get(pos);
        }
    }


}
