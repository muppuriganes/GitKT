import java.io.*;
public class IO2 {
    public static void main(String[]args) {
        try {
            FileOutputStream fout = new FileOutputStream("C://Users//Harshavi//OneDrive//Desktop//lol.txt");
            String s = "Hii, Hello";
            byte b[] = s.getBytes();
            fout.write(b);
            fout.close();
            System.out.println("Success...");
        } catch (Exception e) {System.out.println(e);
            // TODO: handle exception
        }
    }
}