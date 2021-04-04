public class Author {
    private final String surname;
    private final String name;
    private final String birthday;
    private final String country;
    private final Book[] books;

    public Author(String surname, String name, String birthday, String country, Book[] books) {
        this.surname = surname;
        this.name = name;
        this.birthday = birthday;
        this.country = country;
        this.books = books;
    }

    public String getSurname() {
        return surname;
    }

    public String getName() {
        return name;
    }

    public String getBirthday() {
        return birthday;
    }

    public String getCounty() {
        return country;
    }

    public Book[] getBooks() {
        return books;
    }

    @Override
    public String toString() {
        return "Author{" +
                "surname='" + surname + '\'' +
                ", name='" + name + '\'' +
                ", birthday='" + birthday + '\'' +
                ", country='" + country + '\'' +
                '}';
    }
}