import java.util.ArrayList;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {

        Book b1 = new Book("java for dummies", "författare", "1991", "1");
        Book b2 = new Book("mein kampf", "adolf", "2017", "1.5");
        Book b3 = new Book("your dad is a cuck!!!", "your mom", "1947", "243");
        ArrayList<Book> bookList = new ArrayList<>();
        bookList.add(b1);
        bookList.add(b2);
        bookList.add(b3);
        menu();



    }
    // gör en meny funktion
    public static void menu() {
        Scanner sc = new Scanner(System.in);
        System.out.println("""
                *** Välkommen till biblioteket vad vill du göra?***
                
                (1) lägga till en bok i biblioteket.
                (2) söka efter en titel.
                (3) lista alla tillgängliga böcker.
                (4) lämna tillbaka en bok.
                (5) avsluta.
                :""");
        sc.nextLine();

        String val = sc.nextLine();
        if (val.equals("1"))
            addBook();
        else if (val.equals("2"))
            searchTitel();
        else if (val.equals("3"))
            libraryList();
        else if (val.equals("4"))
            returnBook();
        else if (val.equals("5"))
            System.out.println("Hajsibajsi!");
        else
            menu();
    }
    // (1) gör en add book metod
    public static void addBook() {
        Scanner sc = new Scanner(System.in);
        System.out.println("skriv in titel: ");
        String title = sc.nextLine();
        System.out.println("skriv in författare: ");
        String author = sc.nextLine();
        System.out.println("skriv in år: ");
        String year = sc.nextLine();
        System.out.println("skriv in utgåva: ");
        String edition = sc.nextLine();

        booklist.add(new Book(title, author, year, edition));
    }
    // (2) metod som låter dig söka böcker på titlar.
    public static void searchTitel() {
        Scanner sc = new Scanner(System.in);
        System.out.println("skriv in titel på boken du söker");
    }
        // låt användaren välja om den vill låna boken eller inte beroende på vad den matar in.

    // (3) metod som visar alla böcker i biblioteket som är tillgänglig får utlåning
    public static void libraryList() {
        System.out.println("här är en lista på alla böcker tillgängliga för utlåning");
    }
    // (4) metod för att returnera en utlånad bok
    public static void returnBook() {
        Scanner sc = new Scanner(System.in);
        System.out.println("skriv in titel på boken du vill lämna tillbaka");
    }




































/*        Book b1 = new Book("java for dummies", "författare", 1991, "1");

        bookList.add(b1);
// start loop
        System.out.println(bookList.size());

        System.out.println("Vad är titeln?");
        //läs in titeln med en scanner
        String title = "java for experts"
        System.out.println("författare?");
        //läs in författare med en scanner
        String authour = "Susan";

        Book newBook = Book(title);
        bookList.add(newBook);
        // if 2
        // fråga efter titeln vi ska leta efter
        // läs in titeln vi ska leta efter
        String titleToSearchFor = "java for experts";
        for( Book book : bookList) {
            // if (book.fetTitle() == titleToSearchFor) {
                // vi har hittat boken!
                //}

        }
*/// end loop

}