package User;

import java.util.HashMap;
import java.util.LinkedHashMap;
import java.util.Scanner;

public class User {
    private String name;

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public static LinkedHashMap<User, Integer> generateUser(int count) {
        //Count-раз будем спрашивать имя и создавать обьект User
        //Отдельно будем создавать случайное количество очков
        //Выбран именно LinkedHashMap, чтобы игроки выводились в той очередности, по которой мы вводили их
        Scanner scanner = new Scanner(System.in);
        LinkedHashMap<User, Integer> map = new LinkedHashMap<>();

        for (int i = 0; i < count; i++) {
            System.out.print("Введите имя игрока: ");
            String tmpname = scanner.nextLine();
            //Создаем создаем нового юзера
            //Передаем ему имя
            User tmpUser = new User();
            tmpUser.setName(tmpname);
            int points = (int) (Math.random() * 100) + 1;
            map.put(tmpUser, points);
        }

        return map;
    }


}
