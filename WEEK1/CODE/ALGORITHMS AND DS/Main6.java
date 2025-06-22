import java.util.Arrays;

class Book {
    int bookId;
    String title;
    String author;

    public Book(int id, String title, String author) {
        this.bookId = id;
        this.title = title;
        this.author = author;
    }

    public String toString() {
        return bookId + " - " + title + " by " + author;
    }
}

public class Main6 {
    public static Book linearSearch(Book[] books, String title) {
        for (Book b : books) {
            if (b.title.equalsIgnoreCase(title))
                return b;
        }
        return null;
    }

    public static Book binarySearch(Book[] books, String title) {
        int left = 0, right = books.length - 1;
        while (left <= right) {
            int mid = (left + right) / 2;
            int cmp = books[mid].title.compareToIgnoreCase(title);
            if (cmp == 0) return books[mid];
            else if (cmp < 0) left = mid + 1;
            else right = mid - 1;
        }
        return null;
    }

    public static void main(String[] args) {
        Book[] books = {
            new Book(101, "Algorithms", "Cormen"),
            new Book(102, "Java Programming", "James Gosling"),
            new Book(103, "Data Structures", "Weiss")
        };

        Arrays.sort(books, (a, b) -> a.title.compareToIgnoreCase(b.title));
        Book found = binarySearch(books, "Java Programming");
        System.out.println(found != null ? "Found: " + found : "Not Found");
    }
}

