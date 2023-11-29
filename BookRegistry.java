public class BookRegistry {
    private int bookId;
    private int userId;
    private float checkOutTime;
    private float expectedReturnTime;
    private String status;

    public BookRegistry(int bookId, int userId, float checkOutTime, float expectedReturnTime, String status) {
        this.bookId = bookId;
        this.userId = userId;
        this.checkOutTime = checkOutTime;
        this.expectedReturnTime = expectedReturnTime;
        this.status = status;
    }

    public void display() {
        System.out.println("BookId " + bookId);
        System.out.println("UserId " + userId);
        System.out.println("CheckOutTime " + checkOutTime);
        System.out.println("ExpectedReturnTime " + expectedReturnTime);
        System.out.println("Status " + status);
    }
}
public class Book {
    private int bookId;
    private String title;
    private String author;
    private String publisher;
    private String bookType;
    private String edition;
    private long entryTime;
    private long exitTime;
    private String language;

    public Book (int bookId,String title,String author,String publisher,String bookType,String edition,long entryTime,long exitTime,String language) {
        this.bookId=bookId;
        this.title=title;
        this.author=author;
        this.publisher=publisher;
        this.bookType=bookType;
        this.edition=edition;
        this.entryTime=entryTime;
        this.exitTime=exitTime;
        this.language=language;
    }
}
    public static void main(String[] args) {
        BookRegistry book = new BookRegistry(10, 2, 0, 0, "Blocked");
        book.display();
    }

