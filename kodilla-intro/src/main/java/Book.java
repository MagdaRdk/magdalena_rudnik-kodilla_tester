public class Book {
    private String author;
    private String title;


    private static Book of(String author, String title) {
        Book book = new Book();
        book.author = author;
        book.title = title;
        return book;
    }

    public String getTitle() {
        return title;
    }

    public static void main(String[] args) {
        Book book = Book.of("Stanisław Reymont", "Chłopi");
        Book book2 = Book.of("Henryk Sienkiewicz", "Krzyżacy");
        System.out.println(book);
        System.out.println(book2.getTitle());
    }
}

