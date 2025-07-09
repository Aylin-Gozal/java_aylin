package encapsulation;

public class UserPage {
    private String username;
    private String email;
    private String password;


    public String getUsername() {
        return username;
    }

    public void setUsername(String username) {
        this.username = username;
    }

    public String getEmail(){
        return email;
    }

    public void setEmail(String email) {
        this.email = email;

        if(email.contains("@")){
            this.email = email;
        } else {
            System.out.println("WRONG EMAIL!");
        }
    }

    public String getPassword(){
        return password;
    }

    public void setPassword(String password){
        this.password = password;

        if( password.length() >= 6) {
            this.password = password;
        } else{
            System.out.println("PASSWORD IS TOO SHORT!");
        }
    }


    void showProfile(){
        System.out.println("YOUR PROFILE INFORMATION");
        System.out.println("Your username: " + username);

        if(email.contains("@")) {
            System.out.println("Your email: " + email);
        } else {
            System.out.println("Email is not given");
        }
    }
}
