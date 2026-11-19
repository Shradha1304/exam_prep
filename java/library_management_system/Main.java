package library_management_system;

public class Main {

    public static void main(String[] args) {

        // 1. Create Library
        Library library = new Library();

        // 2. Create Members
        Member m1 = new Member("M101", "Alice", 3);
        Member m2 = new Member("M102", "Bob", 2);
        Member m3 = new Member("M103", "Charlie", 4);

        // 3. Add members to Library
        library.addMember(m1);
        library.addMember(m2);
        library.addMember(m3);

        // 4. Create Books
        Book b1 = new Book("ISBN101", "Python Programming",
                           "John Smith", 2020);

        Book b2 = new Book("ISBN102", "Java Basics",
                           "David Brown", 2022);

        Book b3 = new Book("ISBN103", "Machine Learning",
                           "Sarah Lee", 2024);

        // 5. Borrow books
        System.out.println("Borrowing books:");

        System.out.println(library.borrowBook(m1, b1));
        System.out.println(library.borrowBook(m2, b2));
        System.out.println(library.borrowBook(m3, b3));

        // 6. Try borrowing an already borrowed book
        System.out.println("Trying to borrow an unavailable book:");
        System.out.println(library.borrowBook(m2, b1));

        // 7. Print all members
        System.out.println("\nLibrary members:");
        library.printAllMembers();

        // 8. Return a book
        System.out.println("\nReturning a book:");
        System.out.println(library.returnBook(m1, b1));

        // 9. Find a member
        System.out.println("\nFinding member:");
        Member found = library.findMember("M102");

        if (found != null) {
            System.out.println(found);
        } else {
            System.out.println("Member not found");
        }

        // 10. Print updated library
        System.out.println("\nUpdated library:");
        library.printAllMembers();
    }
}