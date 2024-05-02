public class Thesis implements Resource{
    private String thesisTitle;

    public Thesis(String thesesTitleParam) {
        this.thesisTitle = thesesTitleParam;
    }

    @Override
    public void borrow() {
        System.out.println(thesisTitle + " has been borrowed by a student.");
    }
}