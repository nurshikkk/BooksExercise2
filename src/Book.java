public class Book {
    private final String name;

    private final Author author;

    private final int pages;

    private final int year;

    public Book(String name, Author author, int pages, int year) {
        this.name = name;
        this.author = author;
        this.pages = pages;
        this.year = year;
    }

    public String getName() {
        return name;
    }

    public Author getAuthor() {
        return author;
    }

    public int getPages() {
        return pages;
    }

    public int getYear() {
        return year;
    }

    @Override
    public String toString() {
        return "Book{" +
                "name='" + name + '\'' +
                ", author=" + author +
                ", pages=" + pages +
                ", year=" + year +
                '}';
    }
}