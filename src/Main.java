import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        ArrayList<String> a = new ArrayList<>();
        ArrayList<String> b = new ArrayList<>();
        ArrayList<String> c = new ArrayList<>();

        Scanner scanner = new Scanner(System.in);
        System.out.print("Введите 5 имен в список А. ");


        for (int i = 0; i < 5; i++){
            System.out.print("Введите имя " + (i + 1) +  ":  ");
            a.add(scanner.nextLine());
        }

        System.out.println(a);

        System.out.print("Введите 5 имен в список B. ");

        for (int i = 0; i < 5; i++){
            System.out.print("Введите имя " + (i + 1) +  ":  ");
            b.add(scanner.nextLine());
        }

        System.out.println(b);

        for (int i = 0; i < a.size(); i++) {
            c.add(a.get(i));
            c.add(b.get(b.size() - (i + 1)));
        }
        System.out.println(c);

        c.sort(Comparator.comparingInt(String::length));
        System.out.println("After sorting : ");
        System.out.println(c);





    }

    }

