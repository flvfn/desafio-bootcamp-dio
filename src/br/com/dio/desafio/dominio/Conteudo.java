package br.com.dio.desafio.dominio;

public abstract class Conteudo {

    protected static double XP_PADRAO = 10d;
    private String titulo;
    private String descricao;

    public static double getXpPadrao() {
        return XP_PADRAO;
    }

    public static void setXpPadrao(double xpPadrao) {
        XP_PADRAO = xpPadrao;
    }

    public String getTitulo() {
        return titulo;
    }

    public void setTitulo(String titulo) {
        this.titulo = titulo;
    }

    public String getDescricao() {
        return descricao;
    }

    public void setDescricao(String descricao) {
        this.descricao = descricao;
    }

    public abstract double calcularXp();
}
