public class Professor extends Pessoa{

    private Curso contratacao;

    public Curso getContratacao() {
        return contratacao;
    }

    public void setContratacao(Curso contratacao) {
        this.contratacao = contratacao;
    }

    public String getContratacaoProfessor(){
        return contratacao.getNomeCurso();
    }


    public Professor(Escolaridade escolaridade) {
        super(escolaridade);
    }

    public Professor(Cidade cidade) {
        super(cidade);
    }

}
