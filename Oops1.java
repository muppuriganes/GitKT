class pen {
    String color;
    String type;

    public void write() {
        System.out.println("Write something");
    }

    public void printColor() {
        System.out.println(this.color);
    }
}

public class Oops1 {
    public static void main(String[]args) {
        pen pen1 = new pen();
        pen1.color = "Blue";
        pen1.type = "gel";

        pen pen2 = new pen();
        pen2.color = "Black";
        pen2.type = "ballPoint";

        pen1.write();
        pen2.printColor();
    }
}
