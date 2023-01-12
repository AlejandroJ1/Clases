package dawprogramacion.clases;

public class Rectangulo {
    private float ancho = 1.0f;
    private float alto = 1.0f;

    public Rectangulo() {
    }

    public Rectangulo(float ancho, float alto) {
        this.ancho = ancho;
        this.alto = alto;
    }

    public float getAncho(float ancho) {
        return this.ancho;
    }

    public void setAncho(float ancho) {
        this.ancho = ancho;
    }

    public float getAlto(float alto) {
        return this.alto;
    }

    public void setAlto(float alto) {
        this.alto = alto;
    }

    public double getArea() {
        //base por altura
        return this.ancho * this.alto;
    }

    public double getPerimetro() {
        return (this.ancho + this.alto) * 2;
    }

    @Override
    public String toString() {
        return "Rectangulo [ancho=" + ancho + ", alto=" + alto + "]";
    }

    

}
