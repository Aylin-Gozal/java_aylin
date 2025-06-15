package Classes;

public class computer {
    public static void main(String[] args) {
        electronics computer = new electronics();
        computer.brand = "MacBook";
        computer.model = "Air";
        computer.color = "Midnight";
        computer.storage = 512;
        computer.weight = 1024;

        computer.device_info();
    }
}
