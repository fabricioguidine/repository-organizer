package org.example;

public class Barbaro extends Classe {

    public Barbaro(float valor) {
        super(valor);
    }

    @Override
    public float calcularValor() {
        return this.valor + this.raca.valorCompra();
    }
}
