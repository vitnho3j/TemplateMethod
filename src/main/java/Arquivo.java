public abstract class Arquivo {

    protected String nome;

    private String tamanho;

    public String getTamanho() {
        return tamanho;
    }

    public void setTamanho(String tamanho) {
        this.tamanho = tamanho;
    }

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public abstract String verificarTipoArquivo();

    public String getTipo(){
        return "Arquivo";
    }

    public String getInfo(){
        return getTipo() + "{" +
                "nome='" + this.nome + "'" +
                ", tamanho='" + this.tamanho + '\'' +
                ", tipo='" + this.verificarTipoArquivo() + "'" +
                '}';
    }

}
