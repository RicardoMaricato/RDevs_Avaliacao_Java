package br.com.rd.rdevs.modelo;

public abstract class Cartorio {
    private String nomeTabeliao;
    private String nomeCartorio;

    public Cartorio(String nomeTabeliao, String nomeCartorio) {
        this.nomeTabeliao = nomeTabeliao;
        this.nomeCartorio = nomeCartorio;
    }

    public String getNomeTabeliao() {
        return nomeTabeliao;
    }

    public void setNomeTabeliao(String nomeTabeliao) {
        this.nomeTabeliao = nomeTabeliao;
    }

    public String getNomeCartorio() {
        return nomeCartorio;
    }

    public void setNomeCartorio(String nomeCartorio) {
        this.nomeCartorio = nomeCartorio;
    }
}
