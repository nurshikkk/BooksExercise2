public class Main {
    public static void main(String[] args) {
        Book[] charles_books = new Book[2];
        Author charles = new Author("Dickens", "Charles", "1812-02-07", "United Kingdom", charles_books);
        charles_books[0] = new Book("A Christmas Carol", charles, 64, 1843);
        charles_books[1] = new Book("Oliver Twist", charles, 373, 1838);

        Book[] george_books = new Book[2];
        Author george = new Author("Orwell", "George", "1903-06-25", "India", george_books);
        george_books[0] = new Book("Animal Farm", george, 135, 1945);
        george_books[1] = new Book("Homage to Catalonia", george, 332, 1938);

        User user1 = new User("Russel", "George", "russel@williams.com", new Book[]{
                charles_books[1],
                george_books[0]
        });
        System.out.println(user1);

        User user2 = new User("Gilbert", "Paul", "gilbert@metal.com", new Book[]{
                charles_books[0],
                charles_books[1],
                george_books[1]
        });
        System.out.println(user2);
    }
}