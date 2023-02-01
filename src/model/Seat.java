package model;
import java.util.Scanner;
public class Seat {
    private String seatNumber;
    private String mainCategory;

    public Seat(String seatNumber, String mainCategory) {
        this.seatNumber = seatNumber;
        this.mainCategory = mainCategory;
    }

    public Seat() {

    }

    public String getSeatNumber() {
        return seatNumber;
    }

    public void setSeatNumber(String seatNumber) {
        this.seatNumber = seatNumber;
    }

    public String getMainCategory() {
        return mainCategory;
    }

    public void setMainCategory(String mainCategory) {
        this.mainCategory = mainCategory;
    }

    public void addSeatInformation() {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter seat number: ");
        seatNumber = sc.nextLine();
        System.out.println("Sofa or Seat: ");
        mainCategory = sc.nextLine();
    }

    public void displaySeatInformation() {
        System.out.println("Seat Number: " + seatNumber);
        System.out.println("Main Category: " + mainCategory);
    }
}