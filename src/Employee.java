import java.util.Objects;

public class Employee {
    // private field's
    private final String FirstName;

    private final String SecondName;

    private final String LastName;
    private int Department;
    private float Salary;

    private final int IDEmployee;


    private static int size;
    private static final Employee[] Employees = new Employee[10];

    public Employee(String EmployeeFirstName, String EmployeeSecondName, String EmployeeLastName, int EmployeeDepartment, float EmployeeSalary, int idEmployee) {
        this.FirstName = EmployeeFirstName;
        this.SecondName = EmployeeSecondName;
        this.LastName = EmployeeLastName;
        this.Department = EmployeeDepartment;
        this.Salary = EmployeeSalary;
        this.IDEmployee = idEmployee;
    }



    // Getter's
    public String getFirstName() { return this.FirstName; }

    public String getSecondName() { return this.SecondName; }

    public String getLastName() { return this.LastName; }

    public int getDepartment() { return this.Department; }
    public float getSalary() { return this.Salary; }

    public int getIDEmployee() { return this.IDEmployee; }


    // Setter's
    public void SetDepartment(int dept) { this.Department = dept; }
    public void SetSalary(float sal) { this.Salary = sal; }

    // Others

    public boolean equals(Object other) {
        if (this == other) return true;
        if (other == null || this.getClass() != other.getClass()) return false;
        Employee employee = (Employee) other;
        return Objects.equals(FirstName, employee.FirstName) && Objects.equals(SecondName, employee.SecondName) && Objects.equals(LastName, employee.LastName) && Objects.equals(Department, employee.Department) && Objects.equals(Salary, employee.Salary) && Objects.equals(IDEmployee, employee.IDEmployee);
    }

    @Override
    public String toString() {
        return FirstName + " " + SecondName + " " + LastName + " / " + Department + " / " + Salary + " / " + IDEmployee;
    }


    @Override
    public int hashCode() {
        return Objects.hash(FirstName, SecondName, LastName, Department, Salary, IDEmployee);
    }


    public static void addEmployee(String OneEmployeeInfoFirstName, String OneEmployeeInfoSecondName, String OneEmployeeInfoLastName, int OneEmployeeInfoDepartment, float OneEmployeeInfoSalary, int OneEmployeeInfoID) {
        if (size >= Employees.length) {
            System.out.println("В базе данных нет места для новой записи.");
            return;
        }
        Employee newEmployee = new Employee(OneEmployeeInfoFirstName, OneEmployeeInfoSecondName, OneEmployeeInfoLastName, OneEmployeeInfoDepartment, OneEmployeeInfoSalary, OneEmployeeInfoID);
        Employees[size++] = newEmployee;
        System.out.println("Запись создана.");
    }

    public static void removeEmployee(String OneEmployeeInfoFirstName, String OneEmployeeInfoSecondName, String OneEmployeeInfoLastName) {
        if (size < 1) {
            return;
        }
        int i = 0;
        while (i < size) {
            if (Employees[i].getFirstName().equals(OneEmployeeInfoFirstName) && Employees[i].getSecondName().equals(OneEmployeeInfoSecondName) && Employees[i].getLastName().equals(OneEmployeeInfoLastName)) {
                Employees[i] = null;
                if (i != Employees.length - 1) {
                    System.arraycopy (Employees, i + 1, Employees, i, Employees.length - i - 1);
                }
                size--;
                System.out.println("Запись " + OneEmployeeInfoFirstName + " " + OneEmployeeInfoSecondName + " " + OneEmployeeInfoLastName + " была удалена.");
                return;
            }
            i++;
        }
    }


    public static void changeDepartmentEmployee(String OneEmployeeInfoFirstName, String OneEmployeeInfoSecondName, String OneEmployeeInfoLastName, int OneEmployeeInfoDepartment){
        if (size < 1) {
            return;
        }
        int i = 0;
        while (i < size) {
            if (Employees[i].getFirstName().equals(OneEmployeeInfoFirstName) && Employees[i].getSecondName().equals(OneEmployeeInfoSecondName) && Employees[i].getLastName().equals(OneEmployeeInfoLastName)) {
                Employees[i].SetDepartment(OneEmployeeInfoDepartment);
                return;
            }
            i++;
        }
        System.out.println("Депортамент " + OneEmployeeInfoFirstName + " " + OneEmployeeInfoSecondName + " " + OneEmployeeInfoLastName + " был изменён.");
    }


