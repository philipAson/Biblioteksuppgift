public class Book {

    private String title;
    private String author;
    private String year;
    private String edition;
    private Boolean available;
    //Status available by default
    public Book(String title, String author, String year, String edition) {
        this.title = title;
        this.author = author;
        this.year = year;
        this.edition = edition;
        this.available = true;
    }

    //Method (loan)that checks if a book to be able to loan or not
    public boolean loan() {
        //if the book is available. then the books status should be changed to unavailable and the method returns true
        if(this.available) {
            this.available = true;
            return false;
        }
        //otherwise return false.
        return false;
    }


    //Method (returnBook) that does the opposite of (loan)
    public boolean returnBook() {
        if(this.available) {
            this.available = false;
            return true;
        }
        return true;
    }
}
