public class Employee {

    private String name;
    private String surname;
    private String middleName;

    private int department;
    private int salary;

    private static int idCounter = 0;
    private int id;

    public Employee(String name, String surname, String middleName, int department, int salary) {
        this.name = name;
        this.surname = surname;
        this.middleName = middleName;
        this.department = department;
        this.salary = salary;
        this.assignId();
    }

    public void assignId() {
        idCounter++;
        this.id = idCounter;
    }

    public String getName() {
        return this.name;
    }

    public String getSurname() {
        return this.surname;
    }

    public String getMiddleName() {
        return this.middleName;
    }

    public int getDepartment() {
        return this.department;
    }

    public int getSalary() {
        return this.salary;
    }

    public int getId() {
        return this.id;
    }

    public int setDepartment(int department) {
        this.department = department;
        return this.department;
    }

    public int setSalary(int salary) {
        this.salary = salary;
        return this.salary;
    }

    @Override public boolean equals(Object obj){
        if(this.getClass() != obj.getClass()) {
            return false;
        }
        Employee other = (Employee) obj;
        return this.id == other.id;
    }

    @Override public int hashCode() {
        return java.util.Objects.hash(id);
    }

    @Override public String toString() {
        return surname + " " + name + " " + middleName + " Отдел:" + department +" " + "Оклад:" + salary;
    }
}