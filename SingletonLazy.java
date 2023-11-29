class Library {
    private static Library instance;
    private int Book_Id;
    private String Title;
    private String Author;

    private Library() {
        this.Book_Id = 0;
        this.Title = "Default";
        this.Author = "Default";
    }
    public static Library getInstance() {
        if (instance == null) {
            instance = new Library();
        } return instance; }
    public void setValues(int id, String Title, String Author) {
        this.Book_Id = id;
        this.Title = Title;
        this.Author = Author; }
    public void displayValues() {
        System.out.println("Library Details = BookID:" + Book_Id + "  Title:" + Title + "  Author:" + Author);
    } }
public class SingletonLazy {
    public static void main(String[] args) {
        Library librarySingleton = Library.getInstance();
        librarySingleton.setValues(100, "DemonSlayer","Koyoharu Gotouge");
        librarySingleton.displayValues();
    }
}

