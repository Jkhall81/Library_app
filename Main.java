package Library_app;

public class Main {

    public static void main(String[] args) {
        LibraryApp app = new LibraryApp();
        app.searchByIsbn("83471");
        app.searchByTitle("castle");
        app.searchByTitle("night");
        app.searchByTitle("loneliness");
    }
}