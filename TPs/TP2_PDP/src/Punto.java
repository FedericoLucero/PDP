public class Punto {
    private double x;
    private double y;

    // Constructor
    public Punto(double x, double y){
        this.x = x;
        this.y = y;
    }

    // Métodos propios
    public double calcularDistancia(Punto otroPunto) {
        double distanciaX = this.x - otroPunto.x;
        double distanciaY = this.y - otroPunto.y;
        return Math.sqrt(distanciaX * distanciaX + distanciaY * distanciaY);
    }

    // Getters y setters
    public double getX(){
        return x;
    }
    public void setX(double x){
        this.x = x;
    }
    public double getY(){
        return y;
    }
    public void setY(double y){
        this.y = y;
    }

}
