package encapsulation;

public class Registration {
    public static void main(String[] args) {
        UserPage user = new UserPage();

        user.setUsername("Aylin1234");
        user.setEmail("aylin.gozal.005@gmail.com");
        user.setPassword("Aylin.");

        System.out.println("Username: " + user.getUsername());
        System.out.println("Email: " + user.getEmail());
        System.out.println("Password: " + user.getPassword());
        System.out.println("--------------");

        user.showProfile();
    }
}
