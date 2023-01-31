//import java.util.*;
//
//public class teoriya {
//    java.util.*;
//
//
//    public class Seminar3 {
//        public class tack {
//            int a = 0;
//            List list = new ArrayList();
//
//        list.add(12);
//        list.add("kjh");
//        list.add(new Random());
//
//        if (list.get(0) instanceof Integer) {
//                a = (int) list.get(0);
//            }
//        if (list.get(2) instanceof String) {
//                String.out.println((String) list.get(0));
//            }
//
//            ArrayList<String> list2 = new ArrayList<>();
//        list.add("HelloWorld!");
//        list.add("Hello!");
//        list.add("World!");
//        list.add("HW!");
//
//        list.add(2, "World of Java!"); // вставить элемент на указанной позиции
//        list.set(2, "Java!"); // изменить элемент
//            a = list.size(); //количество элементов записанных в список
//        list.remove(a-1); //удалить элемент с индексом
//        System.out.println(list.remove("Java!"));
//
//        list.get(0); // достать элемент 0
//
//        for (int i = 0; i < list.size(); i++) {
//                System.out.println(list.get(i));
//            }
//
//        for (String str: list) {
//                System.out.println(str); //нельзя удалять элементы
//            }
//
//            Iterator<String> iterator = list.iterator();
//        while (iterator.hasNext()) {
//                String str = iterator.next();
//                System.out.println(str);
//                list.remove(0);
//                iterator.remove(); //удаляет текущий элемент
//
//            }
//
//            list forEach( (k) -> k ="!"));
//
//        System.out.println(list.indexOf("Java!"));
//        list.lastIndexOf("Java!");
//
//            ArrayList<Integer> l1 = new ArrayList<>();
//            ArrayList<Integer> l2 = new ArrayList<>();
//            Random rnd = new Random();
//        for (int i = 0; i < 8; i++) {
//                l1.add(rnd.nextInt(8));
//                l2.add(rnd.nextInt(8));
//            }
//        System.out.println(l1);
//        l1.sort(new Comparator<Integer>(){
//                @Override
//                public int compare(Integer t0, Integer t1) {
//                    return (t1%3==0 && t0%3==0)?0:(t1%3==0 && t0%3==0)?1:-1;
//                }
//            });
//        System.out.println(l2);
//
//        l1.removeAll(l2) //удаляет все элементы в l1, которые есть в l2
//                    l1.retainAll(l2); //оставляет в l1 те элементы, которые есть в l2
//
//        list.toArray(); //создает массив объектов из листа
//        Collection.sort(l1); //по умолчанию сортирует по возрастанию
//
//
//
//
//
//
//        }
//    }
//
//}
