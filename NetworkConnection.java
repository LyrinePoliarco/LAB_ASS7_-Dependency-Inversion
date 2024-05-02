public class NetworkConnection implements Resource {
    private String internetAccess;

    public NetworkConnection(String internetAccess) {
        this.internetAccess = internetAccess;
    }

    @Override
    public void borrow() {
        System.out.println(internetAccess + " url has been accessed by a student.");
    }
}