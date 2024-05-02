public class Journal implements Resource{
    private String journalTitle;

    public Journal(String journalTitle) {
        this.journalTitle = journalTitle;
    }

    @Override
    public void borrow() {
        System.out.println(journalTitle + " has been borrowed by a student.");
    }
}

