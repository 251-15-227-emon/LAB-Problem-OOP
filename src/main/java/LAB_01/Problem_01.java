package LAB_01;

class Book {

    String title;
    String author;
    double price;

    Book() {
        title = "Unknown";
        author = "Unknown";
        price = 0.0;
    }

    Book(String title, String author) {
        this.title = title;
        this.author = author;
        this.price = 0.0;
    }

    Book(String title, String author, double price) {
        this.title = title;
        this.author = author;
        this.price = price;
    }

    void display() {
        System.out.println("Title: " + title);
        System.out.println("Author: " + author);
        System.out.println("Price: " + price);
        System.out.println();
    }
}

public class Problem_01 {

    public static void main(String[] args) {

        Book b1 = new Book();
        Book b2 = new Book("Himu", "Humayun Ahmed");
        Book b3 = new Book("Lilabotir Mrittu", "Humayun Ahmed", 450.50);

        b1.display();
        b2.display();
        b3.display();
    }

}
