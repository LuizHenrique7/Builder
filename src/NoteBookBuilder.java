import java.util.Date;

public class NoteBookBuilder {
    private Notebook notebook;

    public NoteBookBuilder() {
        notebook = new Notebook();
    }

    public Notebook build() {
        if (notebook.getNumeroSerie() == 0) {
            throw new IllegalArgumentException("Número de série inválido");
        }
        if (notebook.getNome().equals("")) {
            throw new IllegalArgumentException("Nome inválido");
        }
        return notebook;
    }


    public NoteBookBuilder setNumeroSerie(int numeroSerie) {
        notebook.setNumeroSerie(numeroSerie);
        return this;
    }


    public NoteBookBuilder setNome(String nome) {
        notebook.setNome(nome);
        return this;
    }

    public NoteBookBuilder setMemoriaRam(String memoriaRam) {
        notebook.setMemoriaRam(memoriaRam);
        return this;
    }

    public NoteBookBuilder setArmazenamentoInterno(String armazenamentoInterno) {
        notebook.setArmazenamentoInterno(armazenamentoInterno);
        return this;
    }

    public NoteBookBuilder setPlacaVideo(String placaVideo) {
        notebook.setPlacaVideo(placaVideo);
        return this;
    }

    public NoteBookBuilder setProcessador(String processador) {
        notebook.setProcessador(processador);
        return this;
    }

}