package homeWork25;

import java.util.Scanner;
import java.util.function.Supplier;

public class MainHome {
    public static void main(String[] args) {
        Supplier<Human> humanVasy = () -> {
            System.out.println("Введите имя: ");
            String name = new Scanner(System.in).nextLine();
            System.out.println("Введите возраст: ");
            int age = new Scanner(System.in).nextInt();
            System.out.println("Введите рост в см: ");
            double height = new Scanner(System.in).nextDouble();


            Human human = new Human(name, age, height);
            return human;
        };
        Human human1 = humanVasy.get();
//        Human human2 = humanVasy.get();
//        Human human3 = humanVasy.get();

        System.out.println(human1);

    }
}
