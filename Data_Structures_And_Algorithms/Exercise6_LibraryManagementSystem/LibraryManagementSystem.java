public class LibraryManagementSystem {

    public static void main(String[] args) {

        Book[] books = {

                new Book(101, "Java Programming", "James Gosling"),
                new Book(102, "Data Structures", "Mark Allen"),
                new Book(103, "Algorithms", "Robert Sedgewick"),
                new Book(104, "Operating Systems", "Abraham Silberschatz"),
                new Book(105, "Database Systems", "Raghu Ramakrishnan")

        };

        LibraryManager manager = new LibraryManager();

        System.out.println("========== Available Books ==========");
        manager.displayBooks(books);

        System.out.println("\n========== Linear Search ==========");

        Book result = manager.linearSearch(books, "Algorithms");

        if (result != null)
            System.out.println("Book Found:");
        else
            System.out.println("Book Not Found.");

        if (result != null)
            System.out.println(result);

        manager.sortBooks(books);

        System.out.println("\n========== Books After Sorting ==========");
        manager.displayBooks(books);

        System.out.println("\n========== Binary Search ==========");

        result = manager.binarySearch(books, "Algorithms");

        if (result != null)
            System.out.println("Book Found:");
        else
            System.out.println("Book Not Found.");

        if (result != null)
            System.out.println(result);
    }
}
