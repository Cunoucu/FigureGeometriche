public class Main {
    public static void main(String[] args) {
        Forma f1 = new Cerchio(20);
        System.out.println("area: " + f1.area() + " perimentro: " + f1.perimetro());
        Forma f2 = new Rettangolo(10, 5);
        System.out.println("area: " + f2.area() + " perimentro: " + f2.perimetro());
        Forma f3 = new Quadrato(f1.perimetro()*10);
        System.out.println("area: " + f3.area() + " perimentro: " + f3.perimetro());
    }
}
