import java.util.Scanner;


public class Main {
    public static void main(String[] args) {
        Employee employee = new Employee();
        System.out.println("============= Добро пожаловать в систему =============");
        while (true){

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

            if (commandCount == 1){
                System.out.println("====================================================");
                employee.printAllContacts();
            } else if (commandCount == 2){
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

                employee.addEmployee(FirstNameInfo, SecondNameInfo, LastNameInfo, DepartmentInfo, SalaryInfo);

            } else if (commandCount == 3){
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

                employee.removeEmployee(FirstNameInfo, SecondNameInfo, LastNameInfo);
            } else if (commandCount == 4){
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
                System.out.print("Введите номер департамента: ");
                int DepartmentInfo = Department.nextInt();

                employee.changeDepartmentEmployee(FirstNameInfo, SecondNameInfo, LastNameInfo, DepartmentInfo);
            } else if (commandCount == 5){
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

                employee.changeSalaryEmployee(FirstNameInfo, SecondNameInfo, LastNameInfo, SalaryInfo);
            } else if (commandCount == 6){
                System.out.println("====================================================");

                employee.EmployeeMinSalary();
            } else if (commandCount == 7){
                System.out.println("====================================================");

                employee.EmployeeMaxSalary();
            } else if (commandCount == 8){
                System.out.println("====================================================");

                employee.MonthlySpendSalary();
            } else if (commandCount == 9){
                System.out.println("====================================================");

                employee.MediumSalaryEmployee();
            } else if (commandCount == 10){
                System.out.println("====================================================");

                employee.OutputFIO();
            } else if (commandCount == 0){
                break;
            }
        }
    }
}