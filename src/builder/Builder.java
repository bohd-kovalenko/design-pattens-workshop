package builder;

public interface Builder {
    Builder setMovieId(int id);
    Builder setMovieName(String name);
    Movie getResults();
}
