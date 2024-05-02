public class EBook implements Resource{
    private String bookTitle;

    public EBook(String bookTitleKo) {
        this.bookTitle = bookTitleKo;
    }

    @Override
    public void borrow() {
        System.out.println(bookTitle + " has been borrowed by a student.");
    }
}