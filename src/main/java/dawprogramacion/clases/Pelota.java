package dawprogramacion.clases;

public class Pelota {

    private float x;
    private float y;
    private int radio;
    private float xDelta;
    private float yDelta;

    public Pelota(float x, float y, int radio, float xDelta, float yDelta) {
        this.x = x;
        this.y = y;
        this.radio = radio;
        this.xDelta = xDelta;
        this.yDelta = yDelta;
    }

    public float getX() {
        return this.x;
    }

    public void setX(float x){
        this.x = x;
    }

    public float getY() {
        return this.y;
    }

    public void setY(float y){
        this.y = y;
    }

    public int getRadio() {
        return this.radio;
    }

    public void setRadio(int radio){
        this.radio = radio;
    }

    public float getXDelta() {
        return this.xDelta;
    }

    public void setXDelta(float xDelta){
        this.xDelta = xDelta;
    }

    public float getYDelta() {
        return this.yDelta;
    }

    public void setYDelta(float yDelta){
        this.yDelta = yDelta;
    }

    public void mover() {
        this.x = this.xDelta;
        this.y = this.yDelta;
    }

    public void reflexiónHorizontal() {
        this.xDelta = -this.xDelta;
    }

    public void reflexiónVertical() {
        this.yDelta = -this.yDelta;
    }

    @Override
    public String toString() {
        return "Pelota [(" + this.x + "," + this.y + "), velocidad = ( " + this.xDelta + "," + yDelta + ")]" ;
    }


    
}
