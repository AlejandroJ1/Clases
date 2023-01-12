package dawprogramacion.clases;

public class Cuenta {
    private String id;
    private String nombreCliente;
    private double saldo = 0;

    // constr
    public Cuenta(String id, String nombreCliente) {
        this.id = id;
        this.nombreCliente = nombreCliente;
    }

    public Cuenta(String id, String nombreCliente, double saldo) {
        this.id = id;
        this.nombreCliente = nombreCliente;
        this.saldo = saldo;
    }

    //meths
    public String getId() {
        return id;
    }

    public String getNombreCliente() {
        return nombreCliente;
    }
    public double getSaldo() {
        return saldo;
    }

    public double credito(double cantidad) {
        //hacer throw exception
        this.saldo +=cantidad;
        return this.saldo;
    }

    public double debito(double cantidad) {
        if(cantidad <= this.saldo) {
            this.saldo -= cantidad;
        } else {
            System.out.println("El saldo es insuficiente.");//cambiar por excepcions??
        }
        return this.saldo;
    }

    public double transferencia(Cuenta cuenta, double saldoActual, double cantidad) {
        saldoActual = this.saldo;
        this.debito(cantidad);

        if(this.saldo != this.debito(cantidad)){
            cuenta.credito(cantidad);
        }else {
            System.out.println("No se puede hacer la transferencia.");
        }
        return this.saldo;
    }
    
    @Override
    public String toString() {
        return "Cuenta [id=" + id + ", nombreCliente=" + nombreCliente + ", saldo=" + saldo + "]";
    }


    
}
