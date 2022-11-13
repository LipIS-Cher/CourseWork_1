import java.util.Scanner;


public class Main {

    private static int size;
    private static final Employee[] Employees = new Employee[10];


    public static void main(String[] args) {
        System.out.println("============= Добро пожаловать в систему =============");
        while (true) {

            System.out.println("====================================================");
            System.out.println("Выберите действие в системе:");
            System.out.println("Чтобы вывести данный обо всех соотрудников нажмите - 1");
            System.out.println("Чтобы добавить соотрудника нажмите - 2");
            System.out.println("Чтобы удалить соотрудника нажмите - 3");
            System.out.println("Чтобы изменить отдел у соотрудника нажмите - 4");
            System.out.println("Чтобы изменить зарплату у соотрудника нажмите - 5");
            System.out.println("Чтобы вывести данные о соотруднике с минимальной зарплатой нажмите - 6");
            System.out.println("Чтобы вывести данные о соотруднике с максимальной зарплатой нажмите - 7");
            System.out.println("Чтобы вывести данные о трате на зарплаты за месяц нажмите - 8");
            System.out.println("Чтобы вывести данные о среднем значении зарплаты нажмите - 9");
            System.out.println("Чтобы вывести ФИО всех соотрудников нажмите - 10");
            System.out.println("Чтобы выйти из системы нажмите - 0");
            System.out.println(" ");


            Scanner command = new Scanner(System.in);
            System.out.print("Введите номер команды: ");
            int commandCount = command.nextInt();

            if (commandCount == 1) {
                System.out.println("====================================================");
                Main.printAllContacts();
            } else if (commandCount == 2) {
                System.out.println("===================================================");
                Scanner FirstName = new Scanner(System.in);
                System.out.print("Введите Фамилию: ");
                String FirstNameInfo = FirstName.next();
                Scanner SecondName = new Scanner(System.in);
                System.out.print("Введите Имя: ");
                String SecondNameInfo = SecondName.next();
                Scanner LastName = new Scanner(System.in);
                System.out.print("Введите Отчество: ");
                String LastNameInfo = LastName.next();
                Scanner Department = new Scanner(System.in);
                System.out.print("Введите номер департамента: ");
                int DepartmentInfo = Department.nextInt();
                Scanner Salary = new Scanner(System.in);
                System.out.print("Введите зарплату: ");
                float SalaryInfo = Salary.nextFloat();

                Main.addEmployee(FirstNameInfo, SecondNameInfo, LastNameInfo, DepartmentInfo, SalaryInfo);

            } else if (commandCount == 3) {
                System.out.println("====================================================");
                Scanner FirstName = new Scanner(System.in);
                System.out.print("Введите Фамилию: ");
                String FirstNameInfo = FirstName.next();
                Scanner SecondName = new Scanner(System.in);
                System.out.print("Введите Имя: ");
                String SecondNameInfo = SecondName.next();
                Scanner LastName = new Scanner(System.in);
                System.out.print("Введите Отчество: ");
                String LastNameInfo = LastName.next();

                Main.removeEmployee(FirstNameInfo, SecondNameInfo, LastNameInfo);
            } else if (commandCount == 4) {
                System.out.println("====================================================");
                Scanner FirstName = new Scanner(System.in);
                System.out.print("Введите Фамилию: ");
                String FirstNameInfo = FirstName.next();
                Scanner SecondName = new Scanner(System.in);
                System.out.print("Введите Имя: ");
                String SecondNameInfo = SecondName.next();
                Scanner LastName = new Scanner(System.in);
                System.out.print("Введите Отчество: ");
                String LastNameInfo = LastName.next();
                Scanner Department = new Scanner(System.in);
                System.out.print("Введите новый номер департамента: ");
                int DepartmentInfo = Department.nextInt();

                Main.changeDepartmentEmployee(FirstNameInfo, SecondNameInfo, LastNameInfo, DepartmentInfo);
            } else if (commandCount == 5) {
                System.out.println("====================================================");
                Scanner FirstName = new Scanner(System.in);
                System.out.print("Введите Фамилию: ");
                String FirstNameInfo = FirstName.next();
                Scanner SecondName = new Scanner(System.in);
                System.out.print("Введите Имя: ");
                String SecondNameInfo = SecondName.next();
                Scanner LastName = new Scanner(System.in);
                System.out.print("Введите Отчество: ");
                String LastNameInfo = LastName.next();
                Scanner Salary = new Scanner(System.in);
                System.out.print("Введите зарплату: ");
                float SalaryInfo = Salary.nextFloat();

                Main.changeSalaryEmployee(FirstNameInfo, SecondNameInfo, LastNameInfo, SalaryInfo);
            } else if (commandCount == 6) {
                System.out.println("====================================================");

                Main.EmployeeMinSalary();
            } else if (commandCount == 7) {
                System.out.println("====================================================");

                Main.EmployeeMaxSalary();
            } else if (commandCount == 8) {
                System.out.println("====================================================");

                Main.MonthlySpendSalary();
            } else if (commandCount == 9) {
                System.out.println("====================================================");

                Main.MediumSalaryEmployee();
            } else if (commandCount == 10) {
                System.out.println("====================================================");

                Main.OutputFIO();
            } else if (commandCount == 0) {
                break;
            }
        }
    }

