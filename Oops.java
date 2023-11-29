class Mobiles {
    String Name;
    int Cost;

    public void getInfo() {
        System.out.println("The mobile brand name is "+this.Name);
        System.out.println("The cost of the mobile is "+this.Cost);
    }
}

public class Oops {
    public static void main(String[]args) {
        Mobiles m1 = new Mobiles();
        m1.Name = "Iphone";
        m1.Cost = 150000;
        m1.getInfo();

        Mobiles m2 = new Mobiles();
        m2.Name = "Oppo";
        m2.Cost = 25000;
        m2.getInfo();

        Mobiles m3 = new Mobiles();
        m3.Name = "Samsung";
        m3.Cost = 50000;
        m3.getInfo();
    }
    
}