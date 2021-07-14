public class Curso {

    private Professor coordenador;
    private String nomeCurso;
    private TipoEnsino tipoEnsino;

    public Professor getCoordenador() {
        return coordenador;
    }

    public void setCoordenador(Professor coordenador) {
        if(coordenador != null){
            this.coordenador = coordenador;
        }

    }

    public String getDescricaoEscolaridadeCoordenador(){
        return  coordenador.getDescricaoEscolaridade();
    }


    public String getNomeCurso() {
        return nomeCurso;
    }

    public void setNomeCurso(String nomeCurso) {
        this.nomeCurso = nomeCurso;
    }

}
