public class ArquivoPontoXml extends Arquivo{

    public String verificarTipoArquivo(){
        return "Arquivo .xml";
    }

    @Override
    public String getTipo(){
        return "ArquivoXML";
    }


}
