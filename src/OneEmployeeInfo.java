public class OneEmployeeInfo {
    // private field's
    private String FirstName;

    private String SecondName;

    private String LastName;
    private int Department;
    private float Salary;


    public OneEmployeeInfo(String oneEmployeeInfoFirstName, String oneEmployeeInfoSecondName, String oneEmployeeInfoLastName, int oneEmployeeInfoDepartment, float oneEmployeeInfoSalary) {
        this.FirstName = oneEmployeeInfoFirstName;
        this.SecondName = oneEmployeeInfoSecondName;
        this.LastName = oneEmployeeInfoLastName;
        this.Department = oneEmployeeInfoDepartment;
        this.Salary = oneEmployeeInfoSalary;
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


}
