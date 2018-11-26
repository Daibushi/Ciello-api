package hello;	

public class LancamentoContaCorrenteCliente {

	private	long numeroRemessaBanco;
	private String nomeSituacaoRemessa;
	private String nomeTipoOperacao;

	private DadosDomicilioBancario dadosDomicilioBancario;

	public void setNumeroRemessaBanco(long numeroRemessaBanco) {
		this.numeroRemessaBanco = numeroRemessaBanco;
	}
	public void setNomeSituacaoRemessa(String nomeSituacaoRemessa) {
		this.nomeSituacaoRemessa = nomeSituacaoRemessa;
	}
	public void setNomeTipoOperacao(String nomeTipoOperacao) {
		this.nomeTipoOperacao = nomeTipoOperacao;
	}
	public void setDadosDomicilioBancario(DadosDomicilioBancario dadosDomicilioBancario) {
		this.dadosDomicilioBancario = dadosDomicilioBancario;
	}

	public long numeroRemessaBanco(){
		return numeroRemessaBanco;
	}
	public String nomeSituacaoRemessa(){
		return nomeSituacaoRemessa;
	}
	public String nomeTipoOperacao(){
		return nomeTipoOperacao;
	}
	public DadosDomicilioBancario dadosDomicilioBancario(){
		return dadosDomicilioBancario;
	}
}
