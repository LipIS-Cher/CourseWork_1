import java.util.Objects;

public class Employee {
    // private field's
    private final String FirstName;

    private final String SecondName;

    private final String LastName;
    private int Department;
    private float Salary;

    public Employee(String EmployeeFirstName, String EmployeeSecondName, String EmployeeLastName, int EmployeeDepartment, float EmployeeSalary) {
        this.FirstName = EmployeeFirstName;
        this.SecondName = EmployeeSecondName;
        this.LastName = EmployeeLastName;
        this.Department = EmployeeDepartment;
        this.Salary = EmployeeSalary;
    }



    // Getter's
    public String getFirstName() { return this.FirstName; }

    public String getSecondName() { return this.SecondName; }

    public String getLastName() { return this.LastName; }

    public int getDepartment() { return this.Department; }
    public float getSalary() { return this.Salary; }


    // Setter's
    public void SetDepartment(int dept) { this.Department = dept; }
    public void SetSalary(float sal) { this.Salary = sal; }

    // Others

    public boolean equals(Object other) {
        if (this == other) return true;
        if (other == null || this.getClass() != other.getClass()) return false;
        Employee employee = (Employee) other;
        return Objects.equals(FirstName, employee.FirstName) && Objects.equals(SecondName, employee.SecondName) && Objects.equals(LastName, employee.LastName) && Objects.equals(Department, employee.Department) && Objects.equals(Salary, employee.Salary);
    }

    @Override
    public String toString() {
        return FirstName + " " + SecondName + " " + LastName + " / " + Department + " / " + Salary;
    }


    @Override
    public int hashCode() {
        return Objects.hash(FirstName, SecondName, LastName, Department, Salary);
    }
}

