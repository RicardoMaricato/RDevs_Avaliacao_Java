package br.com.rd.rdevs.modelo.contratos;

import br.com.rd.rdevs.modelo.Cartorio;
import br.com.rd.rdevs.util.CartorioIllegalException;

public abstract class Contrato extends Cartorio {
    private double numeroRegistro;
    private String nomePartesEnvolvida;
    private String nomeTestemunha1;
    private String nomeTestemunha2;
    private String dataEmissao;
    private String dataRegisto;
    protected static int identificadorContratos = 0;

    public Contrato(String nomeTabeliao, String nomeCartorio, double numeroRegistro, String nomePartesEnvolvida, String nomeTestemunha1, String nomeTestemunha2, String dataEmissao, String dataRegisto) {
        super(nomeTabeliao, nomeCartorio);
        identificadorContratos++;
        this.numeroRegistro = numeroRegistro;
        this.nomePartesEnvolvida = nomePartesEnvolvida;
        this.nomeTestemunha1 = nomeTestemunha1;
        this.nomeTestemunha2 = nomeTestemunha2;
        this.dataEmissao = dataEmissao;
        this.dataRegisto = dataRegisto;
    }

    public void registrar(double numeroRegistro) {
        if (this.numeroRegistro < 0) {
            throw new CartorioIllegalException("Não é possível realizar um registro com número negativo.");
        }
    }

    public void recuperarDadosParaImpressao() {
        System.out.println("Nome do Cartório: " + getNomeCartorio());
        System.out.println("Nome do Tabelião: " + getNomeTabeliao());
        System.out.println("Data de Emissão: " + getDataEmissao());
        System.out.println("Número do Resgistro: " + getNumeroRegistro());
    }

    public static int getIdentificadorContratos() {
        return identificadorContratos;
    }

    public double getNumeroRegistro() {
        return numeroRegistro;
    }

    public String getNomePartesEnvolvida() {
        return nomePartesEnvolvida;
    }

    public String getNomeTestemunha1() {
        return nomeTestemunha1;
    }

    public String getNomeTestemunha2() {
        return nomeTestemunha2;
    }

    public String getDataEmissao() {
        return dataEmissao;
    }

    public String getDataRegisto() {
        return dataRegisto;
    }

    public abstract String getTipo();
}
