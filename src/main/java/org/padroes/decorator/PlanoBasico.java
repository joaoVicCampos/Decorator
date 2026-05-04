package org.padroes.decorator;

public class PlanoBasico implements Assinatura {

    private float precoMensal;

    public PlanoBasico() {
    }

    public PlanoBasico(float precoMensal) {
        this.precoMensal = precoMensal;
    }

    @Override
    public float getPrecoMensal() {
        return precoMensal;
    }

    @Override
    public String getDescricao() {
        return "PlanoBasico";
    }
}

