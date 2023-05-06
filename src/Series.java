import java.util.ArrayList;

public class Series {
    private String titulo;
    private String criador;
    private ArrayList<String> elenco;
    private String genero;
    private String sinopse;
    private int ano_lancamento;
    private String classificacao;
    private int temporadas;
    private int episodios;

    public Series(String titulo, String criador, ArrayList<String> elenco, String genero, String sinopse, int ano_lancamento, String classificacao, int temporadas, int episodios) {
        this.titulo = titulo;
        this.criador = criador;
        this.elenco = elenco;
        this.genero = genero;
        this.sinopse = sinopse;
        this.ano_lancamento = ano_lancamento;
        this.classificacao = classificacao;
        this.temporadas = temporadas;
        this.episodios = episodios;
    }

    public String getTitulo() {
        return titulo;
    }

    public void setTitulo(String titulo) {
        this.titulo = titulo;
    }

    public String getCriador() {
        return criador;
    }

    public void setCriador(String criador) {
        this.criador = criador;
    }

    public ArrayList<String> getElenco() {
        return elenco;
    }

    public void setElenco(ArrayList<String> elenco) {
        this.elenco = elenco;
    }

    public String getGenero() {
        return genero;
    }

    public void setGenero(String genero) {
        this.genero = genero;
    }

    public String getSinopse() {
        return sinopse;
    }

    public void setSinopse(String sinopse) {
        this.sinopse = sinopse;
    }

    public int getAno_lancamento() {
        return ano_lancamento;
    }

    public void setAno_lancamento(int ano_lancamento) {
        this.ano_lancamento = ano_lancamento;
    }

    public String getClassificacao() {
        return classificacao;
    }

    public void setClassificacao(String classificacao) {
        this.classificacao = classificacao;
    }

    public int getTemporadas() {
        return temporadas;
    }

    public void setTemporadas(int temporadas) {
        this.temporadas = temporadas;
    }

    public int getEpisodios() {
        return episodios;
    }

    public void setEpisodios(int episodios) {
        this.episodios = episodios;
    }
}