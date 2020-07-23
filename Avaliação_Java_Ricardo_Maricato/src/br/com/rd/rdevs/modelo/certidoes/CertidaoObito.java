package br.com.rd.rdevs.modelo.certidoes;

import br.com.rd.rdevs.util.Tributavel;

public class CertidaoObito extends Certidao implements Tributavel {
    private String nomeFalecido;

    public CertidaoObito(String nomeTabeliao, String nomeCartorio, double numeroRegistro, String dataEmissao, String nomeDeclarante, String nomeFalecido) {
        super(nomeTabeliao, nomeCartorio, numeroRegistro, dataEmissao, nomeDeclarante);
        this.nomeFalecido = nomeFalecido;
    }

    @Override
    public void recuperarDadosParaImpressao() {
        super.recuperarDadosParaImpressao();
        System.out.println("Nome: " + getNomeFalecido());
        System.out.println(getTipo());
    }

    public String getNomeFalecido() {
        return nomeFalecido;
    }

    @Override
    public String getTipo() {
        return "Certidão de Óbito";
    }

    @Override
    public double getValorCertidao() {
        return 160.0;
    }
}
