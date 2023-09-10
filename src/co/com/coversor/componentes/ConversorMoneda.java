package co.com.coversor.componentes;

public class ConversorMoneda {

    private double tasaCambio;

    public double pesosDolar(double cantidad) {
        tasaCambio = 0.0002489;
        return cantidad * tasaCambio;
    }
}
