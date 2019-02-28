import java.util.HashSet;
import java.util.List;
import java.util.stream.Collectors;

public class MovieStream {
    public static void main(String[] args){
        HashSet<Movie> movies = new HashSet<>();
        movies.add(new Movie("Titanic",11));
        movies.add(new Movie("The Matrix", 4));
        movies.add(new Movie("Shawshank Redemption",0));
        movies.add(new Movie("The Godfather",3));
        movies.add(new Movie("Fight Club",0));
        List<Movie> movieList = movies.stream()
                .filter(m->m.getOscars()>0)
                .collect(Collectors.toList());
        movieList.forEach(m->System.out.println("Movie with oscar: "+ m.getName()));
        long sum = movies.stream()
                .mapToInt(m->m.getOscars())
                .sum();
        System.out.println("Sum of all oscars is: " + sum);
        Movie m = movies.stream()
                .max((m1,m2)->{
                    return m1.getOscars() - m2.getOscars();
                }).get();
        System.out.println(m.getName()+m.getOscars());

    }
}
class Movie {
    String name;
    int oscars;

    public Movie(String name, int oscars) {
        this.name = name;
        this.oscars = oscars;
    }

    public String getName() {
        return name;
    }

    public int getOscars() {
        return oscars;
    }
}
