package kethua;

public class EmployeeTest {
    public static void main(String[] args) {
        Employee employee = new Employee();
        System.out.println(employee);

        employee = new Employee("Phạm Thị Hương Trà", true, 18, "code");
        System.out.println(employee);

        employee.work();
        employee.setEnterprise("Viettel");
        System.out.println(employee);
    }
}
