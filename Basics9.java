package laura;

public class Basics9 {
   
    String name;
    int id;
    double salary;

   
    public Basics9(String name, int id, double salary) {
        this.name = name;
        this.id = id;
        this.salary = salary;
    }

    public void displayEmployee() {
        System.out.println("Employee Name: " + name);
        System.out.println("Employee ID: " + id);
        System.out.println("Employee Salary: $" + salary);
        
    }

    public static void main(String[] args) {
        Basics9 emp1 = new Basics9("Alice", 101, 55000.50);
        Basics9 emp2 = new Basics9("Ben", 102, 62000.75);

        emp1.displayEmployee();
        emp2.displayEmployee();
    }
}
