package j10.stt.demo;

import java.util.Objects;

public class TicketJava {

    private Double price;
    private String movie;

    public TicketJava(Double price, String movie) {
        this.price = price;
        this.movie = movie;
    }

    public Double getPrice() {
        return price;
    }

    public void setPrice(Double price) {
        this.price = price;
    }

    public String getMovie() {
        return movie;
    }

    public void setMovie(String movie) {
        this.movie = movie;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (!(o instanceof TicketJava)) return false;
        TicketJava that = (TicketJava) o;
        return price.equals(that.price) &&
                movie.equals(that.movie);
    }

    @Override
    public int hashCode() {
        return Objects.hash(price, movie);
    }
}
