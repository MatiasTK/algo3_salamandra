package org.solucion;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;
import static org.junit.jupiter.api.Assertions.assertThrows;

public class SalamandraTest {

    @Test
    public void test01calcularCombustionConTresTiposEsCorrecta() throws CapacidadMaximaSuperadaError, ContaminacionSuperadaError {
        Salamandra salamandra = new Salamandra();

        Quebracho quebracho = new Quebracho(5);
        Pino pino = new Pino(1);
        Resina resina = new Resina(1);

        salamandra.agregarMadera(quebracho);
        salamandra.agregarMadera(pino);
        salamandra.agregarMadera(resina);

        int resultadoEsperado = (1000)*5 + 500 + 250;

        assertEquals(salamandra.calcularCostoCombustionTotal(), resultadoEsperado);
    }

    @Test
    public void test02LaCantidadSuperaElMaximo() throws CapacidadMaximaSuperadaError, ContaminacionSuperadaError {
        Salamandra salamandra = new Salamandra();

        Quebracho quebracho = new Quebracho(6);
        Pino pino = new Pino(5);

        assertThrows(CapacidadMaximaSuperadaError.class, () -> {
            salamandra.agregarMadera(quebracho);
            salamandra.agregarMadera(pino);
        });

        // double resultadoEsperado = (6*5) + 150;
    }

    @Test
    public void test03LaContaminacionSuperaElMaximo() throws CapacidadMaximaSuperadaError, ContaminacionSuperadaError {
        Salamandra salamandra = new Salamandra();

        Quebracho quebracho = new Quebracho(2);
        Pino pino = new Pino(1);
        Resina resina = new Resina(5);

        assertThrows(ContaminacionSuperadaError.class, () -> {
            salamandra.agregarMadera(quebracho);
            salamandra.agregarMadera(pino);
            salamandra.agregarMadera(resina);
        });

        // double resultadoEsperado = (2*5) + 150 + Math.pow(5,5);
    }

    @Test
    public void test04CalculoLaContaminacionCorrecta() throws CapacidadMaximaSuperadaError, ContaminacionSuperadaError {
        Salamandra salamandra = new Salamandra();

        Quebracho quebracho = new Quebracho(5);
        Pino pino = new Pino(1);
        Resina resina = new Resina(1);

        salamandra.agregarMadera(quebracho);
        salamandra.agregarMadera(pino);
        salamandra.agregarMadera(resina);

        double resultadoEsperado = (5*5) + 150 + 5;

        assertEquals(salamandra.calcularContaminacionTotal(), resultadoEsperado);
    }
}
