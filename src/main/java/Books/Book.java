package Books;

public class Book {

    private String name;
    private Author author;

    @Override
    public String toString() {
        return "Book{" +
                "name='" + name + '\'' +
                ", author=" + author +
                '}';
    }

}
