public class Main {
    public static void main(String[] args) {
        Test test = new TestImplemented();
        test.print();

        Test test1 = new Test() {
            @Override
            public void print() {
                System.out.println("TEST222");
            }
        };
        test1.print();

        Test test2 = new Test() {
            @Override
            public void print() {
                System.out.println("Hello");
            }
        };
        test2.print();


//        а вот сейчас будем использовать метод лямбда
//        и будем подставлять реализацию метода на лету
//        и это очень круто и легко

        Test test3 = () -> System.out.println("Vot eto da");
        test3.print();

        TestMest pest = (x) -> System.out.println("Sergey - " + x);
        pest.printing(55);

//        это множество функциональных интерфейсов ищи в интернете!!!


//        Predicate«Integer> isPositive = (x) -> × > 4;
//        BinaryOperator<Integer> multiply = (×, Y) →>×* y;
//        UnaryOperator<Integer> square = (x) -> × * x;
//        Function‹Integer, String> converter = (x) -> String.valuef(x);
//        Consumer<Integer> print = (printed) -> System.out.println(printed);
//        Supplier<String> stringFactory = () -> {};


    }
}