    public static void addEmployee(String OneEmployeeInfoFirstName, String OneEmployeeInfoSecondName, String OneEmployeeInfoLastName, int OneEmployeeInfoDepartment, float OneEmployeeInfoSalary) {
        if (size >= Employees.length) {
            System.out.println("В базе данных нет места для новой записи.");
            return;
        }
        Employee newEmployee = new Employee(OneEmployeeInfoFirstName, OneEmployeeInfoSecondName, OneEmployeeInfoLastName, OneEmployeeInfoDepartment, OneEmployeeInfoSalary);
        Employees[size++] = newEmployee;
        System.out.println("Запись создана.");
    }

    public static void removeEmployee(String OneEmployeeInfoFirstName, String OneEmployeeInfoSecondName, String OneEmployeeInfoLastName) {
        int i = 0;
        while (i < size) {
            if (Employees[i].getFirstName().equals(OneEmployeeInfoFirstName) && Employees[i].getSecondName().equals(OneEmployeeInfoSecondName) && Employees[i].getLastName().equals(OneEmployeeInfoLastName)) {
                Employees[i] = null;
                if (i != Employees.length - 1) {
                    System.arraycopy (Employees, i + 1, Employees, i, size - i);
                }
                size--;
                System.out.println("Запись " + OneEmployeeInfoFirstName + " " + OneEmployeeInfoSecondName + " " + OneEmployeeInfoLastName + " была удалена.");
                return;
            }
            i++;
        }
    }


    public static void changeDepartmentEmployee(String OneEmployeeInfoFirstName, String OneEmployeeInfoSecondName, String OneEmployeeInfoLastName, int OneEmployeeInfoDepartment){
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


    public static void EmployeeMinSalary(){
        float countEmployeeMinSalary = Employees[0].getSalary();
        int i = 0;
        while (i < size) {
            if (countEmployeeMinSalary > Employees[i].getSalary()) {
                countEmployeeMinSalary = Employees[i].getSalary();
            }
            i++;
        }
        System.out.println("Минимальная зарплата коллектива составляет - " + countEmployeeMinSalary);
    }


    public static void EmployeeMaxSalary(){
        float countEmployeeMaxSalary = Employees[0].getSalary();
        int i = 0;
        while (i < size){
            if (countEmployeeMaxSalary < Employees[i].getSalary()) {
                countEmployeeMaxSalary = Employees[i].getSalary();
            }
            i++;
        }
        System.out.println("Максимальная зарплата коллектива составляет - " + countEmployeeMaxSalary);
    }


    public static void MonthlySpendSalary(){
        float EmployeeAllSalary = 0f;
        int i = 0;
        while (i < size){
            EmployeeAllSalary = EmployeeAllSalary + Employees[i].getSalary();
            i++;
        }
        System.out.println("Общий расход на зарплаты за месяц составляет - " + EmployeeAllSalary);
    }

    public static void MediumSalaryEmployee(){
        float EmployeeAllSalary = 0f;
        int countEmployee = 0;
        int i = 0;
        while (i < size) {
            EmployeeAllSalary = EmployeeAllSalary + Employees[i].getSalary();
            countEmployee = i;
            i++;
        }
        System.out.println("Средняя зарплата коллектива составляет - " + EmployeeAllSalary / countEmployee);
    }

    public static void OutputFIO(){
        int i = 0;
        while (i < size){
            System.out.println((i + 1) + " - " + Employees[i].getFirstName() + " " + Employees[i].getSecondName() + " " + Employees[i].getLastName());
            i++;
        }
    }

    public static void printAllContacts() {
        int i = 0;
        while (i < size) {
            Employee employee = Employees[i];
            System.out.println((i + 1) + ": " + employee.getFirstName() + " " + employee.getSecondName() + " " + employee.getLastName() + " / " + employee.getDepartment() + " / " + employee.getSalary());
            i++;
        }
    }
}