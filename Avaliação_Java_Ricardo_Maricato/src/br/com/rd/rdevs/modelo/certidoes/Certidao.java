package br.com.rd.rdevs.modelo.certidoes;

import br.com.rd.rdevs.modelo.Cartorio;

public abstract class Certidao extends Cartorio {
    private double numeroRegistro;
    private String dataEmissao;
    private String nomeDeclarante;
    protected static int identificadorCertidoes = 0;

    public Certidao(String nomeTabeliao, String nomeCartorio, double numeroRegistro, String dataEmissao, String nomeDeclarante) {
        super(nomeTabeliao, nomeCartorio);
        this.numeroRegistro = numeroRegistro;
        this.dataEmissao = dataEmissao;
        this.nomeDeclarante = nomeDeclarante;
        identificadorCertidoes++;
    }

    public void registrar(double numeroRegistro) {
        if (this.numeroRegistro < 0) {
            throw new IllegalArgumentException("Não é possível realizar um registro com número negativo.");
        }
    }

    public void recuperarDadosParaImpressao() {
        System.out.println("Nome do Cartório: " + getNomeCartorio());
        System.out.println("Nome do Tabelião: " + getNomeTabeliao());
        System.out.println("Data de Emissão: " + getDataEmissao());
        System.out.println("Número do Resgistro: " + getNumeroRegistro());
    }

    public String getNomeDeclarante() {
        return nomeDeclarante;
    }

    public static int getIdentificadorCertidoes() {
        return identificadorCertidoes;
    }

    public double getNumeroRegistro() {
        return numeroRegistro;
    }

    public String getDataEmissao() {
        return dataEmissao;
    }

    public abstract String getTipo();
}
