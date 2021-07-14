import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class ProfessorTest {

    @Test
    void deveRetornarEscolaridadeProfessor() {
        Escolaridade escolaridade = new Escolaridade();
        escolaridade.setDescricao("Mestrado");

        Professor professor = new Professor(escolaridade);

        assertEquals("Mestrado", professor.getDescricaoEscolaridade());
    }

    @Test
    void deveRetornarCidadeNaturalidadeProfessor() {
        Cidade cidade = new Cidade();
        cidade.setNaturalCidade("Juiz de Fora");

        Professor professor = new Professor(cidade);

        assertEquals("Juiz de Fora", professor.getNaturalidadeCidade());
    }

}