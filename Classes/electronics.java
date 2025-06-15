package Classes;

public class electronics {
    String brand;
    String model;
    String color;
    int storage;
    int weight;


    void device_info(){
        System.out.println("Information about my device: ");
        System.out.println("The brand of my device is " + brand);
        System.out.println("The model of my device is " + model);
        System.out.println("I have the limited color " + color);
        System.out.println("My storage is " + storage);
        System.out.println("The weight if this device is " + weight);
    }
}
