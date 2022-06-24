//        * Опишите класс User с одним полем name. Добавьте конструктор,
//          сеттер и геттер
//
//         class User {
//         private String name;
//         }
//
//         Создайте Map, в котором для каждого пользователя хранится
//        количество очков, заработанных в какой-то игре
//        (Map<User, Integer>)

//        Напишите программу которая считывает с консоли имя и
//        показывает сколько очков у такого пользователя
//        Сами данные должно добавить в Map при создании или
//        сгенеририовать случайно.

package User;

import java.util.Iterator;
import java.util.LinkedHashMap;
import java.util.Map;

public class MainUser {
    public static void main(String[] args) {


        LinkedHashMap<User,Integer> map= User.generateUser(3);

        //Выводим через итератор наш map
        Iterator<Map.Entry<User, Integer>> iterator = map.entrySet().iterator();
        for (int i = 0; ; ++i) {
            if (iterator.hasNext()) {
                Map.Entry<User, Integer> entry = iterator.next();
                System.out.println((i + 1) + " игрок: " + entry.getKey().getName() + " - " + entry.getValue() + " очков");
            } else break;
        }

    }
}
