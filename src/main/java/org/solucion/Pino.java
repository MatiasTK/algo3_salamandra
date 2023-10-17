package org.solucion;

public class Pino implements Madera{
    private final int kilos;
    private final int precioBase;
    private final int contaminacionBase;

    Pino(int kilos){
        this.kilos = kilos;
        precioBase = 500;
        contaminacionBase = 150;
    }

    public int obtenerKilos(){
        return kilos;
    }

    public int calcularCostoCombustion(){
        return precioBase*kilos;
    }

    public double calcularCostoContaminacion(){
        return contaminacionBase;
    }
}
