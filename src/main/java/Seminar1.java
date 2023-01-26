//1. Выбросить случайное целое число в диапазоне от 0 до 2000
// и сохранить в i
//2. Посчитать и сохранить в n номер старшего значащего бита
// выпавшего числа
//3. Найти все кратные n числа в диапазоне от i до Short.MAX_VALUE
// сохранить в массив m1
//4. Найти все некратные n числа в диапазоне от Short.MIN_VALUE
// до i и сохранить в массив m2
//int i = new Random().nextInt(k); //это кидалка случайных чисел!)


import java.util.Arrays;
import java.util.Random;
import java.util.stream.IntStream;

public class Seminar1 {

    public static void main(String[] args) {

//        1. случайное число
        Random rnd = new Random();
        int i = rnd.nextInt(20);
        System.out.println("i = " + i + ";");

//        2. номер старшего значимого бита

        int m = 0;
        int n = 0;

        for (int j = 0; Math.pow(2, j) <= i; j++) {
            m = (int) Math.pow(2, j);
            n = j;
        System.out.println("m = " + m);
        System.out.println("n = " + n);
        }

//        System.out.println(Integer.toBinaryString(i));
//        System.out.println(Integer.toBinaryString(m));

//        кратные n числа в диапазоне от i до Short.MAX_VALUE

        int[] arr1 = IntStream.rangeClosed(i, Short.MAX_VALUE).toArray();
        System.out.println(Arrays.toString(arr1));

        int len = arr1.length;
        System.out.println("len= " + len);

        int l = 7;
        int count1 = 0;

        for (int k = 0; k <= arr1.length-1; k++) {
            if (arr1[k] % l != 0)
                count1 += 1;
        }

        System.out.println("count1 = " + count1);

        int[] m1 = new int[count1];
        int temp1 = 0;

        for (int d = 0; d <= arr1.length-1; d++) {
            if (arr1[d] % l == 0) {
                m1[temp1] += arr1[d];
                temp1 += 1;
            }
        }
        System.out.println(Arrays.toString(m1));


    //        некратные n числа в диапазоне от Short.MIN_VALUE до i


        int[] arr2 = IntStream.rangeClosed(Short.MIN_VALUE, i).toArray();
        System.out.println(Arrays.toString(arr2));

        int lon = arr2.length;
        System.out.println("lon= " + lon);

        int p = 13;
        int count2 = 0;
        for (int t = 0; t <= arr2.length-1; t++) {
        if (arr2[t] % p != 0)
            count2 += 1;
        }

        System.out.println("count2 = " + count2);

        int[] m2 = new int[count2];
        int temp2 = 0;

        for (int b = 0; b <= arr2.length-1; b++) {
        if (arr2[b] % p != 0) {
            m2[temp2] += arr2[b];
            temp2 += 1;
        }
        }

        System.out.println(Arrays.toString(m2));


}
}

