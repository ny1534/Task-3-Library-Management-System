import java.util.ArrayList;

public class Library {
    private ArrayList<Book> books = new ArrayList<>();
    private ArrayList<User> users = new ArrayList<>();

    
    public void addBook(Book book) {
        books.add(book);
        System.out.println("Book added successfully!");
    }

    
    public void addUser(User user) {
        users.add(user);
        System.out.println("User added successfully!");
    }

    
    public void viewBooks() {
        if (books.isEmpty()) {
            System.out.println("No books in library.");
            return;
        }
        System.out.println("\n--- All Books ---");
        for (Book b : books) {
            b.displayBook();
        }
    }

   
    public void viewUsers() {
        if (users.isEmpty()) {
            System.out.println("No users registered.");
            return;
        }
        System.out.println("\n--- All Users ---");
        for (User u : users) {
            u.displayUser();
        }
    }

    
    public void issueBook(int bookId, int userId) {
        Book book = findBookById(bookId);
        User user = findUserById(userId);

        if (book == null) {
            System.out.println("Book not found!");
            return;
        }
        if (user == null) {
            System.out.println("User not found!");
            return;
        }
        if (book.isIssued()) {
            System.out.println("Book is already issued!");
            return;
        }

        book.issueBook();
        System.out.println("Book '" + book.getTitle() + "' issued to " + user.getName());
    }

    
    public void returnBook(int bookId) {
        Book book = findBookById(bookId);
        if (book == null) {
            System.out.println("Book not found!");
            return;
        }
        if (!book.isIssued()) {
            System.out.println("Book was not issued!");
            return;
        }
        book.returnBook();
        System.out.println("Book '" + book.getTitle() + "' returned successfully!");
    }

    private Book findBookById(int id) {
        for (Book b : books) {
            if (b.getBookId() == id) return b;
        }
        return null;
    }

    private User findUserById(int id) {
        for (User u : users) {
            if (u.getUserId() == id) return u;
        }
        return null;
    }
}