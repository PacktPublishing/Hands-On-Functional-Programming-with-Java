import java.util.ArrayList;
import java.util.LinkedList;
import java.util.List;

public class Library {
    public static void main(String[] args){
        LinkedList<LibraryReader> readers = new LinkedList<>();
        readers.add(new LibraryReader("James", new String[]{"Dune", "The Stranger", "Peter Pan"}));
        readers.add(new LibraryReader("Alex", new String[]{"The art of war","Crime and punishment"}));
        readers.add(new LibraryReader("Jessica", new String[]{"Ulysses","Dune","The Stranger","Moby Dick"}));
        readers.add(new LibraryReader("Janet", new String[]{"Dune","Hamlet","War and Peace","The catcher in the rye","The prince","The Stranger"}));
        readers.add(new LibraryReader("Michael", new String[]{"Moby Dick","Lolita","Catch-22"}));
        readers.stream()
                .flatMap(reader->reader.getBooks().stream())
                .distinct()
                .forEach(book->System.out.println(book));


    }
}
class LibraryReader{
    String name;
    List<String> books;
    LibraryReader(String name, String[] books){
        this.name = name;
        this.books = new ArrayList<>();
        for (var book:books){
            this.books.add(book);
        }
    }

    public String getName() {
        return name;
    }

    public List<String> getBooks() {
        return books;
    }
}
