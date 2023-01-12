package dawprogramacion.clases;

import static org.junit.jupiter.api.Assertions.assertEquals;

import org.junit.jupiter.api.AfterEach;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

public class CuentaTest {
    Cuenta cuenta1;
    Cuenta cuenta2;

    @BeforeEach
    void crearClasesCuenta() {
        String id = "Jm044ll";
        String nombreCliente = "Pepe siu";
        double saldo = 123.45;
        cuenta1 = new Cuenta(id, nombreCliente);
        cuenta2 = new Cuenta(id, nombreCliente, saldo);
    }

    @AfterEach
    void borrarClasesCuenta() {
        cuenta1 = null;
        cuenta2 = null;
    }

    @Test
    public void elIdConElPrimerConstructorEstaOk() {
        String expected = "Jm044ll";
        assertEquals(expected, cuenta1.getId(), "El id debería ser: 'Jj044ll'");
    }

    @Test
    public void ElNombreConElPrimerConstructorEstaOk() {
        String expected = "Pepe siu";
        assertEquals(expected, cuenta1.getNombreCliente(), "El nombre debería ser: 'Pepe siu'");
    }

    @Test
    public void elSaldoConElPrimerConstructorEsCero() {
        double expected = 0;
        assertEquals(expected, cuenta1.getSaldo(), "El saldo por defecto debería ser 0");
    }

    @Test
    public void elMetodoToStringConElPrimerConstructorFuncionaOk() {
        String expected = "Cuenta [id=" + "Jm044ll" + ", nombreCliente=" + "Pepe siu" + ", saldo=" + "0.0" + "]";
        assertEquals(expected, cuenta1.toString(), "El saldo por defecto debería ser 0");
    }

    public void elIdConElSegundoConstructorEstaOk() {
        String expected = "Jm044ll";
        assertEquals(expected, cuenta2.getId(), "El id debería ser: 'Jj044ll'");
    }

    @Test
    public void ElNombreConElSegundoConstructorEstaOk() {
        String expected = "Pepe siu";
        assertEquals(expected, cuenta2.getNombreCliente(), "El nombre debería ser: 'Pepe siu'");
    }

    @Test
    public void elSaldoConElSegundoConstructorEsCero() {
        double expected = 123.45;
        assertEquals(expected, cuenta2.getSaldo(), "El saldo por defecto debería ser 0");
    }

    @Test
    public void elMetodoToStringConElSegundoConstructorFuncionaOk() {
        String expected = "Cuenta [id=" + "Jm044ll" + ", nombreCliente=" + "Pepe siu" + ", saldo=" + "123.45" + "]";
        assertEquals(expected, cuenta2.toString(), "El saldo por defecto debería ser 0");
    }

}
