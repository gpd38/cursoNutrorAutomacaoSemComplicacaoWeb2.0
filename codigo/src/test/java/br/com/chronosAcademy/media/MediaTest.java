package br.com.chronosAcademy.media;

import br.com.chronosAcademy.Media;
import org.junit.Test;

import static org.junit.Assert.assertEquals;

public class MediaTest {

    @Test
    public void validaAprovado() {
        double n1 = 5;
        double n2 = 5;

        Media media = new Media();
        String resultado = media.resultadoMedia(n1, n2);
        System.out.println(resultado);

        assertEquals("Aprovado", resultado);
    }

    @Test
    public void validaReprovado() {
        double n1 = 4.9;
        double n2 = 5;

        Media media = new Media();
        String resultado = media.resultadoMedia(n1, n2);
        System.out.println(resultado);

        assertEquals("Reprovado", resultado);
    }

}