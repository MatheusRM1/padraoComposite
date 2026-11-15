import org.composite.*;
import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.*;

class GerenciadorTest {

    @Test
    void deveRetornarConteudoPasta() {
        Pasta pasta1 = new Pasta("Documentos");

        Pasta pasta2 = new Pasta("Projetos");
        Arquivo arquivo21 = new Arquivo("Trabalho", "pdf");
        pasta2.addItem(arquivo21);

        Pasta pasta3 = new Pasta("Imagens");
        Arquivo arquivo31 = new Arquivo("Foto", "jpg");
        Arquivo arquivo32 = new Arquivo("Logo", "png");
        pasta3.addItem(arquivo31);
        pasta3.addItem(arquivo32);

        Pasta arquivos = new Pasta("Meus Arquivos");
        arquivos.addItem(pasta1);
        arquivos.addItem(pasta2);
        arquivos.addItem(pasta3);

        Gerenciador gerenciador = new Gerenciador();
        gerenciador.setItem(arquivos);

        assertEquals("Pasta: Meus Arquivos\n" +
                "Pasta: Documentos\n" +
                "Pasta: Projetos\n" +
                "Arquivo: Trabalho.pdf\n" +
                "Pasta: Imagens\n" +
                "Arquivo: Foto.jpg\n" +
                "Arquivo: Logo.png\n", gerenciador.getItem());
    }

    @Test
    void deveRetornarExcecaoGerenciadorSemItem() {
        try {
            Gerenciador gerenciador = new Gerenciador();
            gerenciador.getItem();
            fail();
        }
        catch (NullPointerException e) {
            assertEquals("Gerenciador sem item", e.getMessage());
        }
    }
}