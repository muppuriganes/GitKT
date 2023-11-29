import java.io.*;
public class IO4 {
    public static void main(String[]args) {
        try {
            FileOutputStream fout = new FileOutputStream("C://Users//Harshavi//OneDrive//Desktop//lol.txt");
            BufferedOutputStream bout = new BufferedOutputStream(fout);
            String s = "Hello team";
            byte b[]=s.getBytes();
            bout.write(b);
            bout.flush();
            bout.close();
            fout.close();
            System.out.println("Success...");
        } catch (Exception e) {
            // TODO: handle exception
        }
    }
}