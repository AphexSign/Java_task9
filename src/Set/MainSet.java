//        * Написать метод, который на входе получает коллекцию
//        объектов, а возвращает коллекцию без дубликатов
//
//----------------------------------------------------------------

package Set;

import java.util.ArrayList;
import java.util.HashSet;
import java.util.List;
import java.util.Set;

public class MainSet {
    public static void main(String[] args) {

        //Создаем коллекцию List
        List<Object> listobj = new ArrayList<>();
        Object object1 = new Object();
        Object object2 = new Object();
        Object object3 = new Object();
        //Создаем дубликат третьего обьекта
        Object object4 = object3;
        Object object5 = object3;
        //Заносим все Object в LIST
        listobj.add(object1);
        listobj.add(object2);
        listobj.add(object3);
        listobj.add(object4);
        listobj.add(object5);
        //Выводим на экран кол-во обьектов в изначальной коллекции, есть 3 повтора
        System.out.println("До обработки коллеция выглядела так: " + listobj.toString());

        System.out.println("После обработки коллекция выглядит так: " + SetMethods.listToSet(listobj).toString());


    }
}
