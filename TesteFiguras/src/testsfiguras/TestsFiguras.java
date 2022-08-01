package testsfiguras;

import entities.Circulo;
import entities.Figura;
import entities.Quadrado;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

public class TestsFiguras {
   Figura quadrado;
   Figura circulo;
    @BeforeEach
            void perimetro(){
        quadrado = new Quadrado(4);
        circulo = new Circulo(3);
    }

    @Test

    void imprimirTest(){
            System.out.println(quadrado);
            System.out.println(circulo);
    }

    @Test

    void calcularPerimetro(){
        System.out.println(quadrado.calcularPerimetro());
        System.out.println(circulo.calcularPerimetro());
    }



}
