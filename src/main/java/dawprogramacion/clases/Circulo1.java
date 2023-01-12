package dawprogramacion.clases;

import static java.lang.Math.PI;
import static java.lang.Math.pow;

public class Circulo1 {
    
    private double radio = 1.0;
    private String color = "rojo";

    public Circulo1(){
    }

    public Circulo1(double radio) {
        this.radio = radio;
    }
    
    public Circulo1(double radio,String color) {
        this.radio = radio;
        this.color = color;
    }

    public double getRadio(){
        return this.radio;
    }

    public String getColor() {
        return this.color;
    }

    public void setRadio(double radio) {
        this.radio = radio;
    }

    public void setColor(String color) {
        this.color = color;
    }
    
    @Override
    public String toString() {
        return "Circulo1 [radio=" + radio + ", color=" + color + "]";
    }

    public double getArea() {
        return pow(this.radio, 2) * PI;
    }

}
