package kethua;
// phuương thức khởi tạo lớp học sinh

public class Student extends people {
    private String className;

     // constructor mặc định
    public Student() {
     super();
     this.className = "D101_C1K14";

    }
    // constructor 4 tham số
    public Student (String name, boolean gender, int age, String className) {
        super(name, gender, age);
        this.className = className;
    }
    // phương thức getter/setter

    public String getClassName() {
        return className;
    }

    public void setClassName(String className) {
        this.className = className;
    }
    public void study() {
        System.out.println("học sinh");
    }

    // phương thức ghi đè

    @Override
    public String toString() {
        return "A student with class name:"
                +getClassName()
                +" ,which is a subclass of"
                +super.toString();
    }
}

    // chạy thử xem đúng hay không
 class StuderTest {
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


