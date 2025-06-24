import java.util.Scanner;

class Library {
    String[] books;
    int no_of_books;

    public Library() {
        this.books = new String[100];
        this.no_of_books = 0;
    }

    void addBooks(String book) {
        this.books[no_of_books] = book;
        no_of_books++;
        System.out.println(book + " has been added to the library");
    }

    void showAvailableBooks() {
        System.out.println("Available Books in Library:");
        for (int i = 0; i < this.books.length; i++) {
            if (books[i] != null) {
                System.out.println("-> " + books[i]);
            }
        }
    }

    void issueBook(String book) {
        for (int i = 0; i < this.books.length; i++) {
            if (this.books[i] != null && this.books[i].equals(book)) {
                System.out.println("Book \"" + book + "\" has been issued!");
                this.books[i] = null;
                return;
            }
        }
        System.out.println("Book \"" + book + "\" is not available.");
    }

    void returnBook(String book) {
        addBooks(book);
    }
}

public class OnlineLibrary2 {
    public static void main(String[] args) {
        Library lib = new Library();
        Scanner sc = new Scanner(System.in);
        boolean exit = false;

        while (!exit) {
            System.out.println("\nEnter Your Choice:");
            System.out.println(" 1 -> Add Books \n 2 -> Show Available Books \n 3 -> Issue Books \n 4 -> Return Books \n 5 -> Exit Library");
            int choice = sc.nextInt();
            sc.nextLine(); // consume newline

            switch (choice) {
                case 1:
                    System.out.print("How many books do you want to add? ");
                    int addCount = sc.nextInt();
                    sc.nextLine();
                    for (int i = 0; i < addCount; i++) {
                        System.out.print("Enter book " + (i + 1) + ": ");
                        String book = sc.nextLine();
                        lib.addBooks(book);
                    }
                    break;

                case 2:
                    lib.showAvailableBooks();
                    break;

                case 3:
                    System.out.print("How many books do you want to issue? ");
                    int issueCount = sc.nextInt();
                    sc.nextLine();
                    for (int i = 0; i < issueCount; i++) {
                        System.out.print("Enter name of book to issue " + (i + 1) + ": ");
                        String book = sc.nextLine();
                        lib.issueBook(book);
                    }
                    break;

                case 4:
                    System.out.print("How many books do you want to return? ");
                    int returnCount = sc.nextInt();
                    sc.nextLine();
                    for (int i = 0; i < returnCount; i++) {
                        System.out.print("Enter name of book to return " + (i + 1) + ": ");
                        String book = sc.nextLine();
                        lib.returnBook(book);
                    }
                    break;

                case 5:
                    System.out.println("Thanks for using the library. Goodbye!");
                    exit = true;
                    break;

                default:
                    System.out.println("Invalid choice. Try again.");
            }
        }
    }
}
