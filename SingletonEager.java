class Library {
    private static final Library instance = new Library();
    private int Book_Id;
    private String Title;
    private String Author;

    private Library() {
        this.Book_Id = 0;
        this.Title = "Default Subject";
        this.Author = "Default Author";
    }
    public static Library getInstance() {
        return instance;
    }
    public void setValues(int id, String title, String author) {
        this.Book_Id = id;
        this.Title = title;
        this.Author = author;
    }
    public void displayValues() {
        System.out.println("Library Details = Id:" + Book_Id + "  Title:" + Title + "  Author:" + Author);
    } }
public class SingletonEager {
    public static void main(String[] args) {
        Library librarySingleton = Library.getInstance();
        librarySingleton.setValues(100, "AOT", "Isayama");
        librarySingleton.displayValues();
    }
}
