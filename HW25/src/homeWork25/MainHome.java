package homeWork25;

import java.util.Scanner;
import java.util.function.Predicate;
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
        Human human2 = humanVasy.get();
        Human human3 = humanVasy.get();

        System.out.println(human1);

        Predicate<Integer> isPasportVozrast = (age) -> age >= 18;

        System.out.println(human1.getName() + " - " + (isPasportVozrast.test(human1.getAge()) ? "молодой" : "старый"));
        System.out.println(human2.getName() + " - " + (isPasportVozrast.test(human2.getAge()) ? "молодой" : "старый"));
        System.out.println(human3.getName() + " - " + (isPasportVozrast.test(human3.getAge()) ? "молодой" : "старый"));

    }
}