    public static void changeSalaryEmployee(String OneEmployeeInfoFirstName, String OneEmployeeInfoSecondName, String OneEmployeeInfoLastName, float OneEmployeeInfoSalary){
        if (size < 1) {
            return;
        }
        int i = 0;
        while (i < size){
            if (Employees[i].getFirstName().equals(OneEmployeeInfoFirstName) && Employees[i].getSecondName().equals(OneEmployeeInfoSecondName) && Employees[i].getLastName().equals(OneEmployeeInfoLastName)) {
                Employees[i].SetSalary(OneEmployeeInfoSalary);
                return;
            }
            i++;
        }
        System.out.println("Зарплата " + OneEmployeeInfoFirstName + " " + OneEmployeeInfoSecondName + " " + OneEmployeeInfoLastName + " была изменёна.");
    }


    public static void EmployeeMinSalary() {
        if (size < 1) {
            return;
        }
        float countEmployeeMinSalary = 0;
        countEmployeeMinSalary = Employees[0].getSalary();
        String minSalaryFirstName = Employees[0].getFirstName();
        String minSalarySecondName = Employees[0].getSecondName();
        String minSalaryLastName = Employees[0].getLastName();
        int i = 0;
        while (i < size) {
            if (countEmployeeMinSalary > Employees[i].getSalary()) {
                countEmployeeMinSalary = Employees[i].getSalary();
                minSalaryFirstName = Employees[i].getFirstName();
                minSalarySecondName = Employees[i].getSecondName();
                minSalaryLastName = Employees[i].getLastName();
            }
            i++;
        }
        System.out.println("Минимальная зарплата составляет - " + countEmployeeMinSalary);
        System.out.println("Владелец зарплаты - " + minSalaryFirstName + " " + minSalarySecondName + " " + minSalaryLastName);
    }


    public static void EmployeeMaxSalary(){
        if (size < 1) {
            return;
        }
        float countEmployeeMaxSalary = Employees[0].getSalary();
        String maxSalaryFirstName = Employees[0].getFirstName();
        String maxSalarySecondName = Employees[0].getSecondName();
        String maxSalaryLastName = Employees[0].getLastName();
        int i = 0;
        while (i < size){
            if (countEmployeeMaxSalary < Employees[i].getSalary()) {
                countEmployeeMaxSalary = Employees[i].getSalary();
                maxSalaryFirstName = Employees[i].getFirstName();
                maxSalarySecondName = Employees[i].getSecondName();
                maxSalaryLastName = Employees[i].getLastName();
            }
            i++;
        }
        System.out.println("Максимальная зарплата составляет - " + countEmployeeMaxSalary);
        System.out.println("Владелец зарплаты - " + maxSalaryFirstName + " " + maxSalarySecondName + " " + maxSalaryLastName);
    }


    public static void MonthlySpendSalary(){
        if (size < 1) {
            return;
        }
        float EmployeeAllSalary = 0f;
        int i = 0;
        while (i < size){
            EmployeeAllSalary = EmployeeAllSalary + Employees[i].getSalary();
            i++;
        }
        System.out.println("Общий расход на зарплаты за месяц составляет - " + EmployeeAllSalary);
    }

    public static void MediumSalaryEmployee(){
        if (size < 1) {
            return;
        }
        float EmployeeAllSalary = 0f;
        int countEmployee = 1;
        int i = 0;
        while (i < size) {
            EmployeeAllSalary = EmployeeAllSalary + Employees[i].getSalary();
            countEmployee = i;
            i++;
        }
        System.out.println("Средняя зарплата коллектива составляет - " + EmployeeAllSalary / (countEmployee + 1));
    }

    public static void OutputFIO(){
        if (size < 1) {
            return;
        }
        int i = 0;
        while (i < size){
            System.out.println((i + 1) + " - " + Employees[i].getFirstName() + " " + Employees[i].getSecondName() + " " + Employees[i].getLastName());
            i++;
        }
    }

    public static void printAllContacts() {
        if (size < 1) {
            return;
        }
        int i = 0;
        while (i < size) {
            Employee employee = Employees[i];
            System.out.println((i + 1) + ": ФИО - " + employee.getFirstName() + " " + employee.getSecondName() + " " + employee.getLastName() + " / Депар. - " + employee.getDepartment() + " / ЗП - " + employee.getSalary() + " / ID - " + employee.getIDEmployee());
            i++;
        }
    }
}

