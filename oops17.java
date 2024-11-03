import java.util.ArrayList;

class Movie {
    private String title;
    private String director;
    private ArrayList<String> actors = new ArrayList<>();
    private ArrayList<String> reviews = new ArrayList<>();

    public Movie(String title, String director) {
        this.title = title;
        this.director = director;
    }

    public void addActor(String actor) {
        actors.add(actor);
    }

    public void addReview(String review) {
        reviews.add(review);
    }

    public void displayInfo() {
        System.out.println("Title: " + title + ", Director: " + director);
        System.out.println("Actors: " + actors);
        System.out.println("Reviews: " + reviews);
    }
}

public class MovieExample {
    public static void main(String[] args) {
        Movie movie = new Movie("Inception", "Christopher Nolan");
        movie.addActor("Leonardo DiCaprio");
        movie.addReview("Amazing movie!");
        
        movie.displayInfo();
    }
}

/*
Output:
Title: Inception, Director: Christopher Nolan
Actors: [Leonardo DiCaprio]
Reviews: [Amazing movie!]
*/
