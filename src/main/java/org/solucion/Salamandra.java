package org.solucion;

import java.util.ArrayList;
import java.util.List;

public class Salamandra {
    private final List<Madera> maderas;

    Salamandra(){
        maderas = new ArrayList<>();
    }

    public double calcularContaminacionTotal(){
        double contaminacionTotal = 0;
        for(Madera m: maderas){
            contaminacionTotal += m.calcularCostoContaminacion();
        }

        return contaminacionTotal;
    }

    private int calcularKilosTotales(){
        int kilosTotales = 0;
        for(Madera m: maderas){
            kilosTotales += m.obtenerKilos();
        }

        return kilosTotales;
    }

    public void agregarMadera(Madera madera) throws ContaminacionSuperadaError, CapacidadMaximaSuperadaError {
        maderas.add(madera);
        if(calcularKilosTotales() > 10){
            throw new CapacidadMaximaSuperadaError();
        }
        if(calcularContaminacionTotal() > 500){
            throw new ContaminacionSuperadaError();
        }
    }

    public int calcularCostoCombustionTotal(){
        int costoTotal = 0;
        for(Madera m: maderas){
            costoTotal += m.calcularCostoCombustion();
        }

        return  costoTotal;
    }
}
