package inheritance;
class LibraryItem{
    private final String title;
    private final int itemId;
    private boolean isIssued=false;
    LibraryItem(String title,int itemId) {
        this.title = title;
        this.itemId = itemId;
    }
    public void issueItem(){
        if (!isIssued) {
            isIssued=true;
            System.out.println("Item issued successfully.");
        } else {
            System.out.println("Item is already issued.");
        }
    }
    public void returnItem(){
        if(isIssued){
            isIssued=false;
            System.out.println("Item returned successfully.");
        }
        else{
            System.out.println("Item is already available.");
        }
    }
    public void displayDetails(){
        System.out.println("Title       : " + title);
        System.out.println("Item ID     : " + itemId);
        System.out.println("Issued      : " + isIssued);
    }
}
class Book extends LibraryItem{
    private final String author;
    Book(String title, int itemId,String author){
        super(title, itemId);
        this.author=author;
    }
    public void readBook(){
        System.out.println("Reading book...");
    }
}
class Magazine extends LibraryItem{
    private int issueNumber;
    Magazine(String title, int itemId, int issueNumber){
        super(title, itemId);
        this.issueNumber = issueNumber;
    }
    public void readMagazine(){
        System.out.println("Reading magazine...");
    }
}
class Newspaper extends LibraryItem{
    private String  publicationDate;
    Newspaper(String title, int itemId, String publicationDate){
        super(title, itemId);
        this.publicationDate = publicationDate;
    }
    public void readNews(){
        System.out.println("Reading newspaper...");
    }
}
public class LibraryManagementSystem {
    public static void main(String[] args) {
        Book b1 = new Book("Clean Code", 1234, "Robert C. Martin");
        Magazine m1 = new Magazine("National Geographic", 2024, 5);
        Newspaper np1 = new Newspaper("The Times", 3044, "12/09/2024");
        b1.displayDetails();

        b1.issueItem();

        b1.displayDetails();

        b1.readBook();

        b1.returnItem();

        b1.displayDetails();


        m1.displayDetails();

        m1.issueItem();

        m1.readMagazine();


        np1.displayDetails();
        
        np1.readNews();
    }
}
