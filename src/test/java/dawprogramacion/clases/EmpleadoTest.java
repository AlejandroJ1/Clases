package dawprogramacion.clases;

import org.junit.jupiter.api.AfterEach;
import org.junit.jupiter.api.BeforeEach;

public class EmpleadoTest {
    
    Empleado empleado1;
    Empleado empleado2;

    @BeforeEach
    void crearClasesEmpleado() {
        int id = 1;
        String firstName = "Alejandro";
        String lastName = "Jiménez";
        double salary = 123.45;
        empleado1 = new Empleado(id, firstName, lastName);
        empleado2 = new Empleado(id, firstName, lastName, salary);
    }
    
    @AfterEach
    void borrarClasesCuenta() {
        empleado1 = null;
        empleado2 = null;
    }

    


    
}
