
export class Lancamento {
  totalControleLancamento: TotalControleLancamento;
  listaControleLancamento?: (ListaControleLancamentoEntity)[] | null;
  indice: number;
  tamanhoPagina: number;
  totalElements: number;
}
export class TotalControleLancamento {
  quantidadeLancamentos: number;
  quantidadeRemessas: number;
  valorLancamentos: number;
}
export class ListaControleLancamentoEntity {
  lancamentoContaCorrenteCliente: LancamentoContaCorrenteCliente;
  dataEfetivaLancamento: string;
  dataLancamentoContaCorrenteCliente: string;
  numeroEvento: number;
  descricaoGrupoPagamento: string;
  codigoIdentificadorUnico: string;
  nomeBanco: string;
  quantidadeLancamentoRemessa: number;
  numeroRaizCNPJ: string;
  numeroSufixoCNPJ: string;
  valorLancamentoRemessa: number;
  dateLancamentoContaCorrenteCliente: number;
  dateEfetivaLancamento: number;
}
export class LancamentoContaCorrenteCliente {
  numeroRemessaBanco: number;
  dadosAnaliticoLancamentoFinanceiroCliente?: (null)[] | null;
  nomeSituacaoRemessa: string;
  dadosDomicilioBancario: DadosDomicilioBancario;
  nomeTipoOperacao: string;
}
export class DadosDomicilioBancario {
  codigoBanco: number;
  numeroAgencia: number;
  numeroContaCorrente: string;
}
