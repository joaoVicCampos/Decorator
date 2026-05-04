package org.padroes;

import org.padroes.decorator.Assinatura;
import org.padroes.decorator.DownloadsOffline;
import org.padroes.decorator.PlanoBasico;
import org.padroes.decorator.Qualidade4K;
import org.padroes.decorator.SemAnuncios;

public class Main {
    public static void main(String[] args) {
        Assinatura planoBasico = new PlanoBasico(39.90f);
        System.out.println("Plano 1: " + planoBasico.getDescricao() + " | R$ " + planoBasico.getPrecoMensal());

        Assinatura planoSemAnuncios = new SemAnuncios(planoBasico);
        System.out.println("Plano 2: " + planoSemAnuncios.getDescricao() + " | R$ " + planoSemAnuncios.getPrecoMensal());

        Assinatura planoCompleto = new DownloadsOffline(new Qualidade4K(new SemAnuncios(new PlanoBasico(39.90f))));
        System.out.println("Plano 3: " + planoCompleto.getDescricao() + " | R$ " + planoCompleto.getPrecoMensal());
    }
}