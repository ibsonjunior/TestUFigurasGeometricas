package entities;

public class Circulo implements Figura {
    private int raio;

    public Circulo() {
    }

    public Circulo(int raio) {
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
