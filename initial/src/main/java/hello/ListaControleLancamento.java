package hello;

import java.util.Arrays;

public class ListaControleLancamento {
	
	private String dataEfetivaLancamento;
	private String dataLancamentoContaCorrenteCliente;
	private long numeroEvento;
	private String descricaoGrupoPagamento;
	private int codigoIdentificadorUnico;
	private String nomeBanco;
	private int quantidadeLancamentoRemessa;
	private String numeroRaizCNPJ;
	private String numeroSufixoCNPJ;
	private float valorLancamentoRemessa;
	public void setDataEfetivaLancamento(String dataEfetivaLancamento) {
		this.dataEfetivaLancamento = dataEfetivaLancamento;
	}
	public void setDataLancamentoContaCorrenteCliente(String dataLancamentoContaCorrenteCliente) {
		this.dataLancamentoContaCorrenteCliente = dataLancamentoContaCorrenteCliente;
	}
	public void setNumeroEvento(long numeroEvento) {
		this.numeroEvento = numeroEvento;
	}
	public void setDescricaoGrupoPagamento(String descricaoGrupoPagamento) {
		this.descricaoGrupoPagamento = descricaoGrupoPagamento;
	}
	public void setCodigoIdentificadorUnico(int codigoIdentificadorUnico) {
		this.codigoIdentificadorUnico = codigoIdentificadorUnico;
	}
	public void setNomeBanco(String nomeBanco) {
		this.nomeBanco = nomeBanco;
	}
	public void setQuantidadeLancamentoRemessa(int quantidadeLancamentoRemessa) {
		this.quantidadeLancamentoRemessa = quantidadeLancamentoRemessa;
	}
	public void setNumeroRaizCNPJ(String numeroRaizCNPJ) {
		this.numeroRaizCNPJ = numeroRaizCNPJ;
	}
	public void setNumeroSufixoCNPJ(String numeroSufixoCNPJ) {
		this.numeroSufixoCNPJ = numeroSufixoCNPJ;
	}
	public void setValorLancamentoRemessa(float valorLancamentoRemessa) {
		this.valorLancamentoRemessa = valorLancamentoRemessa;
	}
	public void setDateLancamentoContaCorrenteCliente(long dateLancamentoContaCorrenteCliente) {
		this.dateLancamentoContaCorrenteCliente = dateLancamentoContaCorrenteCliente;
	}
	public void setDateEfetivaLancamento(long dateEfetivaLancamento) {
		this.dateEfetivaLancamento = dateEfetivaLancamento;
	}
	public void setLancamentoContaCorrenteCliente(LancamentoContaCorrenteCliente[] lancamentoContaCorrenteCliente) {
		this.lancamentoContaCorrenteCliente = lancamentoContaCorrenteCliente;
	}

	private long dateLancamentoContaCorrenteCliente;
	private long dateEfetivaLancamento;

	private LancamentoContaCorrenteCliente[] lancamentoContaCorrenteCliente;

	public String getDataEfetivaLancamento(){
		return getDataEfetivaLancamento;
	}
	public String getDataLancamentoContaCorrenteCliente(){
		return getDataLancamentoContaCorrenteCliente;
	}
	public long getNumeroEvento(){
		return getNumeroEvento;
	}
	public String getDescricaoGrupoPagamento(){
		return getDescricaoGrupoPagamento;
	}
	public int getCodigoIdentificadorUnico(){
		return getCodigoIdentificadorUnico;
	}
	public String getNomeBanco(){
		return getNomeBanco;
	}
	public int getQuantidadeLancamentoRemessa(){
		return getQuantidadeLancamentoRemessa;
	}
	public String getNumeroRaizCNPJ(){
		return getNumeroRaizCNPJ;
	}
	public String getNumeroSufixoCNPJ(){
		return getNumeroSufixoCNPJ;
	}
	public float getValorLancamentoRemessa(){
		return getValorLancamentoRemessa;
	}
	public long getDateLancamentoContaCorrenteCliente(){
		return getDateLancamentoContaCorrenteCliente;
	}
	public long getDateEfetivaLancamento(){
		return getDateEfetivaLancamento;
	}

	public LancamentoContaCorrenteCliente[] getLancamentoContaCorrenteCliente(){
		return lancamentoContaCorrenteCliente;
	}

}