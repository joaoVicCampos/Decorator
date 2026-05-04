package org.padroes.decorator;

public class DownloadsOffline extends AssinaturaDecorator {

    public DownloadsOffline(Assinatura assinatura) {
        super(assinatura);
    }

    @Override
    public float getPercentualAdicional() {
        return 8.0f;
    }

    @Override
    public String getNomeAdicional() {
        return "DownloadsOffline";
    }
}

