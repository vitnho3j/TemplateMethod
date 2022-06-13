import org.junit.Test;

import static org.junit.Assert.assertEquals;

public class ArquivoPontoTxtTest {

    @Test
    public void deveRetornarArquivoPontoTxt(){
        ArquivoPontoTxt arquivo = new ArquivoPontoTxt();
        assertEquals("Arquivo .txt", arquivo.verificarTipoArquivo());
    }

    @Test
    public void deveRetornarInformacoes(){
        ArquivoPontoTxt arquivo = new ArquivoPontoTxt();
        arquivo.setNome("Arquivo1");
        arquivo.setTamanho("15.5 MB");
        assertEquals("ArquivoTexto{nome='Arquivo1', tamanho='15.5 MB', tipo='Arquivo .txt'}", arquivo.getInfo());
    }


}
