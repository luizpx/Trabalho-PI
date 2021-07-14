import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class CursoTest {

    @Test
    void deveRetornarEscolaridadeCoordenador() {
        Escolaridade escolaridade = new Escolaridade();
        escolaridade.setDescricao("Doutorado");

        Professor professor = new Professor(escolaridade);

        Curso curso = new Curso();
        curso.setCoordenador(professor);

        assertEquals("Doutorado", curso.getDescricaoEscolaridadeCoordenador());
    }

}