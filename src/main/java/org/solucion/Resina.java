package org.solucion;

public class Resina implements Madera{

    private final int kilos;
    private final int precioBase;
    private final int contaminacionBase;

    Resina(int kilos){
        this.kilos = kilos;
        precioBase = 250;
        contaminacionBase = 5;
    }

    public int obtenerKilos(){
        return kilos;
    }

    public int calcularCostoCombustion(){
        return precioBase*kilos;
    }

    public double calcularCostoContaminacion(){
        return Math.pow(contaminacionBase,kilos);
    }
}
