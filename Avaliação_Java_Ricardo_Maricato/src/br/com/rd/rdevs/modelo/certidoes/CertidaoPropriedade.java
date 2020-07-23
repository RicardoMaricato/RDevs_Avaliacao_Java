package br.com.rd.rdevs.modelo.certidoes;

import br.com.rd.rdevs.util.Tributavel;

public class CertidaoPropriedade extends Certidao implements Tributavel {
    private String imovel;
    private String nomeCompradorImovel;

    public CertidaoPropriedade(String nomeTabeliao, String nomeCartorio, double numeroRegistro, String dataEmissao, String nomeDeclarante, String imovel, String nomeCompradorImovel) {
        super(nomeTabeliao, nomeCartorio, numeroRegistro, dataEmissao, nomeDeclarante);
        this.imovel = imovel;
        this.nomeCompradorImovel = nomeCompradorImovel;
    }

    @Override
    public void recuperarDadosParaImpressao() {
        super.recuperarDadosParaImpressao();
        System.out.println("Imóvel: " + getImovel());
        System.out.println("Nome do Comprador: " + getNomeCompradorImovel());
        System.out.println(getTipo());
    }

    public String getImovel() {
        return imovel;
    }

    public String getNomeCompradorImovel() {
        return nomeCompradorImovel;
    }

    @Override
    public String getTipo() {
        return "Certidão de Propriedade";
    }

    @Override
    public double getValorCertidao() {
        return 140.0;
    }
}
