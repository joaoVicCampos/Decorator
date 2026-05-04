package org.padroes.decorator;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;

class AssinaturaTest {

    @Test
    void deveRetornarPrecoPlanoBasico() {
        Assinatura assinatura = new PlanoBasico(39.90f);

        assertEquals(39.90f, assinatura.getPrecoMensal(), 0.0001f);
    }

    @Test
    void deveRetornarPrecoPlanoComSemAnuncios() {
        Assinatura assinatura = new SemAnuncios(new PlanoBasico(39.90f));

        assertEquals(44.688f, assinatura.getPrecoMensal(), 0.0001f);
    }

    @Test
    void deveRetornarPrecoPlanoComQualidade4K() {
        Assinatura assinatura = new Qualidade4K(new PlanoBasico(39.90f));

        assertEquals(47.88f, assinatura.getPrecoMensal(), 0.0001f);
    }

    @Test
    void deveRetornarPrecoPlanoComDownloadsOffline() {
        Assinatura assinatura = new DownloadsOffline(new PlanoBasico(39.90f));

        assertEquals(43.092f, assinatura.getPrecoMensal(), 0.0001f);
    }

    @Test
    void deveRetornarPrecoPlanoComSemAnunciosMaisQualidade4K() {
        Assinatura assinatura = new SemAnuncios(new Qualidade4K(new PlanoBasico(39.90f)));

        assertEquals(53.6256f, assinatura.getPrecoMensal(), 0.0001f);
    }

    @Test
    void deveRetornarPrecoPlanoComSemAnunciosMaisDownloadsOffline() {
        Assinatura assinatura = new SemAnuncios(new DownloadsOffline(new PlanoBasico(39.90f)));

        assertEquals(48.26304f, assinatura.getPrecoMensal(), 0.0001f);
    }

    @Test
    void deveRetornarPrecoPlanoComQualidade4KMaisDownloadsOffline() {
        Assinatura assinatura = new Qualidade4K(new DownloadsOffline(new PlanoBasico(39.90f)));

        assertEquals(51.7104f, assinatura.getPrecoMensal(), 0.0001f);
    }

    @Test
    void deveRetornarPrecoPlanoComSemAnunciosMaisQualidade4KMaisDownloadsOffline() {
        Assinatura assinatura = new SemAnuncios(new Qualidade4K(new DownloadsOffline(new PlanoBasico(39.90f))));

        assertEquals(57.91565f, assinatura.getPrecoMensal(), 0.0001f);
    }

    @Test
    void deveRetornarDescricaoPlanoBasico() {
        Assinatura assinatura = new PlanoBasico();

        assertEquals("PlanoBasico", assinatura.getDescricao());
    }

    @Test
    void deveRetornarDescricaoPlanoComSemAnuncios() {
        Assinatura assinatura = new SemAnuncios(new PlanoBasico());

        assertEquals("PlanoBasico/SemAnuncios", assinatura.getDescricao());
    }

    @Test
    void deveRetornarDescricaoPlanoComQualidade4K() {
        Assinatura assinatura = new Qualidade4K(new PlanoBasico());

        assertEquals("PlanoBasico/Qualidade4K", assinatura.getDescricao());
    }

    @Test
    void deveRetornarDescricaoPlanoComDownloadsOffline() {
        Assinatura assinatura = new DownloadsOffline(new PlanoBasico());

        assertEquals("PlanoBasico/DownloadsOffline", assinatura.getDescricao());
    }

    @Test
    void deveRetornarDescricaoPlanoComSemAnunciosMaisQualidade4K() {
        Assinatura assinatura = new SemAnuncios(new Qualidade4K(new PlanoBasico()));

        assertEquals("PlanoBasico/Qualidade4K/SemAnuncios", assinatura.getDescricao());
    }

    @Test
    void deveRetornarDescricaoPlanoComSemAnunciosMaisDownloadsOffline() {
        Assinatura assinatura = new SemAnuncios(new DownloadsOffline(new PlanoBasico()));

        assertEquals("PlanoBasico/DownloadsOffline/SemAnuncios", assinatura.getDescricao());
    }

    @Test
    void deveRetornarDescricaoPlanoComQualidade4KMaisDownloadsOffline() {
        Assinatura assinatura = new Qualidade4K(new DownloadsOffline(new PlanoBasico()));

        assertEquals("PlanoBasico/DownloadsOffline/Qualidade4K", assinatura.getDescricao());
    }

    @Test
    void deveRetornarDescricaoPlanoComSemAnunciosMaisQualidade4KMaisDownloadsOffline() {
        Assinatura assinatura = new SemAnuncios(new Qualidade4K(new DownloadsOffline(new PlanoBasico())));

        assertEquals("PlanoBasico/DownloadsOffline/Qualidade4K/SemAnuncios", assinatura.getDescricao());
    }
}

