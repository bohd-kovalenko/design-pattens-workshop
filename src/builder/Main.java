package builder;

public class Main {
    public static void main(String[] args) {
        Builder movieBuilder = new ConcreteBuilder();
        movieBuilder.setMovieName("a");
        movieBuilder.setMovieId(1);
        Movie movie = movieBuilder.getResults();
        System.out.println(movie);
    }
}
