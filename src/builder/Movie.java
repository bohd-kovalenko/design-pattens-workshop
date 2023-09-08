package builder;

public class Movie {
    private final int id;
    private final String name;

    public Movie(int id, String name) {
        this.id = id;
        this.name = name;
    }

    @Override
    public String toString() {
        return String.format("id=%d and name=%s", id, name);
    }
}
