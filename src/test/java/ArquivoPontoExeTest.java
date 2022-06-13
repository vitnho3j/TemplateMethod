import org.junit.Test;

import static org.junit.Assert.assertEquals;

public class ArquivoPontoExeTest {

    @Test
    public void deveRetornarArquivoPontoExe(){
        ArquivoPontoExe arquivo = new ArquivoPontoExe();
        assertEquals("Arquivo .exe", arquivo.verificarTipoArquivo());
    }

    @Test
    public void deveRetornarInformacoes(){
        ArquivoPontoExe arquivo = new ArquivoPontoExe();
        arquivo.setNome("Arquivo1");
        arquivo.setTamanho("15.5 MB");
        assertEquals("Arquivo{nome='Arquivo1', tamanho='15.5 MB', tipo='Arquivo .exe'}", arquivo.getInfo());
    }


}
