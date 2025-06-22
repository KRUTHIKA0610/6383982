import java.util.*;

class Book implements Comparable<Book> {
    int bookId;
    String title;
    String author;

    Book(int bookId, String title, String author) {
        this.bookId = bookId;
        this.title = title;
        this.author = author;
    }

    public int compareTo(Book other) {
        return this.title.compareToIgnoreCase(other.title);
    }

    public String toString() {
        return bookId + " " + title + " by " + author;
    }
}

public class LibraryManagement {

    static Book linearSearch(Book[] books, String title) {
        for (Book b : books) {
            if (b.title.equalsIgnoreCase(title)) return b;
        }
        return null;
    }

    static Book binarySearch(Book[] books, String title) {
        int left = 0, right = books.length - 1;
        while (left <= right) {
            int mid = (left + right) / 2;
            int cmp = books[mid].title.compareToIgnoreCase(title);
            if (cmp == 0) return books[mid];
            if (cmp < 0) left = mid + 1;
            else right = mid - 1;
        }
        return null;
    }

    static void displayBooks(Book[] books) {
        for (Book b : books) {
            System.out.println(b);
        }
    }

    public static void main(String[] args) {
        Book[] books = {
            new Book(101, "Java Basics", "John Doe"),
            new Book(102, "Python Programming", "Alice Smith"),
            new Book(103, "Data Structures", "David Kim"),
            new Book(104, "Algorithms", "Bob Lee")
        };

        System.out.println("Linear Search Result:");
        Book result1 = linearSearch(books, "Data Structures");
        System.out.println(result1);

        Arrays.sort(books);
        System.out.println("\nBinary Search Result:");
        Book result2 = binarySearch(books, "Data Structures");
        System.out.println(result2);
    }
}

