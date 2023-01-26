//1. Напишите программу, чтобы найти вхождение в строке (содержащей все символы
// другой строки).
//2. Напишите программу, чтобы проверить, являются ли две данные строки вращением
// друг друга (вхождение в обратном порядке).
//*Напишите программу, чтобы перевернуть строку с помощью рекурсии.
//3. Дано два числа, например 3 и 56, необходимо составить следующие строки:
// 3 + 56 = 59 3 – 56 = -53 3 * 56 = 168 Используем метод StringBuilder.append().
//4. Замените символ “=” на слово “равно”. Используйте методы StringBuilder.insert(),
// StringBuilder.deleteCharAt().
//*Замените символ “=” на слово “равно”. Используйте методы StringBuilder.replace().
//**Сравнить время выполнения пунка 6 со строкой содержащей 10000 символов "="
// средствами String и StringBuilder.

import java.util.Random;

public class Seminar2 {
    public static void main(String[] args) {

//        Задачи на семинаре

//        Задание 1

        StringBuilder sb = new StringBuilder();
        sb.append(5);
        sb.append('A');
        sb.append(false);
        sb.append("Hello!");
        sb.append(1.23);

        StringBuilder sb2 = new StringBuilder();
        sb2.append(5);
        sb2.append('A');
        sb2.append(false);
        sb2.append("Hello!");
        sb2.append(1.23);

        System.out.println(sb.toString().equals(sb2.toString()));
        System.out.println(sb == sb2);

//        задание 2

        int a = 3;
        int b = 56;

        int c = a + b;
        int d = a - b;
        int e = a * b;
        float f = (float) a / b;

        StringBuilder sum = new StringBuilder();
        sum
                .append(a)
                .append(" + ")
                .append(b)
                .append(" = ")
                .append(a + b);
        System.out.println(sum);
        int n = sum.toString().indexOf(" = ");
        System.out.println(n);
        System.out.println(sum.replace(n, n, " равно "));

        StringBuilder diff = new StringBuilder();
        diff.append(a).append(" - ").append(b).append(" = ").append(a - b);
        System.out.println(diff);
        int m = diff.toString().indexOf(" = ");
        System.out.println(m);
        System.out.println(diff.replace(m, m, " равно "));

        StringBuilder prod = new StringBuilder();
        prod.append(a).append(" * ").append(b).append(" = ").append(a * b);
        System.out.println(prod);
        int t = prod.toString().indexOf(" = ");
        System.out.println(t);
        System.out.println(prod.replace(t, t, " равно "));

        StringBuilder divi = new StringBuilder();
        divi.append(a).append(" / ").append(b).append(" = ").append((float) a / b);
        System.out.println(divi);
        int p = divi.toString().indexOf(" = ");
        System.out.println(p);
        System.out.println(divi.replace(p, p, " равно "));

//      задание 3

        Random rnd = new Random();

        StringBuilder strB = new StringBuilder();
        long start1 = System.currentTimeMillis();
        for (int i = 0; i < 10000; i++) {
            char sim1 = (char) rnd.nextInt(26 + 'A');
            strB.append(sim1);
        }
        long end1 = System.currentTimeMillis();

        long t1 = end1 - start1;
        System.out.println("t1 = " + t1);
//        System.out.println(strB);

        String str = "";
        long start2 = System.currentTimeMillis();
        for (int i = 0; i < 10000; i++) {
            char sim2 = (char) rnd.nextInt(26 + 'A');
            str += sim2;
        }
        long end2 = System.currentTimeMillis();

        long t2 = end2 - start2;
        System.out.println("t2 = " + t2);
//        System.out.println(str);

        System.out.println("разница во времени = " + (t2-t1));

//        Задачи на дом

//        Задача 1 Напишите программу, чтобы найти вхождение в строке (содержащей все символы
// другой строки)

        StringBuilder str1 = new StringBuilder("skdjfhsjkdfkjbfjksdbfjsdfhjsfksfhjksefjksjks");
        StringBuilder str2 = new StringBuilder("jksdbf");

        int char1 = str1.toString().indexOf(str2.toString());

        System.out.println("char1 = " + char1);

//     Задание 2   Напишите программу, чтобы проверить, являются ли две данные строки вращением
// друг друга (вхождение в обратном порядке).

        StringBuilder str3 = new StringBuilder("skdjfhs");
        StringBuilder str4 = new StringBuilder("shfjdks");

        int strLen = str4.length();
        String result = "";
        for (int v = 0; v < strLen; v++) {
            result = str4.charAt(v) + result;

        }
        System.out.println("result = " + result);
        System.out.println(str3.toString().equals(result.toString()));

    }
}
