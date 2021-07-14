import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class EscolaTest {

    @Test
    void deveRetornarEscolaridadeDiretor() {
        Escolaridade escolaridade = new Escolaridade();
        escolaridade.setDescricao("Pós-doutorado");

        Professor professor = new Professor(escolaridade);

        Escola escola = new Escola();
        escola.setDiretor(professor);

        assertEquals("Pós-doutorado", escola.getDescricaoEscolaridadeDiretor());
    }

}