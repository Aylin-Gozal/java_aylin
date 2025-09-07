package OuterAndInner;

public class LibraryHW {
    public static void main(String[] args) {
        Library library = new Library();
        library.show();
    }
}


class Library{
    String name = "Book Library";



    class Book{
        void display(){
            String title = "The Little Prince";
            System.out.println("Welcome to the " + name);
            System.out.println("Our widely read book is " + title);
        }
    }

    void show() {
        Book book = new Book();
        book.display();
    }
}