import java.util.HashMap;
import java.util.LinkedList;
import java.util.Random;

////import java.util.*;
////
public class teoriya {

    static HashMap<Integer, Object> map = new HashMap<>();
    static final Object OSC = new Object();
    public static void main(String[] args) {

        Random rnd = new Random();
        for (int i = 0; i < 100; i++) {
            map.put(rnd.nextInt(0, 100), "123");
        }
        System.out.println(map);



    }
    public static boolean add(Integer i) {
        map.put(i, OSC);
        return true;

    }
}
////    java.util.*;
////
////
////    public class Seminar3 {
////        public class tack {
////            int a = 0;
////            List list = new ArrayList();
////
////        list.add(12);
////        list.add("kjh");
////        list.add(new Random());
////
////        if (list.get(0) instanceof Integer) {
////                a = (int) list.get(0);
////            }
////        if (list.get(2) instanceof String) {
////                String.out.println((String) list.get(0));
////            }
////
////            ArrayList<String> list2 = new ArrayList<>();
////        list.add("HelloWorld!");
////        list.add("Hello!");
////        list.add("World!");
////        list.add("HW!");
////
////        list.add(2, "World of Java!"); // вставить элемент на указанной позиции
////        list.set(2, "Java!"); // изменить элемент
////            a = list.size(); //количество элементов записанных в список
////        list.remove(a-1); //удалить элемент с индексом
////        System.out.println(list.remove("Java!"));
////
////        list.get(0); // достать элемент 0
////
////        for (int i = 0; i < list.size(); i++) {
////                System.out.println(list.get(i));
////            }
////
////        for (String str: list) {
////                System.out.println(str); //нельзя удалять элементы
////            }
////
////            Iterator<String> iterator = list.iterator();
////        while (iterator.hasNext()) {
////                String str = iterator.next();
////                System.out.println(str);
////                list.remove(0);
////                iterator.remove(); //удаляет текущий элемент
////
////            }
////
////            list forEach( (k) -> k ="!"));
////
////        System.out.println(list.indexOf("Java!"));
////        list.lastIndexOf("Java!");
////
////            ArrayList<Integer> l1 = new ArrayList<>();
////            ArrayList<Integer> l2 = new ArrayList<>();
////            Random rnd = new Random();
////        for (int i = 0; i < 8; i++) {
////                l1.add(rnd.nextInt(8));
////                l2.add(rnd.nextInt(8));
////            }
////        System.out.println(l1);
////        l1.sort(new Comparator<Integer>(){
////                @Override
////                public int compare(Integer t0, Integer t1) {
////                    return (t1%3==0 && t0%3==0)?0:(t1%3==0 && t0%3==0)?1:-1;
////                }
////            });
////        System.out.println(l2);
////
////        l1.removeAll(l2) //удаляет все элементы в l1, которые есть в l2
////                    l1.retainAll(l2); //оставляет в l1 те элементы, которые есть в l2
////
////        list.toArray(); //создает массив объектов из листа
////        Collection.sort(l1); //по умолчанию сортирует по возрастанию
////
////
////
////
////
////
////        }
////    }
////
////}
//
//import java.util.HashMap;
//import java.util.Iterator;
//import java.util.Set;

//import java.io.FileNotFoundException;
//import java.io.FileReader;
//import java.io.FileWriter;
//import java.io.IOException;
//
//public class teoriya {
//    public static void main(String[] args) {
//
//        HashMap<String,String> map = new HashMap<>();
//
//        map.put("One", "1");
//        map.put("Два", "2");
//        map.put("Three", "3");
//        map.put("Четыре", "4");
//        System.out.println(map.putIfAbsent("Five", "5"));
//        System.out.println(map.putIfAbsent("Five", "6"));
//        System.out.println(map.get("Два"));
//
//        map.forEach((k, v) -> System.out.println(k + " " + v));
//
//        Set<String> keySet = map.keySet();
//        for (int i = 0; i < keySet.size(); i++) {
//            System.out.println("" + keySet.toArray()[i] + " " + map.get(keySet.toArray()[i]));
//
//        }
//
//        Iterator<String> iterator = map.values().iterator();
//        while (iterator.hasNext()) {
//            String tmp = iterator.next();
//            System.out.println(tmp);
//        }
//
//        for (String tmp: keySet) {
//            System.out.println(map.get(tmp));
//            map.remove(tmp);
//        }
//
//        map.compute("One", (k, v) -> v="1"); //позволяет изменять данные в map,
//        // если такой ключ существует, если такого ключа нет, то добавляет
//        map.computeIfPresent("Onek", (k, v) -> v="1"); //такой же, но только если такой ключ есть
//        map.computeIfAbsent("One", v -> v="12"); // сработает, только если такого ключа не существует
//
//        System.out.println(map.getOrDefault("123", "defVol")); // возвращает значение по ключу, если ключ существует.
////        если ключа нет, то возвращает значение по defVol
//
//        map.containsValue("1"); //определяет есть ли такое значение
////        map.putIfAbsent("One", map.get("One")+"!");
//
//        System.out.println(map);
//
//        FileWriter fileWriter = null;
//        FileReader reader = null;
//        try {
//            fileWriter = new FileWriter("db.sql");
//            fileWriter.append("Привет мир!");
//            fileWriter.flush();
//        } catch (IOException e) {
//            System.out.println(e.getMessage()); // вывести в консоль сообщение об исключении
//        }
//
//        String text = "";
//
//        try {
//            reader = new FileReader("db.sql");
//            while (reader.ready()) {
//                text += (char)reader.read();
//            }
//
//        } catch (IOException e) {
//            System.out.println(e.getMessage());
//        }
//        System.out.println(text);
//
//    }
//}

