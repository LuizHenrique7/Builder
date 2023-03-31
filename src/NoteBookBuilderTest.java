import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class NoteBookBuilderTest {
    @Test
    void deveRetornarExcecaoParaNoteBookSemNumeroSerie() {
        try {
            NoteBookBuilder NoteBookBuilder = new NoteBookBuilder();
            Notebook notebook = NoteBookBuilder
                    .setNome("Notebook Gamer Legion 5 R7-5800H")
                    .setProcessador("AMD R Series")
                    .build();
            fail();
        } catch (IllegalArgumentException e) {
            assertEquals("Número de série inválido", e.getMessage());
        }
    }

    @Test
    void deveRetornarExcecaoParaNoteBookSemNome() {
        try {
            NoteBookBuilder NoteBookBuilder = new NoteBookBuilder();
            Notebook notebook = NoteBookBuilder
                    .setNumeroSerie(1)
                    .setProcessador("AMD R Series")
                    .build();
            fail();
        } catch (IllegalArgumentException e) {
            assertEquals("Nome inválido", e.getMessage());
        }
    }

    @Test
    void deveRetornarNoteBookValido() {
        NoteBookBuilder notebookBuilder = new NoteBookBuilder();
        Notebook notebook = notebookBuilder
                .setNumeroSerie(1)
                .setNome("Notebook Gamer Legion 5 R7-5800H")
                .setProcessador("AMD R Series")
                .build();

        assertNotNull(notebook);
    }
}