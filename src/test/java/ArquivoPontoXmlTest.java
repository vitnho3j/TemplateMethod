import org.junit.Test;

import static org.junit.Assert.assertEquals;

public class ArquivoPontoXmlTest {

    @Test
    public void deveRetornarArquivoPontoXml(){
        ArquivoPontoXml arquivo = new ArquivoPontoXml();
        assertEquals("Arquivo .xml", arquivo.verificarTipoArquivo());
    }

    @Test
    public void deveRetornarInformacoes(){
        ArquivoPontoXml arquivo = new ArquivoPontoXml();
        arquivo.setNome("Arquivo1");
        arquivo.setTamanho("15.5 MB");
        assertEquals("ArquivoXML{nome='Arquivo1', tamanho='15.5 MB', tipo='Arquivo .xml'}", arquivo.getInfo());
    }


}
