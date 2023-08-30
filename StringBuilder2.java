
public class StringBuilder2 {
    public static void main(String[]args) {
        StringBuilder sb = new StringBuilder("Ganesh");
        System.out.println(sb);


        //CharAt(Intex)
        System.out.println(sb.charAt(0));

        //set a charAt index
        sb.setCharAt(0, 'S');
        System.out.println(sb);

        //instert a charAt index
        sb.insert(2, 'd');
        System.out.println(sb);

        //Delete char at some index
        sb.delete(0, 1);
        System.out.println(sb);

        //Append char
        sb.append("Muppuri");
        System.out.println(sb);

        //length of String
        System.out.println(sb.length());


    }
}
