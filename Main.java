public class Main {
    public static void main(String[] args) throws Exception {
       
        Journal journal = new Journal("International Journal of Computational Intelligence and Applications");
        Student student = new Student();

          
        student.borrowResource(journal);
    }
}