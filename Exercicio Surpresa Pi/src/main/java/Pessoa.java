public class Pessoa {

    private Escolaridade escolaridade;
    private Cidade cidade;
    private Estado estado;

    public Pessoa(Escolaridade escolaridade) {
        this.escolaridade = escolaridade;
    }
    public Pessoa(Cidade cidade) {
        this.cidade = cidade;
    }

    public Pessoa(Estado estado) {
        this.estado = estado;
    }



    public Escolaridade getEscolaridade() {
        return escolaridade;
    }

    public void setEscolaridade(Escolaridade escolaridade) {
        this.escolaridade = escolaridade;
    }

    public Cidade getCidade() {
        return cidade;
    }

    public void setCidade(Cidade cidade) {
        this.cidade = cidade;
    }

    public Estado getEstado() {
        return estado;
    }

    public void setEstado(Estado estado) {
        this.estado = estado;
    }



    public String getDescricaoEscolaridade(){
        if (getEscolaridade() == null){
            throw new NullPointerException("Sem escolaridade");
        }
        return  getEscolaridade().getDescricao();

    }

    public String getNaturalidadeCidade(){
        if (getCidade() == null){
            throw new NullPointerException("Sem naturalidade");
        }
        return  getCidade().getNaturalCidade();
    }

    public String getNaturalidadeEstado(){
        if (getEstado() == null){
            throw new NullPointerException("Sem naturalidade");
        }
        return  getEstado().getNaturalEstado();
    }

}
