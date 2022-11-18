import java.util.Random;

import java.util.Scanner;


public class Main {

    public static void main(String[] args) {
        Employee.addEmployee("Q", "A", "Z", 1, 12000, 1);
        Employee.addEmployee("W", "S", "X", 2, 15621, 2);
        Employee.addEmployee("E", "D", "C", 3, 15565, 3);
        Employee.addEmployee("R", "F", "V", 4, 15651, 4);
        Employee.addEmployee("T", "G", "B", 5, 53135, 5);
        Employee.addEmployee("Y", "H", "N", 1, 35135, 6);
        Employee.addEmployee("U", "J", "M", 2, 11816, 7);
        Employee.addEmployee("I", "K", "N", 3, 18433, 8);
        Employee.addEmployee("O", "L", "B", 4, 18666, 9);
        Employee.addEmployee("P", "A", "Z", 5, 88626, 10);

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
                Employee.printAllContacts();
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
                Random Id = new Random();
                int IDInfo = Id.nextInt(100000);

                Employee.addEmployee(FirstNameInfo, SecondNameInfo, LastNameInfo, DepartmentInfo, SalaryInfo, IDInfo);

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

                Employee.removeEmployee(FirstNameInfo, SecondNameInfo, LastNameInfo);
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

                Employee.changeDepartmentEmployee(FirstNameInfo, SecondNameInfo, LastNameInfo, DepartmentInfo);
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

                Employee.changeSalaryEmployee(FirstNameInfo, SecondNameInfo, LastNameInfo, SalaryInfo);
            } else if (commandCount == 6) {
                System.out.println("====================================================");

                Employee.EmployeeMinSalary();
            } else if (commandCount == 7) {
                System.out.println("====================================================");

                Employee.EmployeeMaxSalary();
            } else if (commandCount == 8) {
                System.out.println("====================================================");

                Employee.MonthlySpendSalary();
            } else if (commandCount == 9) {
                System.out.println("====================================================");

                Employee.MediumSalaryEmployee();
            } else if (commandCount == 10) {
                System.out.println("====================================================");

                Employee.OutputFIO();
            } else if (commandCount == 0) {
                break;
            }
        }
    }
}