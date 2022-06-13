public class ArquivoPontoTxt extends Arquivo{

    public String verificarTipoArquivo(){
        return "Arquivo .txt";
    }

    @Override
    public String getTipo(){
        return "ArquivoTexto";
    }

}
