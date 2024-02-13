// static keyword
class Innerfeb13 {
    static String brand;
    int price;
    String name;

    public void show(){
        System.out.println(brand+" "+price+" "+name);
    }

}

    /**
 * Innerfeb13
 */
public class feb13 {
    public static void main(String[] args) {
        Innerfeb13 in=new Innerfeb13();
        Innerfeb13.brand = "apple";
        in.price=2000;
        in.name="13Pro";

        in.show();

    }
    
}
