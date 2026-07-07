class LibraryBook{
    int bookId;
    String title;
    String author;
    String publisher;
    double price;
    boolean available;
    LibraryBook(){
        this(0,"Unknown","Unknown","Unknown",0,true);
    }
    LibraryBook(int bookId){
        this(bookId,"Unknown","Unknown","Unknown",0,true);
    }
    LibraryBook(int bookId,String title){
        this(bookId,title,"Unknown","Unknown",0,true);
    }
    LibraryBook(int bookId,String title,String author){
        this(bookId,title,author,"Unknown",0,true);
    }
    LibraryBook(int bookId,String title,String author,String publisher){
        this(bookId,title,author,publisher,0,true);
    }
    LibraryBook(int bookId,String title,String author,String publisher,double price){
        this(bookId,title,author,publisher,price,true);
    }
    LibraryBook(int bookId,String title,String author,String publisher,double price,boolean available){
         this.bookId=bookId;
         this.title=title;
         this.author=author;
         this.publisher=publisher;
         this.price=price;
         this.available=available;
    }
    public void borrowBook() {
        if (available) {
            available = false;
            System.out.println(title + " has been borrowed.");
        } else {
            System.out.println(title + " is already borrowed.");
        }
    }
    public void returnBook() {
        if (!available) {
            available = true;
            System.out.println(title + " has been returned.");
        } else {
            System.out.println(title + " is already available.");
        }
    }
    public void display(){
        System.out.println("Book Id: "+bookId);
        System.out.println("Book Title: "+title);
        System.out.println("Book Author: "+author);
        System.out.println("Book Publisher: "+publisher);
        System.out.println("Book Price: "+price);
        System.out.printf("Book Availability: "+available+"%n%n");
    }

}

public class Library {
    public static void main(String[] args) {
        LibraryBook lb1=new LibraryBook();
        LibraryBook lb2=new LibraryBook(2024,"Bed of Throwns","Hello World","Universe",599.00,true);
        LibraryBook lb3=new LibraryBook(2024,"Bed of Throwns","Hello World","Universe",599.00,false);
        lb1.display();
        lb2.display();
        lb2.borrowBook();
        lb3.borrowBook();
    }
}
