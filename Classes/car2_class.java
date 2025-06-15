package Classes;

public class car2_class {
    public static void main(String[] args) {
        car_classes mercedes = new car_classes();
        mercedes.model = "AMG GT";
        mercedes.color = "black";
        mercedes.mass = 1500;
        mercedes.speed = 310;

        mercedes.drive();
        mercedes.car_info();


    }
}
