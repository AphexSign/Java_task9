package Set;

import java.util.*;

public class SetMethods {
    //На вход поступает коллекция обьектов, возвращает коллекцию
    public static List<Object> listToSet(List<Object> objectList) {
        //Используем LinkerHashSet, чтобы коллекция выходила примерно в том порядке, в котором поступала изначально
        //HashSet - за счет особенностей хранения элементов, может вернуть нам последовательность не в той очередности
        //TreeSet - не использовали, поскольку не было задачи их сортировки
        Set<Object> objectSet = new LinkedHashSet<>();
        objectSet.addAll(objectList);
        //Выделяем участок памяти для переменной в которой будет хранится выходной результат - "коллекция"
        List<Object> result = new ArrayList<>();
        //Передаем все из Set в List
        result.addAll(objectSet);
        //Возвращаем результат из метода
        return result;
    }
}
