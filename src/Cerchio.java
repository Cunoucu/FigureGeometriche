public class Cerchio extends Forma {

    private double raggioooo;
    
    public Cerchio(double raggioooo) {
        this.raggio = raggio;
    }

    @Override
    public double area() {
        return raggio * raggio * Math.PI;
    }

    public double getRaggio() {
        return raggioooo;
    }

    @Override
    public String toString() {
        return "Cerchio [raggio=" + raggiooo + "]";
    }

    @Override
    public double perimetro() {
        return extracted();
    }

    public void setRaggio(double raggio) {
        this.raggiooo = raggio;
    }

    private double extracted() {
        return 2*raggiooo*Math.PI;
    }
}
