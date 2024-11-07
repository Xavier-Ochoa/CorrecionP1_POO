package FigurasRegulares;

public class Circulo {
    private double radio;

    public Circulo() {}

    public double getRadio() {
        return radio;
    }

    public void setRadio(double radio) {
        this.radio = radio;
    }

    public double calcularPerimetro() {
        return 2 * Math.PI * radio; // Circunferencia
    }

    public double calcularArea() {
        return Math.PI * radio * radio;
    }
}
