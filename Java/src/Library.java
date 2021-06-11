import java.util.*;
class Book{
    String name;
    int id;
    public Book(String name, int id) {
        this.name = name;
        this.id = id;
    }
    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        Book book = (Book) o;
        return id == book.id && name.equals(book.name);
    }
    @Override
    public int hashCode() {
        return Objects.hash(name, id);
    }

    @Override
    public String toString() {
        return "name = " + name + ", id = " + id;
    }
}
public class Library {
    ArrayList<Book> available_books = new ArrayList<Book>(1);
    ArrayList<Book> issued_books = new ArrayList<Book>(1);

    public void addBook(String name_temp,int id_temp){
        available_books.ensureCapacity(available_books.size()*2);
        available_books.add(new Book(name_temp,id_temp));
        System.out.println("Book has been added successfully");
    }

    public void issueBook(String name_temp,int id_temp){
        Book tempBook = new Book(name_temp,id_temp);
        if(!(available_books.contains(tempBook))){
            System.out.println("Book not found.");
            return;
        }
        available_books.remove(tempBook);
        issued_books.ensureCapacity(issued_books.size()*2);
        issued_books.add(tempBook);
        System.out.println("Book has been issued successfully");
        return;
    }

    public void returnBook(String name_temp,int id_temp){
        Book tempBook = new Book(name_temp,id_temp);
        if(!(issued_books.contains(tempBook))){
            System.out.println("Book not found.");
            return;
        }
        issued_books.remove(tempBook);
        available_books.ensureCapacity(available_books.size()*2);
        available_books.add(tempBook);
        System.out.println("Book has been returned successfully");
        return;
    }
    public void showAvailableBooks(){
        available_books.forEach(tempBook-> System.out.println(tempBook));
    }
}
class Application{
    public static void main(String[] args) {
        Library lib1 = new Library();
        lib1.addBook("Harry Potter 1",1);
        lib1.addBook("Harry Potter 2",2);
        lib1.addBook("Harry Potter 3",5);
        lib1.issueBook("Harry Potter 2",2);
        lib1.issueBook("Harry Potter 5",2);
        lib1.returnBook("Harry Potter 2",2);
        lib1.returnBook("Harry Potter 2",4);
        lib1.showAvailableBooks();
    }
}
