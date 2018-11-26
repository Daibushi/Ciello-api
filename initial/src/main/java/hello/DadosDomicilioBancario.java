package hello;

public class DadosDomicilioBancario{

	private int codigoBanco;
	private int numeroAgencia;
	private String numeroContaCorrente;

	public void setCodigoBanco(int codigoBanco) {
		this.codigoBanco = codigoBanco;
	}
	public void setNumeroAgencia(int numeroAgencia) {
		this.numeroAgencia = numeroAgencia;
	}
	public void setNumeroContaCorrente(String numeroContaCorrente) {
		this.numeroContaCorrente = numeroContaCorrente;
	}
	public int getCodigoBanco(){
		return codigoBanco;
	}
	public int getNumeroAgencia(){
		return numeroAgencia;
	}
	public String getNumeroContaCorrente(){
		return numeroContaCorrente;
	}
}
