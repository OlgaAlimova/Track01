// набрать ФИО, пол, возраст - 5 человек. Этот текст разделить
// по строкам, а каждую строку разделить по словам. Отдельные списки:
// для фамилии, для имени, для отчества, для пола, для возраста и наши
// данные раскидать по этим спискам.

import java.io.FileReader;
import java.io.IOException;
import java.util.ArrayList;
import java.util.Arrays;

public class Seminar4 {
    public static void main(String[] args) {

        try {
            FileReader reader = new FileReader("src/main/text.txt");
            String text = "";
            while (reader.ready()) {
                text += (char) reader.read();
            }
            String[] parts = text.split("\n");
            System.out.println(Arrays.toString(parts));

            ArrayList<String> surname = new ArrayList<>();
            ArrayList<String> name = new ArrayList<>();
            ArrayList<String> lastname = new ArrayList<>();
            ArrayList<Integer> age = new ArrayList<>();
            ArrayList<Boolean> gender = new ArrayList<>();

            for (int i = 0; i < parts.length; i++) {
                String[] temp = parts[i].split(" ");
                surname.add(temp[0]);
                name.add(temp[1]);
                lastname.add(temp[2]);
                age.add(Integer.parseInt(temp[3]));
                gender.add(temp[4].contains("М")?false:true);

            }
            System.out.println(surname);
            System.out.println(name);
            System.out.println(lastname);
            System.out.println(age);
            System.out.println(gender);

            ArrayList<Integer> var = new ArrayList<>();
            var.add(3);
            var.add(1);
            var.add(4);
            var.add(2);
            var.add(0);

            System.out.println(var);

            for (int j = 0; j < var.size(); j++) {
                ArrayList<String> finaltext = new ArrayList<>();
                finaltext.add(surname.get(var.get(j)));
                finaltext.add(name.get(var.get(j)));
                finaltext.add(lastname.get(var.get(j)));
                finaltext.add(String.valueOf(age.get(var.get(j))));
                if (gender.get(var.get(j)) == true) {
                    finaltext.add("Ж");
                }
                else finaltext.add("М");

                System.out.println(finaltext);
            }
        } catch (IOException e) {
            System.out.println(e.getMessage());
        }
    }
}
