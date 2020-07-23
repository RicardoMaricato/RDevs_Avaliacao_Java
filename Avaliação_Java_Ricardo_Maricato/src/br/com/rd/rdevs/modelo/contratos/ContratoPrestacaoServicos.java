package br.com.rd.rdevs.modelo.contratos;

public class ContratoPrestacaoServicos extends Contrato {
    private String nomeContratado;
    private String nomeContratande;
    private String nomeServicoPrestado;

    public ContratoPrestacaoServicos(String nomeTabeliao, String nomeCartorio, double numeroRegistro, String nomePartesEnvolvida, String nomeTestemunha1, String nomeTestemunha2, String dataEmissao, String dataRegisto, String nomeContratado, String nomeContratande, String nomeServicoPrestado) {
        super(nomeTabeliao, nomeCartorio, numeroRegistro, nomePartesEnvolvida, nomeTestemunha1, nomeTestemunha2, dataEmissao, dataRegisto);
        this.nomeContratado = nomeContratado;
        this.nomeContratande = nomeContratande;
        this.nomeServicoPrestado = nomeServicoPrestado;
    }

    @Override
    public void recuperarDadosParaImpressao() {
        super.recuperarDadosParaImpressao();
        System.out.println("Nome do Contratador: " + getNomeContratado());
        System.out.println("Nome do Contratante: " + getNomeContratande());
        System.out.println("Serviço Prestado: " + getNomeServicoPrestado());
        System.out.println(getTipo());
    }

    public String getNomeContratado() {
        return nomeContratado;
    }

    public String getNomeContratande() {
        return nomeContratande;
    }

    public String getNomeServicoPrestado() {
        return nomeServicoPrestado;
    }

    @Override
    public String getTipo() {
        return "Contrato de Prestação de Serviço.";
    }
}
