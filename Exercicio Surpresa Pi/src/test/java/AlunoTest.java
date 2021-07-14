import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class AlunoTest {

    @Test
    void deveRetornarEstadoNaturalidadeAluno() {

        Estado estado = new Estado();
        estado.setNaturalEstado("MG");

        Aluno aluno = new Aluno(estado);

        assertEquals("MG", aluno.getNaturalidadeEstado());
    }

}