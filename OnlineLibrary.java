import java.util.Scanner;
public class OnlineLibrary {
    static String [] availableBooks = {"A","B","C","D","E"};

    static void addBooks(){
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the name of the book to add:");
        String book = sc.nextLine();

        String[] newBooks = new String[availableBooks.length + 1];
        for (int i = 0; i < availableBooks.length; i++) {
            newBooks[i] = availableBooks[i];
        }
        newBooks[availableBooks.length] = book;
        availableBooks = newBooks;
        System.out.println("Book \"" + book + "\" added successfully.");
    }

    static void issueBooks(){
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the name of the book to issue:");
        String book = sc.nextLine();
        boolean found = true;

    for (int i = 0; i < availableBooks.length; i++) {
        if (availableBooks[i].equalsIgnoreCase(book)) {
            found = false;
            for (int j = i; j < availableBooks.length - 1; j++) {
                availableBooks[j] = availableBooks[j + 1];

            }
            String[] newBooks = new String[availableBooks.length - 1];
            for (int k = 0; k < newBooks.length; k++) {
                newBooks[k] = availableBooks[k];
            }
            availableBooks = newBooks;
            System.out.println("Book \"" + book + "\" issued successfully.");
            break;
        }
    }
    if (found) {
        System.out.println("Book \"" + book + "\" is not available.");
    }
    }
    static void returnBooks(){
        Scanner sc = new Scanner(System.in);
    System.out.println("Enter the name of the book to return:");
    String book = sc.nextLine();

    // Add the returned book just like addBooks()
    String[] newBooks = new String[availableBooks.length + 1];
    for (int i = 0; i < availableBooks.length; i++) {
        newBooks[i] = availableBooks[i];
    }
    newBooks[availableBooks.length] = book;
    availableBooks = newBooks;
    
    System.out.println("Book \"" + book + "\" returned successfully.");
    }
    static void showAvailableBooks(){
        System.out.println("Here Is The List Of Available Books");
        for(int i = 0 ;i<availableBooks.length ; i++){
            System.out.print(availableBooks[i] + " ");
        }
        System.out.println();
    }

    public static void main(String[] args) {
        boolean exit = false;
        while(!exit){
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter Your Choice :");
        System.out.println(" 1 -> Adding Books \n 2 -> Available Books \n 3 -> Issue Books \n 4 -> Return Books \n 5 -> Exit Library");
        int choice = sc.nextInt();

        switch(choice){
            case 1:
                addBooks();
                break;
            case 2:
                showAvailableBooks();
                break;
            case 3:
                issueBooks();
                break;
            case 4:
                returnBooks();
                break;
            case 5:
                System.out.println("Thanks for using Library");
                exit = true;
        }
        }
    }
}
