public class Main {
    public static void main(String[] args) {

    Employee first = new Employee("Полина", "Назарова", "Ивановна", 1, 110000);
    Employee second = new Employee("Алиса", "Руднева", "Михайловна", 2, 110000);
    Employee third = new Employee("Арсений", "Егоров", "Георгиевич", 2, 110000);
    Employee fourth = new Employee("Арсений", "Гордеев", "Михайлович", 3, 110000);
    Employee fifth = new Employee("Кира", "Филиппова", "Данииловна", 1, 110000);
    Employee sixth = new Employee("Данила", "Литвинов", "Ильич", 4, 110000);
    Employee seventh = new Employee("Андрей", "Лебедев", "Егорович", 5, 110000);
    Employee eighth = new Employee("Даниил", "Петров", "Романович", 3, 110000);
    Employee ninth = new Employee("Алексей", "Антонов", "Глебович", 5, 110000);
    Employee tenth = new Employee("Алиса", "Ильина", "Леонидовна", 4, 110000);

    Employee[] employees = new Employee[10];
    employees[0] = first;
    employees[1] = second;
    employees[2] = third;
    employees[3] = fourth;
    employees[4] = fifth;
    employees[5] = sixth;
    employees[6] = seventh;
    employees[7] = eighth;
    employees[8] = ninth;
    employees[9] = tenth;

        for (int i = 0; i < employees.length ; i++) {

            System.out.println("Employees.toString() = " + employees[i].toString());
        }

    employees[5] = null;

        System.out.println(employees[5]);


    }
}