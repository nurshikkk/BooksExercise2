import java.util.Arrays;

public class User {
    private final String surname;

    private final String name;

    private final String email;

    private final Book[] books;

    public User(String surname, String name, String email, Book[] books) {
        this.surname = surname;
        this.name = name;
        this.email = email;
        this.books = books;
    }

    public String getSurname() {
        return surname;
    }

    public String getName() {
        return name;
    }

    public String getEmail() {
        return email;
    }

    public Book[] getBooks() {
        return books;
    }

    @Override
    public String toString() {
        return "User{" +
                "surname='" + surname + '\'' +
                ", name='" + name + '\'' +
                ", email='" + email + '\'' +
                ", books=" + Arrays.toString(books) +
                '}';
    }
}