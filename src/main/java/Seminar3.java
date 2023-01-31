


import java.util.*;
import java.util.function.UnaryOperator;

public class Seminar3 {
    public static void main(String[] args) {
        ArrayList<String> l1 = new ArrayList<>();
        l1.add("Hello!");
        l1.add("Today");
        l1.add("we");
        l1.add("are");
        l1.add("writing");
        l1.add("a program");
        l1.add("in Java");
        ArrayList<Integer> l2 = new ArrayList<>();
        Random rnd = new Random();
        for (int i = 0; i < l1.size(); i++) {
            l2.add(rnd.nextInt(10));
        }
        System.out.println(l1);
        System.out.println(l2);

       ArrayList<String> tmp = new ArrayList<>();
        for (int j = 0; j < l1.size(); j++) {
            if (l2.get(j) > l1.get(j).length()) {
                tmp.add(l1.get(j));
            }
        }
        System.out.println(tmp);
        l1.removeAll(tmp);
        System.out.println(l1);




// homework

//Создать новый список, добавить несколько строк и
// вывести коллекцию на экран.

        ArrayList<String> flowers = new ArrayList<>();
        flowers.add("rose");
        flowers.add("violet");
        flowers.add("tulip");
        flowers.add("orchid");
        flowers.add("gladiolus");
        flowers.add("dandelion");
        flowers.add("forget-me-not");

        System.out.println(flowers);

//Итерация всех элементов списка цветов и добавления
// к каждому символа '!'.

        ArrayList<String> new_flowers = new ArrayList<>();

        for (int n = 0; n < flowers.size(); n++) {
            new_flowers.add(flowers.get(n) + "!");
        }
        System.out.println(new_flowers);

//Вставить элемент в список в первой позиции.

        new_flowers.add(0, "favorite flowers: ");
        System.out.println(new_flowers);

//Извлечь элемент (по указанному индексу) из заданного списка.
//Обновить определенный элемент списка по заданному индексу.
//Удалить третий элемент из списка.

        System.out.println(new_flowers.get(5));
        new_flowers.set(5, "tulip!");
        new_flowers.remove(3);
        System.out.println(new_flowers);

//Поиска элемента в списке по строке.
//Создать новый список и добавить в него несколько елементов
// первого списка.
//Удалить из первого списка все элементы отсутствующие
// во втором списке.
//*Сортировка списка.

        ArrayList<String> beauty = new ArrayList<>();
        for (int t = 0; t < new_flowers.size(); t++) {
            if(t % 2 == 0)
                beauty.add(new_flowers.get(t));
        }

        System.out.println(beauty);
        new_flowers.removeAll(beauty);
        Collections.sort(new_flowers);
        System.out.println(new_flowers);


    }
}