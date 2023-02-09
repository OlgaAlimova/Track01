//Создать словарь HashMap. Обобщение <Integer, String>.
//Заполнить тремя ключами (индекс, цвет), добавить ключь,
// если не было!)
//Изменить значения дописав восклицательные знаки.
//*Создать TreeMap, заполнить аналогично.
//*Увеличить количество элементов до 1000 случайными
// ключами и общей строкой.
//**Сравнить время последовательного и случайного перебора
// тысячи элементов словарей.


import java.util.*;

public class Seminar5 {
    public static void main(String[] args) {

        HashMap<Integer,String> map = new HashMap<>();

        map.put(1, "синий");
        map.put(2, "желтый");
        map.put(3, "белый");
        map.putIfAbsent(4, "красный");
        System.out.println(map);

        for (int i = 0; i < map.size(); i++) {
            int tmp = i + 1;
            map.replace(tmp, map.get(tmp)+"!");
        }

        System.out.println(map);

        TreeMap<Integer, String> treeMap = new TreeMap<>();
        treeMap.put(1, "синий");
        treeMap.put(2, "желтый");
        treeMap.put(3, "белый");
        treeMap.putIfAbsent(4, "красный");
        System.out.println(treeMap);

        int j = 0;
        Random rmd = new Random(1000);
        while (j < 1001){
//        for (int j = 0; j < 11; j++) {

            treeMap.put((rmd.nextInt()), "зеленый");
            j += 1;
        }
        System.out.println(treeMap);

        long start1 = System.currentTimeMillis();

        treeMap.forEach((k, v) -> System.out.println(k + " " + v));

        long end1 = System.currentTimeMillis();

        long t1 = end1 - start1;
        System.out.println("t1 = " + t1);

        long start2 = System.currentTimeMillis();

        Iterator<String> iterator = treeMap.values().iterator();
        while (iterator.hasNext()) {
            String tmp = iterator.next();
            System.out.println(tmp);
        }

        long end2 = System.currentTimeMillis();

        long t2 = end2 - start2;
        System.out.println("t2 = " + t2);

        System.out.println("разница во времени = " + (t2 - t1));


        }

    }

