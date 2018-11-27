package lancamento;	

public class LancamentoContaCorrenteCliente {

	private	long numeroRemessaBanco;
	private String nomeSituacaoRemessa;
	private String nomeTipoOperacao;
	
	private String[] dadosAnaliticoLancamentoFinanceiroCliente;



	private DadosDomicilioBancario dadosDomicilioBancario;

	public long getNumeroRemessaBanco() {
		return numeroRemessaBanco;
	}

	public void setNumeroRemessaBanco(long numeroRemessaBanco) {
		this.numeroRemessaBanco = numeroRemessaBanco;
	}

	public String getNomeSituacaoRemessa() {
		return nomeSituacaoRemessa;
	}

	public void setNomeSituacaoRemessa(String nomeSituacaoRemessa) {
		this.nomeSituacaoRemessa = nomeSituacaoRemessa;
	}

	public String getNomeTipoOperacao() {
		return nomeTipoOperacao;
	}

	public void setNomeTipoOperacao(String nomeTipoOperacao) {
		this.nomeTipoOperacao = nomeTipoOperacao;
	}

	public DadosDomicilioBancario getDadosDomicilioBancario() {
		return dadosDomicilioBancario;
	}

	public void setDadosDomicilioBancario(DadosDomicilioBancario dadosDomicilioBancario) {
		this.dadosDomicilioBancario = dadosDomicilioBancario;
	}


	public String[] getDadosAnaliticoLancamentoFinanceiroCliente(){
		return dadosAnaliticoLancamentoFinanceiroCliente;
	}

	public void setDadosAnaliticoLancamentoFinanceiroCliente(){
		this.dadosAnaliticoLancamentoFinanceiroCliente = dadosAnaliticoLancamentoFinanceiroCliente;
	}

	
}
