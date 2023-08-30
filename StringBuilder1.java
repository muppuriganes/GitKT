
public class StringBuilder1 {
    public static void main(String[]args) {
        StringBuilder sb = new StringBuilder("Ganesh");
        System.out.println(sb);

        sb.append("Muppuri");
        System.out.println(sb);

        sb.insert(0, 'M');
        System.out.println(sb);

        sb.insert(2, 'n');
        System.out.println(sb);

        sb.delete(2, 4);
        System.out.println(sb);

        
    }

}
