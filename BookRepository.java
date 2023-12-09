package Library_app;
import java.util.ArrayList;

public class BookRepository {
    private ArrayList<Book> books = new ArrayList<>();

    public BookRepository() {
       books.add(new Book("83471", "The Dead of Night", "Horror", null, "S.K. Eleton", 10, 4));
       books.add(new Book("39612", "Killing Your Boss", "Horror", null, "S.K. Eleton", 12, 3));
       books.add(new Book("83112", "Castles and Crenallations", "Horror", null, "S.K. Eleton", 14, 6));
       books.add(new Book("83113", "A Castle in the sky", "Horror", null, "S.K. Eleton", 12, 3));
       books.add(new Book("83421", "Dating in 2023", "Horror", null, "S.K. Eleton", 10, 3));
       books.add(new Book("83109", "Interview Skills for Felons", "Horror", null, "S.K. Eleton", 5, 2));
       books.add(new Book("83498", "Controlling a Murderous Temper", "Horror", null, "S.K. Eleton", 25, 21));
       books.add(new Book("83158", "Fine points of Murder Concealment", "Horror", null, "S.K. Eleton", 56, 43));
       books.add(new Book("81902", "How to not get Caught Killing People", "Horror", null, "S.K. Eleton", 980, 979));
    }

    public Book findByIsbn(String isbn) {
        for (Book book : books) {
            if (book.getIsbn().equals(isbn)) {
                return book;
            }
        }
        return null;
    }

    public ArrayList<Book> findByTitle(String keyword) {
        ArrayList<Book> booksFound = new ArrayList<>();
        
        for (Book book : books) {
            if (book.getTitle().toLowerCase().contains(keyword.toLowerCase())) {
                booksFound.add(book);
            }
        }
        System.out.printf("%s books found%s\n", booksFound.size(), booksFound.size() > 0 ? ":" : ".");
        return booksFound;
    }
}