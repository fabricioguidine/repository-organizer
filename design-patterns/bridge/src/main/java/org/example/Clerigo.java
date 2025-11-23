package org.example;

public class Clerigo extends Classe{

    public Clerigo(float valor) {
        super(valor);
    }

    @Override
    public float calcularValor() {
        return this.valor + this.raca.valorCompra();
    }
}
