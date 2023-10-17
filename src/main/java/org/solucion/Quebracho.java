package org.solucion;

public class Quebracho implements Madera {
    private final int kilos;
    private final int precioBase;
    private final int contaminacionBase;

    Quebracho(int kilos){
        this.kilos = kilos;
        precioBase = 1000;
        contaminacionBase = 5;
    }

    public int obtenerKilos(){
        return kilos;
    }

    public int calcularCostoCombustion(){
        return precioBase * kilos;
    }

    public double calcularCostoContaminacion(){
        return contaminacionBase * kilos;
    }
}
