public class Book implements Resource{
    private String bookTitle;

    public Book(String bookTitleKo) {
        this.bookTitle = bookTitleKo;
    }

    @Override
    public void borrow() {
        System.out.println(bookTitle + " has been borrowed by a student.");
    }
}