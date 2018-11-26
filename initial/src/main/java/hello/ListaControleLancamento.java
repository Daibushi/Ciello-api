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
	private long dateLancamentoContaCorrenteCliente;
	private long dateEfetivaLancamento;

	private LancamentoContaCorrenteCliente lancamentoContaCorrenteCliente;

	public String getDataEfetivaLancamento() {
		return dataEfetivaLancamento;
	}

	public void setDataEfetivaLancamento(String dataEfetivaLancamento) {
		this.dataEfetivaLancamento = dataEfetivaLancamento;
	}

	public String getDataLancamentoContaCorrenteCliente() {
		return dataLancamentoContaCorrenteCliente;
	}

	public void setDataLancamentoContaCorrenteCliente(String dataLancamentoContaCorrenteCliente) {
		this.dataLancamentoContaCorrenteCliente = dataLancamentoContaCorrenteCliente;
	}

	public long getNumeroEvento() {
		return numeroEvento;
	}

	public void setNumeroEvento(long numeroEvento) {
		this.numeroEvento = numeroEvento;
	}

	public String getDescricaoGrupoPagamento() {
		return descricaoGrupoPagamento;
	}

	public void setDescricaoGrupoPagamento(String descricaoGrupoPagamento) {
		this.descricaoGrupoPagamento = descricaoGrupoPagamento;
	}

	public int getCodigoIdentificadorUnico() {
		return codigoIdentificadorUnico;
	}

	public void setCodigoIdentificadorUnico(int codigoIdentificadorUnico) {
		this.codigoIdentificadorUnico = codigoIdentificadorUnico;
	}

	public String getNomeBanco() {
		return nomeBanco;
	}

	public void setNomeBanco(String nomeBanco) {
		this.nomeBanco = nomeBanco;
	}

	public int getQuantidadeLancamentoRemessa() {
		return quantidadeLancamentoRemessa;
	}

	public void setQuantidadeLancamentoRemessa(int quantidadeLancamentoRemessa) {
		this.quantidadeLancamentoRemessa = quantidadeLancamentoRemessa;
	}

	public String getNumeroRaizCNPJ() {
		return numeroRaizCNPJ;
	}

	public void setNumeroRaizCNPJ(String numeroRaizCNPJ) {
		this.numeroRaizCNPJ = numeroRaizCNPJ;
	}

	public String getNumeroSufixoCNPJ() {
		return numeroSufixoCNPJ;
	}

	public void setNumeroSufixoCNPJ(String numeroSufixoCNPJ) {
		this.numeroSufixoCNPJ = numeroSufixoCNPJ;
	}

	public float getValorLancamentoRemessa() {
		return valorLancamentoRemessa;
	}

	public void setValorLancamentoRemessa(float valorLancamentoRemessa) {
		this.valorLancamentoRemessa = valorLancamentoRemessa;
	}

	public long getDateLancamentoContaCorrenteCliente() {
		return dateLancamentoContaCorrenteCliente;
	}

	public void setDateLancamentoContaCorrenteCliente(long dateLancamentoContaCorrenteCliente) {
		this.dateLancamentoContaCorrenteCliente = dateLancamentoContaCorrenteCliente;
	}

	public long getDateEfetivaLancamento() {
		return dateEfetivaLancamento;
	}

	public void setDateEfetivaLancamento(long dateEfetivaLancamento) {
		this.dateEfetivaLancamento = dateEfetivaLancamento;
	}

	public LancamentoContaCorrenteCliente getLancamentoContaCorrenteCliente() {
		return lancamentoContaCorrenteCliente;
	}

	public void setLancamentoContaCorrenteCliente(LancamentoContaCorrenteCliente lancamentoContaCorrenteCliente) {
		this.lancamentoContaCorrenteCliente = lancamentoContaCorrenteCliente;
	}

}