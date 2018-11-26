package hello;

import java.util.Arrays;

public class LancamentoContaLegado {

	private int indice;
	private int tamanhoPagina;
	private int totalElements;

	private TotalControleLancamento totalControleLancamento;
	private ListaControleLancamento[] listaControleLancamento;

	public int getIndice(){
		return indice;
	}
	public int getTamanhoPagina(){
		return tamanhoPagina;
	}
	public int getTotalElements(){
		return totalElements;
	}

	public ListaControleLancamento[] getListaControleLancamento(){
		return listaControleLancamento;
	}

	public TotalControleLancamento getTotalControleLancamento(){
		return totalControleLancamento;
	}

	public int setIndice(int indice){
		indice = indice;
	}
	public int setTamanhoPagina(int tamanhoPagina){
		tamanhoPagina = tamanhoPagina;
	}
	public int setTotalElements(int setTotalElements){
		totalElements = totalElements;
	}

	public ListaControleLancamento[] setListaControleLancamento(ListaControleLancamento[] setListaControleLancamento){
		listaControleLancamento = listaControleLancamento;
	}

	public TotalControleLancamento setTotalControleLancamento(TotalControleLancamento setTotalControleLancamento){
		totalControleLancamento = totalControleLancamento;
	}
}