package model;
import java.util.Scanner;
public class User {
    private String name;
    private String email;
    private String phone;

    public User(String name, String email, String phone) {
        this.name = name;
        this.email = email;
        this.phone = phone;
    }

    public User() {

    }

    public String getName() {
        return name;
    }
    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    public String getPhone() {
        return phone;
    }

    public void setPhone(String phone) {
        this.phone = phone;
    }

    public void addUserInformation() {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter user name: ");
        name = sc.nextLine();
        System.out.println("Enter email: ");
        email = sc.nextLine();
        System.out.println("Enter phone: ");
        phone = sc.nextLine();
    }

    public void displayUserInformation() {
        System.out.println("User Name: " + name);
        System.out.println("Email: " + email);
        System.out.println("Phone: " + phone);
        System.out.println("");
    }
}