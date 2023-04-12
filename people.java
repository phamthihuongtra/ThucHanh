package kethua;
// phương thức khởi tạo lớp con người
public class people {
    private String name;
    private boolean gender;
    private int age;

    // constructor mặc định
    public people () {
        this.name = "tên mặc định";
        this.gender = false;
        this.age = 0;

    }
    // constructor 3 tham số
    public people (String name, boolean gender, int age) {
        this.name = name;
        this.gender = gender;
        this. age = age;
    }
    // phương thức getter/setter


    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public boolean isGender() {
        return gender;
    }

    public void setGender(boolean gender) {
        this.gender = gender;
    }

    public int getAge() {
        return age;
    }

    public void setAge(int age) {
        this.age = age;
    }
    // phương thức ghi đè

    @Override
    public String toString() {
        return "A people with name:"
                + getName()
                + ", age: "
                + " and gender: "
                + (isGender()? "Nam" : "Nữ");
    }
}
