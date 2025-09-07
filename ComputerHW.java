package OuterAndInner;

public class ComputerHW {
    public static void main(String[] args) {
        Computer computer = new Computer();
        computer.about();
    }
}



class Computer{


    public static void about(){
        System.out.println("Brand: " + info.brand);
        System.out.println("Color: "+ info.color);
        System.out.println("The most frequently purchased model");
    }

    static class info{
       static String color = "grey";
       static String brand = "Hp";
    }

}