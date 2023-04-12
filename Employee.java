package kethua;

public class Employee extends Student{
    private String  enterprise;
    public Employee() {
        super();
        this.enterprise = "CodeGym";

    }

    //constructor 4 tham số
    public Employee (String name, boolean gender, int age, String enterprise) {
        super();
        this.enterprise = enterprise;
    }

    // phương thức getter/sett


    public String getEnterprise() {
        return enterprise;
    }

    public void setEnterprise(String enterprise) {
        this.enterprise = enterprise;

    }
    public void work() {
        System.out.println("làm việc");
    }

    // phương thức ghi đè

    @Override
    public String toString() {
        return "A emloyee work at:"
                + getEnterprise()
                + ",which is a subclass of"
                + super.toString();
    }
}
