package dawprogramacion.clases;

public class Fecha {
    private int día;
    private int mes;
    private int año;

    public Fecha(int día, int mes, int año) {
        this.día = día;
        this.mes = mes;
        this.año = año;
    }

    public int getDía() {
        return this.día;
    }

    public int getMes() {
        return this.mes;
    }

    public int getAño() {
        return this.año;
    }

    public void setDía(int día) {
        this.día = día;
    }

    public void setMes(int mes) {
        this.mes = mes;
    }

    public void setAño(int año) {
        this.año = año;
    }

    public void setFecha(int día, int mes, int año) {
        this.día = día;
        this.mes = mes;
        this.año = año;
    }

    @Override
    public String toString() {
        return "Fecha [día=" + día + ", mes=" + mes + ", año=" + año = "]";
    }

}
