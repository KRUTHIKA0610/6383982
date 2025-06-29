class Employee {
    int employeeId;
    String name;
    String position;
    double salary;

    Employee(int employeeId, String name, String position, double salary) {
        this.employeeId = employeeId;
        this.name = name;
        this.position = position;
        this.salary = salary;
    }

    public String toString() {
        return employeeId + " " + name + " " + position + " ₹" + salary;
    }
}

public class EmployeeManagement {
    static final int MAX = 100;
    static Employee[] employees = new Employee[MAX];
    static int count = 0;

    static void addEmployee(Employee e) {
        if (count < MAX) {
            employees[count++] = e;
        }
    }

    static Employee searchEmployee(int id) {
        for (int i = 0; i < count; i++) {
            if (employees[i].employeeId == id) return employees[i];
        }
        return null;
    }

    static void deleteEmployee(int id) {
        for (int i = 0; i < count; i++) {
            if (employees[i].employeeId == id) {
                for (int j = i; j < count - 1; j++) {
                    employees[j] = employees[j + 1];
                }
                employees[--count] = null;
                break;
            }
        }
    }

    static void traverseEmployees() {
        for (int i = 0; i < count; i++) {
            System.out.println(employees[i]);
        }
    }

    public static void main(String[] args) {
        addEmployee(new Employee(1, "Anjali", "Manager", 60000));
        addEmployee(new Employee(2, "Bharath", "Developer", 45000));
        addEmployee(new Employee(3, "Chandru", "Tester", 35000));

        System.out.println("All Employees:");
        traverseEmployees();

        System.out.println("\nSearch ID 2:");
        System.out.println(searchEmployee(2));

        System.out.println("\nAfter Deletion of ID 2:");
        deleteEmployee(2);
        traverseEmployees();
    }
}
