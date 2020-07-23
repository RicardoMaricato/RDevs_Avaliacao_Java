package br.com.rd.rdevs.modelo.certidoes;

public class CertidaoNascimento extends Certidao {
    private String nomeFiliacao;

    public CertidaoNascimento(String nomeTabeliao, String nomeCartorio, double numeroRegistro, String dataEmissao, String nomeDeclarante, String nomeFiliacao) {
        super(nomeTabeliao, nomeCartorio, numeroRegistro, dataEmissao, nomeDeclarante);
        this.nomeFiliacao = nomeFiliacao;
    }

    @Override
    public void recuperarDadosParaImpressao() {
        super.recuperarDadosParaImpressao();
        System.out.println("Nome da Filiação: " + getNomeFiliacao());
        System.out.println(getTipo());
    }

    public String getNomeFiliacao() {
        return nomeFiliacao;
    }

    @Override
    public String getTipo() {
        return "Certidão de Nascimento";
    }
}
