package JavaNotes.Oops;

class Library{
    String[] books;
    int no_of_books;
    Library(){
        this.books = new String[100];
        this.no_of_books = 0;
    }

    void addBook(String book){
        this.books[no_of_books] = book;
        no_of_books++;
        System.out.println(book+" has been added!");
    }

    void showAvailableBooks(){
        System.out.println("Available Books are:");
        for (String book : books){
            if (book==null)
                continue;
            System.out.println("* "+book);
        }
    }

    void issueBook(String book){
        for (int i=0 ; i<this.books.length ; i++){
            if (this.books[i].equals(book)){
                System.out.println(books[i]+" book has been issued!");
                this.books[i] = null;
                return;
            }
        }
        System.out.println("This book does not exist");
    }

    void returnBook(String book){
        addBook(book);
    }
}
public class OnlineLibrary{
    public static void main(String[] args) {
        /*
        You have to implement a library using java class library
        Method: addBook, issueBook, returnBook, showAvailableBooks
        Properties: Array to store the available books,
        Array to store the issued books
        */

        Library centraLibrary  = new Library();
        centraLibrary.addBook("HC Verma");
        centraLibrary.addBook("Java");
        centraLibrary.addBook("Algorithms");
        centraLibrary.showAvailableBooks();
        centraLibrary.issueBook("Java");
        centraLibrary.showAvailableBooks();
        centraLibrary.returnBook("Java");
        centraLibrary.showAvailableBooks();

    }
}
