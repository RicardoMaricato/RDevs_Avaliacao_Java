package br.com.rd.rdevs.modelo.contratos;

import br.com.rd.rdevs.util.Tributavel;

public class ContratoCompraVenda extends Contrato {
    private String nomeComprador;
    private String nomeVendedor;
    private String objetoCompraVenda;

    public ContratoCompraVenda(String nomeTabeliao, String nomeCartorio, double numeroRegistro, String nomePartesEnvolvida, String nomeTestemunha1, String nomeTestemunha2, String dataEmissao, String dataRegisto, String nomeComprador, String nomeVendedor, String objetoCompraVenda) {
        super(nomeTabeliao, nomeCartorio, numeroRegistro, nomePartesEnvolvida, nomeTestemunha1, nomeTestemunha2, dataEmissao, dataRegisto);
        this.nomeComprador = nomeComprador;
        this.nomeVendedor = nomeVendedor;
        this.objetoCompraVenda = objetoCompraVenda;
    }

    @Override
    public void recuperarDadosParaImpressao() {
        super.recuperarDadosParaImpressao();
        System.out.println("Nome do Comprador: " + getNomeComprador());
        System.out.println("Nome do Vendedor: " + getNomeVendedor());
        System.out.println("Objeto Negociado: " + getObjetoCompraVenda());
        System.out.println(getTipo());
    }

    public String getNomeComprador() {
        return nomeComprador;
    }

    public String getNomeVendedor() {
        return nomeVendedor;
    }

    public String getObjetoCompraVenda() {
        return objetoCompraVenda;
    }

    @Override
    public String getTipo() {
        return "Contrato de Compra e Venda";
    }
}
