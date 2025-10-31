package school.sptech;

public class Quadrado extends Figura {

    private double lado;

    public Quadrado() {}

    public Quadrado(double lado) {
        this.lado = lado;
    }
    @Override
    public Double calcularArea() {
        return lado * lado;
    }

    public double getLado() {
        return lado;
    }

    public void setLado(double lado) {
        this.lado = lado;
    }

    @Override
    public String toString() {
        return "Quadrado{" +
                "lado=" + lado +
                '}';
    }
}
