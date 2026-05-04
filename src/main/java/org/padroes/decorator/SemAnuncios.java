package org.padroes.decorator;

public class SemAnuncios extends AssinaturaDecorator {

    public SemAnuncios(Assinatura assinatura) {
        super(assinatura);
    }

    @Override
    public float getPercentualAdicional() {
        return 12.0f;
    }

    @Override
    public String getNomeAdicional() {
        return "SemAnuncios";
    }
}

