package hello;

public class TotalControleLancamento {
	private int quantidadeLancamentos;
	private int quantidadeRemessas;
	private double valorLancamentos;

	public int getQuantidadeLancamentos(){
		return quantidadeLancamentos;
	}
	public int getQuantidadeRemessas(){
		return quantidadeRemessas;
	}
	public double getValorLancamentos(){
		return valorLancamentos;
	}
	public void setQuantidadeLancamentos(int quantidadeLancamentos) {
		this.quantidadeLancamentos = quantidadeLancamentos;
	}
	public void setQuantidadeRemessas(int quantidadeRemessas) {
		this.quantidadeRemessas = quantidadeRemessas;
	}
	public void setValorLancamentos(int valorLancamentos) {
		this.valorLancamentos = valorLancamentos;
	}

}