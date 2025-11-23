package org.example;

public abstract class Classe {
    protected Raca raca;
    protected float valor;

    public Classe(float valor) {
        this.valor = valor;
    }

    public void setRaca(Raca raca) {
        this.raca = raca;
    }

    public void setValor(float valor) {
        this.valor = valor;
    }

    public abstract float calcularValor();
}
