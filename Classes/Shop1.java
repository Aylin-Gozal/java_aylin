package Classes;

public class Shop1 {
    public static void main(String[] args) {
        Shop shop = new Shop();
        shop.id = 1;
        shop.name = "SmartNook";
        shop.quantity = 138;
        shop.location = "Crescent Mall, 2nd floor";
        shop.categories = "telephones, laptops, tablets, headphones, chargers, speakers";


        shop.shop_info();
    }
}
