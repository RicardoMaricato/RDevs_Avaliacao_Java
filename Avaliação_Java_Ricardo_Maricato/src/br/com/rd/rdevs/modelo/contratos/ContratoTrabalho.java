package br.com.rd.rdevs.modelo.contratos;

public class ContratoTrabalho extends Contrato {
    private String nomeContratante;
    private String nomeContratado;
    private String profissao;

    public ContratoTrabalho(String nomeTabeliao, String nomeCartorio, double numeroRegistro, String nomePartesEnvolvida, String nomeTestemunha1, String nomeTestemunha2, String dataEmissao, String dataRegisto, String nomeContratante, String nomeContratado, String profissao) {
        super(nomeTabeliao, nomeCartorio, numeroRegistro, nomePartesEnvolvida, nomeTestemunha1, nomeTestemunha2, dataEmissao, dataRegisto);
        this.nomeContratante = nomeContratante;
        this.nomeContratado = nomeContratado;
        this.profissao = profissao;
    }

    @Override
    public void recuperarDadosParaImpressao() {
        super.recuperarDadosParaImpressao();
        System.out.println("Nome do Contratante: " + getNomeContratante());
        System.out.println("Nome do Contratado: " + getNomeContratado());
        System.out.println("Profissão: " + getProfissao());
        System.out.println(getTipo());
    }

    public String getNomeContratante() {
        return nomeContratante;
    }

    public String getNomeContratado() {
        return nomeContratado;
    }

    public String getProfissao() {
        return profissao;
    }

    @Override
    public String getTipo() {
        return "Contrato de Trabalho.";
    }
}
