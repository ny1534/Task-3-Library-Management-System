import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Library library = new Library();
        Scanner sc = new Scanner(System.in);
        
        
        library.addBook(new Book(101, "Java Programming", "James Gosling"));
        library.addBook(new Book(102, "Clean Code", "Robert Martin"));
        library.addUser(new User(1, "Nakul Yadav"));

        while (true) {
            System.out.println("\n--- Library Management System (OOP) ---");
            System.out.println("1. Add Book");
            System.out.println("2. View All Books");
            System.out.println("3. Add User");
            System.out.println("4. View All Users");
            System.out.println("5. Issue Book");
            System.out.println("6. Return Book");
            System.out.println("7. Exit");
            System.out.print("Enter choice: ");

            int choice = sc.nextInt();

            switch (choice) {
                case 1:
                    System.out.print("Enter Book ID: ");
                    int bid = sc.nextInt();
                    sc.nextLine();
                    System.out.print("Enter Title: ");
                    String title = sc.nextLine();
                    System.out.print("Enter Author: ");
                    String author = sc.nextLine();
                    library.addBook(new Book(bid, title, author));
                    break;
                case 2:
                    library.viewBooks();
                    break;
                case 3:
                    System.out.print("Enter User ID: ");
                    int uid = sc.nextInt();
                    sc.nextLine();
                    System.out.print("Enter User Name: ");
                    String name = sc.nextLine();
                    library.addUser(new User(uid, name));
                    break;
                case 4:
                    library.viewUsers();
                    break;
                case 5:
                    System.out.print("Enter Book ID to Issue: ");
                    int ibid = sc.nextInt();
                    System.out.print("Enter User ID: ");
                    int iuid = sc.nextInt();
                    library.issueBook(ibid, iuid);
                    break;
                case 6:
                    System.out.print("Enter Book ID to Return: ");
                    int rbid = sc.nextInt();
                    library.returnBook(rbid);
                    break;
                case 7:
                    System.out.println("Exiting... Thank you!");
                    sc.close();
                    return;
                default:
                    System.out.println("Invalid choice!");
            }
        }
    }
}