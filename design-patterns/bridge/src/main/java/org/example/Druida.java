package org.example;

public class Druida extends Classe {

    public Druida(float valor) {
        super(valor);
    }

    @Override
    public float calcularValor() {
        return this.valor + this.raca.valorCompra();
    }
}
