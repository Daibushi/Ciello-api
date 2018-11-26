package hello;

import java.util.Arrays;

public class LancamentoContaLegado {

	private int indice;
	private int tamanhoPagina;
	private int totalElements;

	private TotalControleLancamento totalControleLancamento;
	private ListaControleLancamento[] listaControleLancamento;
	
	public int getIndice() {
		return indice;
	}
	public void setIndice(int indice) {
		this.indice = indice;
	}
	public int getTamanhoPagina() {
		return tamanhoPagina;
	}
	public void setTamanhoPagina(int tamanhoPagina) {
		this.tamanhoPagina = tamanhoPagina;
	}
	public int getTotalElements() {
		return totalElements;
	}
	public void setTotalElements(int totalElements) {
		this.totalElements = totalElements;
	}
	public TotalControleLancamento getTotalControleLancamento() {
		return totalControleLancamento;
	}
	public void setTotalControleLancamento(TotalControleLancamento totalControleLancamento) {
		this.totalControleLancamento = totalControleLancamento;
	}
	public ListaControleLancamento[] getListaControleLancamento() {
		return listaControleLancamento;
	}
	public void setListaControleLancamento(ListaControleLancamento[] listaControleLancamento) {
		this.listaControleLancamento = listaControleLancamento;
	}

	
}