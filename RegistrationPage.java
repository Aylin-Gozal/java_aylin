package encapsulation;

public class RegistrationPage {
    public static void main(String[] args) {
        Register r = new Register();

        r.setName("Aylin");
        r.setSurname("Gozal");
        r.setAge(18);
        r.setEmail("aylin.gozal.005@gmail.com");
        r.setUsername("Aylin1234");
        r.setPassword("1234");



        System.out.println("Name: " + r.getName());
        System.out.println("Surname: " + r.getSurname());
        System.out.println("Age: " + r.getAge());
        System.out.println("Email: " + r.getEmail());
        System.out.println("Username: " + r.getUsername());
        System.out.println("Password: " + r.getPassword());
    }
}
