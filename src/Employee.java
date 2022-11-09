public class Employee {
    private final OneEmployeeInfo[] oneEmployeeInfos;
    private int size;


    // Constructor
    public Employee() {
        this.oneEmployeeInfos = new OneEmployeeInfo[10];
    }

    public void addEmployee(String OneEmployeeInfoFirstName, String OneEmployeeInfoSecondName, String OneEmployeeInfoLastName, int OneEmployeeInfoDepartment, float OneEmployeeInfoSalary) {
        if (size >= oneEmployeeInfos.length) {
            System.out.println("В базе данных нет места для новой записи.");
            return;
        }
        OneEmployeeInfo newEmployee = new OneEmployeeInfo(OneEmployeeInfoFirstName, OneEmployeeInfoSecondName, OneEmployeeInfoLastName, OneEmployeeInfoDepartment, OneEmployeeInfoSalary);
        oneEmployeeInfos[size++] = newEmployee;
        System.out.println("Запись создана.");
    }

    public void removeEmployee(String OneEmployeeInfoFirstName, String OneEmployeeInfoSecondName, String OneEmployeeInfoLastName) {
        for (int i = 0; i < oneEmployeeInfos.length; i++) {
            if (oneEmployeeInfos[i].getFirstName().equals(OneEmployeeInfoFirstName) && oneEmployeeInfos[i].getSecondName().equals(OneEmployeeInfoSecondName) && oneEmployeeInfos[i].getLastName().equals(OneEmployeeInfoLastName)) {
                oneEmployeeInfos[i] = null;
                if (i != oneEmployeeInfos.length - 1) {
                    System.arraycopy (oneEmployeeInfos, i + 1, oneEmployeeInfos, i, size - i);
                }
                size--;
                System.out.println("Запись " + OneEmployeeInfoFirstName + " " + OneEmployeeInfoSecondName + " " + OneEmployeeInfoLastName + " была удалена.");
                return;
            }
        }
    }


    public void changeDepartmentEmployee(String OneEmployeeInfoFirstName, String OneEmployeeInfoSecondName, String OneEmployeeInfoLastName, int OneEmployeeInfoDepartment){
        for (int i = 0; i < oneEmployeeInfos.length; i++)
            if (oneEmployeeInfos[i].getFirstName().equals(OneEmployeeInfoFirstName) && oneEmployeeInfos[i].getSecondName().equals(OneEmployeeInfoSecondName) && oneEmployeeInfos[i].getLastName().equals(OneEmployeeInfoLastName)) {
                oneEmployeeInfos[i].SetDepartment(OneEmployeeInfoDepartment);
                return;
            }
        System.out.println("Депортамент " + OneEmployeeInfoFirstName + " " + OneEmployeeInfoSecondName + " " + OneEmployeeInfoLastName + " был изменён.");
    }


    public void changeSalaryEmployee(String OneEmployeeInfoFirstName, String OneEmployeeInfoSecondName, String OneEmployeeInfoLastName, float OneEmployeeInfoSalary){
        for (int i = 0; i < oneEmployeeInfos.length; i++) {
            if (oneEmployeeInfos[i].getFirstName().equals(OneEmployeeInfoFirstName) && oneEmployeeInfos[i].getSecondName().equals(OneEmployeeInfoSecondName) && oneEmployeeInfos[i].getLastName().equals(OneEmployeeInfoLastName)) {
                oneEmployeeInfos[i].SetSalary(OneEmployeeInfoSalary);
                return;
            }
        }
        System.out.println("Зарплата " + OneEmployeeInfoFirstName + " " + OneEmployeeInfoSecondName + " " + OneEmployeeInfoLastName + " была изменёна.");
    }


    public void EmployeeMinSalary(){
        float countEmployeeMinSalary = oneEmployeeInfos[0].getSalary();
        for (int i = 0; i <= oneEmployeeInfos.length; i++) {
            if (countEmployeeMinSalary > oneEmployeeInfos[i].getSalary()) {
                countEmployeeMinSalary = oneEmployeeInfos[i].getSalary();
            }
        }
        System.out.println("Минимальная зарплата коллектива составляет - " + countEmployeeMinSalary);
    }


    public void EmployeeMaxSalary(){
        float countEmployeeMaxSalary = oneEmployeeInfos[0].getSalary();
        for (int i = 0; i <= oneEmployeeInfos.length; i++) {
            if (countEmployeeMaxSalary < oneEmployeeInfos[i].getSalary()) {
                countEmployeeMaxSalary = oneEmployeeInfos[i].getSalary();
            }
        }
        System.out.println("Максимальная зарплата коллектива составляет - " + countEmployeeMaxSalary);
    }


    public void MonthlySpendSalary(){
        float EmployeeAllSalary = 0f;
        for (int i = 0; i <= oneEmployeeInfos.length; i++) {
            EmployeeAllSalary = EmployeeAllSalary + oneEmployeeInfos[i].getSalary();
        }
        System.out.println("Общий расход на зарплаты за месяц составляет - " + EmployeeAllSalary);
    }

    public void MediumSalaryEmployee(){
        float EmployeeAllSalary = 0f;
        int countEmployee = 0;
        for (int i = 0; i <= oneEmployeeInfos.length; i++) {
            EmployeeAllSalary = EmployeeAllSalary + oneEmployeeInfos[i].getSalary();
            countEmployee = i;
        }
        System.out.println("Средняя зарплата коллектива составляет - " + EmployeeAllSalary / countEmployee);
    }

    public void OutputFIO(){
        for (int i = 0; i <= oneEmployeeInfos.length; i++) {
            System.out.println(i + " - " + oneEmployeeInfos[i].getFirstName() + " " + oneEmployeeInfos[i].getSecondName() + " " + oneEmployeeInfos[i].getLastName());
        }
    }

    public void printAllContacts() {
        for (int i = 0; i <= size; i++) {
            OneEmployeeInfo employeeInfo = oneEmployeeInfos[i];
            System.out.println((i + 1) + ": " + employeeInfo.getFirstName() + " " + employeeInfo.getSecondName() + " " + employeeInfo.getLastName() + " / " + employeeInfo.getDepartment() + " / " + employeeInfo.getSalary());
        }
    }
}