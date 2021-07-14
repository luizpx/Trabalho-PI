public class Escola {

    private Professor diretor;


    public Professor getDiretor() {
        return diretor;
    }

    public void setDiretor(Professor diretor) {
        if(diretor != null){
            this.diretor = diretor;
        }

    }

    public String getDescricaoEscolaridadeDiretor(){
        return  diretor.getDescricaoEscolaridade();

    }
}
