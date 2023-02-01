package model;
import java.util.ArrayList;
public class Ticket {
    private ArrayList<Seat> seatList;
    private User user;
    private Movie movie;

    public Ticket(ArrayList<Seat> seatList, User user, Movie movie) {
        this.seatList = seatList;
        this.user = user;
        this.movie = movie;
    }

    public ArrayList<Seat> getSeatList() {
        return seatList;
    }

    public void setSeatList(ArrayList<Seat> seatList) {
        this.seatList = seatList;
    }

    public User getUser() {
        return user;
    }

    public void setUser(User user) {
        this.user = user;
    }

    public Movie getMovie() {
        return movie;
    }

    public void setMovie(Movie movie) {
        this.movie = movie;
    }

    public void getTickets() {System.out.println("User Information: ");
        user.displayUserInformation();
        System.out.println("Movie Information: ");
        movie.displayMovieInformation();
        System.out.println("Seat Information: ");
        for (Seat seat : seatList) {
            seat.displaySeatInformation();
        }
    }
}