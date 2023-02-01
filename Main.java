import java.util.ArrayList;
import java.util.Scanner;
import model.Movie;
import model.Seat;
import model.Ticket;
import model.User;

public class Main {
    public static void main(String[] args) {

        Movie m1 = new Movie("sofa","Thriller","Scream","WesCraven","Friday Morning",1000);
        Scanner sc = new Scanner(System.in);
        User user = new User();
        user.addUserInformation();
        System.out.println("--------------------------");

        Movie movie = new Movie();
        System.out.println("--------------------------");

        System.out.println("Enter number of seats: ");
        int n = sc.nextInt();
        sc.nextLine();
        ArrayList<Seat> seatList = new ArrayList<>();
        for (int i = 0; i < n; i++) {
            Seat seat = new Seat();
            seat.addSeatInformation();
            seatList.add(seat);
        }
        System.out.println("Number of Seat : " + n);
        Ticket ticket = new Ticket(seatList, user, movie);
        ticket.getTickets();
    }
}