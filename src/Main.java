public class Main {
    public static void main(String[] args) {

    Employee first = new Employee("Иван", "Иванов", "Иванович", 1, 10000);

    System.out.println(first.getId());

    Employee second = new Employee("Ива", "Ивано", "Иванови", 2, 20000);

    System.out.println(second.getId());

        System.out.println("first.equals(second) = " + first.equals(second));

        System.out.println("first.hashCode(second) = " + second.hashCode());

    }
}