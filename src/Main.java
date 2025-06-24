import java.sql.SQLOutput;

public class Main {
    public static void main(String[] args) {

        Employee first = new Employee("Полина", "Назарова", "Ивановна", 1, 90000);
        Employee second = new Employee("Алиса", "Руднева", "Михайловна", 2, 85000);
        Employee third = new Employee("Арсений", "Егоров", "Георгиевич", 2, 100000);
        Employee fourth = new Employee("Арсений", "Гордеев", "Михайлович", 3, 75000);
        Employee fifth = new Employee("Кира", "Филиппова", "Данииловна", 1, 60000);
        Employee sixth = new Employee("Данила", "Литвинов", "Ильич", 4, 95000);
        Employee seventh = new Employee("Андрей", "Лебедев", "Егорович", 5, 85000);
        Employee eighth = new Employee("Даниил", "Петров", "Романович", 3, 50000);
        Employee ninth = new Employee("Алексей", "Антонов", "Глебович", 5, 60000);
        Employee tenth = new Employee("Алиса", "Ильина", "Леонидовна", 4, 55000);

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

        printAll(employees);

        System.out.println("sumSalary(employees) = " + sumSalary(employees));

        printLower(employees);
        printHigher(employees);
        System.out.println("getAvgSalary(employees) = " + getAvgSalary(employees));
        printAllNames(employees);

    }

    public static void printAll(Employee[] array) {
        for (Employee i : array) {

            System.out.println(i);
        }

    }

    public static int sumSalary(Employee[] array) {
        int sumSalary = 0;

        for (int i = 0; i < array.length; i++) {
            sumSalary += array[i].getSalary();
        }
        return sumSalary;
    }

    public static void printLower(Employee[] array) {
        int lower = 100000000;
        for (int i = 0; i < array.length; i++) {
            if (array[i].getSalary() < lower) {
                lower = array[i].getSalary();
            }
        }
        for (int i = 0; i < array.length; i++) {
            if (lower == array[i].getSalary()) {
                System.out.println("Сотрудник с наименьшей заработной платой - " + array[i]);
            }
        }
    }

    public static void printHigher(Employee[] array) {
        int higher = 0;
        for (int i = 0; i < array.length; i++) {
            if (array[i].getSalary() > higher) {
                higher = array[i].getSalary();
            }
        }
        for (int i = 0; i < array.length; i++) {
            if (higher == array[i].getSalary()) {
                System.out.println("Сотрудник с наибольшей заработной платой - " + array[i]);
            }
        }
    }

    public static int getAvgSalary(Employee[] array) {
        int avg = sumSalary(array)/ array.length;
        return avg;
    }

    public static void printAllNames(Employee[] array) {
        System.out.println("!!Список всех работников!!");
        for (int i = 0; i < array.length; i++) {

            System.out.print(array[i].getSurname() + " " + array[i].getName() + " " + array[i].getMiddleName());
            System.out.println();
        }
    }

}