package Classes;

public class Shop {
    int id;
    String name;
    int quantity;
    String location;
    String categories;


    void shop_info(){
        System.out.println(id);
        System.out.println("Welcome to " + name);
        System.out.println("We have " + quantity + " shops around the world");
        System.out.println("Our store in Baku is located in " + location);
        System.out.println("In our store you can shop by these categories: " + categories);
    }
}
