package kethua;

// lớp động vật
public class Animal {
    private double weight;
    private double height;


    //construtor mặc định
    public Animal() {
        this.weight = 0.0;
        this.height = 0.0;
    }
    //constructor với 2 tham số
    public Animal(double weight, double height) {
        this.weight = weight;
        this.height = height;
    }
    //phương thức getter/setter
    public double getWeight() {
        return weight;
    }

    public void setWeight(double weight) {
        this.weight = weight;
    }

    public double getHeight() {
        return height;
    }

    public void setHeight(double height) {
        this.height = height;
    }
    //phương thức ghi đè
    @Override
    public String toString() {
        return "Animal{" +
                "weight=" + weight +
                ", height=" + height +
                '}';
    }

}
