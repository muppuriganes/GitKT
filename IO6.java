import java.io.*;

public class IO6 {
    public static void main(String[] args) {
        try {
            FileInputStream fin = new FileInputStream("C://Users//Harshavi//OneDrive//Desktop//lol.txt");
            
            int data;
            while ((data = fin.read()) != -1) {
                System.out.print((char) data);
            }
            
            fin.close();
        } catch (IOException e) {
            System.out.println(e);
        }
    }
}
