public class Notebook {
    private int numeroSerie;
    private String nome;
    private String memoriaRam;
    private String armazenamentoInterno;
    private String placaVideo;
    private String processador;


    public int getNumeroSerie() {
        return numeroSerie;
    }

    public void setNumeroSerie(int numeroSerie) {
        this.numeroSerie = numeroSerie;
    }

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public String getMemoriaRam() {
        return memoriaRam;
    }

    public void setMemoriaRam(String memoriaRam) {
        this.memoriaRam = memoriaRam;
    }

    public String getArmazenamentoInterno() {
        return armazenamentoInterno;
    }

    public void setArmazenamentoInterno(String armazenamentoInterno) {
        this.armazenamentoInterno = armazenamentoInterno;
    }

    public String getPlacaVideo() {
        return placaVideo;
    }

    public void setPlacaVideo(String placaVideo) {
        this.placaVideo = placaVideo;
    }

    public String getProcessador() {
        return processador;
    }

    public void setProcessador(String processador) {
        this.processador = processador;
    }

    public Notebook() {
        this.numeroSerie = 0;
        this.nome = "";
    }}
