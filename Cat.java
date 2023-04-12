package kethua;

  // Lớp mèo kế thừa từ lớp động vật
public class Cat extends Animal{
    private  double age;

    // constructor mặc định cho lớp mèo
    public Cat() {
       super();
       this.age = 1.0;
    }

    // constructor 1 tham số
    public Cat(double age) {
        super();
        this.age = age;
    }

    // constructor 3 tham số
    public Cat(double weight, double height, double age) {
        super(weight,height);
        this.age = age;
    }

    public double getAge() {
        return age;
    }

    // phương thức getter/setter

    public void setAge(double age) {
        this.age = age;
    }
    public String sound() {
        return "Meo meo...";
    }
    public String eat() {
        return "Mouse";
    }

    // phương thức ghi đè

    @Override
    public String toString() {
        return "cat{" +
                "age=" + age +
                super.toString();
    }
}

   // chạy thử xem đúng hay không
class catTest {
    public static void main(String[] args) {
        Cat cat = new Cat();
        System.out.println(cat);

        cat = new Cat(5.5);
        System.out.println(cat);

        cat = new Cat(5.5,5,4);
        System.out.println(cat);
    }
}