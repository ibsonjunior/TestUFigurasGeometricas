package entities;

public class Circulo implements Figura {
    private double raio;

    public Circulo() {
    }

    public Circulo(double raio) {
        this.raio = raio;
    }


    @Override
    public double calcularPerimetro() {
        return raio * Math.PI * 2;
    }

    @Override
    public String toString() {
        return "Circulo{" +
                "raio=" + raio +
                '}';
    }
}
