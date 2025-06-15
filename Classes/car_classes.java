package Classes;

public class car_classes {
    String color;
    String model;
    int mass;
    int speed;

    void drive() {
        System.out.println("Car is riding with speed " + speed);
    }
    void car_info(){
        System.out.println("Model of the car is " + model);
        System.out.println("Color of the car is " + color);
        System.out.println("Mass of the car is " + mass);
    }

//    public static void main(String[] args) {
//        car_classes ferrari = new car_classes();
//        ferrari.color = "red";
//        ferrari.model = "F80";
//        ferrari.mass = 800;
//        ferrari.speed = 500;
//    }
}
