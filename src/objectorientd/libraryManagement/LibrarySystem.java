package objectorientd.libraryManagement;
import java.util.Scanner;
public class LibrarySystem {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        Book[] books = new Book[5];
        int count = 0;

        while (count < 5) {
            System.out.print("Enter Book Title: ");
            String title = sc.nextLine();
            System.out.print("Enter Author: ");
            String author = sc.nextLine();
            books[count++] = new Book(title, author);
        }

        while (true) {
            System.out.print("1.Issue 2.Return 3.Show Available 4.Exit: ");
            int option = sc.nextInt();
            sc.nextLine();

            if (option == 4) break;

            if (option == 1) {
                System.out.print("Enter title to issue: ");
                String title = sc.nextLine();
                boolean found = false;
                for (Book book : books) {
                    if (book != null && book.getTitle().equalsIgnoreCase(title) && !book.isIssued()) {
                        book.issue();
                        System.out.println("Issued successfully.");
                        found = true;
                        break;
                    }
                }
                if (!found) System.out.println("Book not available.");
            }

            if (option == 2) {
                System.out.print("Enter title to return: ");
                String title = sc.nextLine();
                for (Book book : books) {
                    if (book != null && book.getTitle().equalsIgnoreCase(title) && book.isIssued()) {
                        book.returnBook();
                        System.out.println("Returned.");
                        break;
                    }
                }
            }

            if (option == 3) {
                System.out.println("Available Books:");
                for (Book book : books) {
                    if (book != null) book.showDetails();
                }
            }
        }

        sc.close();
    }
}
