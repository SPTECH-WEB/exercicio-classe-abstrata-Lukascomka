package school.sptech;

public class Circulo extends Figura {
    private double raio;


    public Circulo() {
    }

    public Circulo(String cor, Integer espessura, double raio) {
        super(cor, espessura);
        this.raio = raio;
    }

    @Override
    public Double calcularArea() {
        return Math.PI * Math.pow(raio, 2);
    }

    public double getRaio() {
        return raio;
    }

    public void setRaio(double raio) {
        this.raio = raio;
    }

    @Override
    public String toString() {
        return "Circulo{" +
                "raio=" + raio +
                '}';
    }
}
