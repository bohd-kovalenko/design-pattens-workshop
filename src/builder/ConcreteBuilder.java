package builder;

public class ConcreteBuilder implements Builder{
    private int id;
    private String name;
    @Override
    public Builder setMovieId(int id) {
        this.id = id;
        return this;
    }

    @Override
    public Builder setMovieName(String name) {
        this.name = name;
        return this;
    }
    @Override
    public Movie getResults(){
        return new Movie(id, name);
    }
}
