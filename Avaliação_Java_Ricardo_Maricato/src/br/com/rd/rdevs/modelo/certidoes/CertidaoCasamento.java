package br.com.rd.rdevs.modelo.certidoes;

import br.com.rd.rdevs.util.Tributavel;

public class CertidaoCasamento extends Certidao implements Tributavel {
    private String nomePrimeiroConjugue;
    private String segundoConjugue;

    public CertidaoCasamento(String nomeTabeliao, String nomeCartorio, double numeroRegistro, String dataEmissao, String nomeDeclarante, String nomePrimeiroConjugue, String segundoConjugue) {
        super(nomeTabeliao, nomeCartorio, numeroRegistro, dataEmissao, nomeDeclarante);
        this.nomePrimeiroConjugue = nomePrimeiroConjugue;
        this.segundoConjugue = segundoConjugue;
    }

    @Override
    public void recuperarDadosParaImpressao() {
        super.recuperarDadosParaImpressao();
        System.out.println("Primeiro Cônjugue:" + getNomePrimeiroConjugue());
        System.out.println("Segundo Cônjugue:" + getSegundoConjugue());
        System.out.println(getTipo());
    }

    public String getNomePrimeiroConjugue() {
        return nomePrimeiroConjugue;
    }

    public String getSegundoConjugue() {
        return segundoConjugue;
    }

    @Override
    public String getTipo() {
        return "Certidão de Casamento";
    }

    @Override
    public double getValorCertidao() {
        return 120.0;
    }
}
