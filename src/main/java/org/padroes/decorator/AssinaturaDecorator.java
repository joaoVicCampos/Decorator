package org.padroes.decorator;

public abstract class AssinaturaDecorator implements Assinatura {

    private Assinatura assinatura;

    public AssinaturaDecorator(Assinatura assinatura) {
        this.assinatura = assinatura;
    }

    public Assinatura getAssinatura() {
        return assinatura;
    }

    public void setAssinatura(Assinatura assinatura) {
        this.assinatura = assinatura;
    }

    public abstract float getPercentualAdicional();

    @Override
    public float getPrecoMensal() {
        return this.assinatura.getPrecoMensal() * (1 + (this.getPercentualAdicional() / 100));
    }

    public abstract String getNomeAdicional();

    @Override
    public String getDescricao() {
        return this.assinatura.getDescricao() + "/" + this.getNomeAdicional();
    }
}

