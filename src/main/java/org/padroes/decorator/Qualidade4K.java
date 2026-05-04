package org.padroes.decorator;

public class Qualidade4K extends AssinaturaDecorator {

    public Qualidade4K(Assinatura assinatura) {
        super(assinatura);
    }

    @Override
    public float getPercentualAdicional() {
        return 20.0f;
    }

    @Override
    public String getNomeAdicional() {
        return "Qualidade4K";
    }
}

