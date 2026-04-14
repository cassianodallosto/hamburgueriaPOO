public class PagCartao extends FormaPagamento {
    private int parcelas;

    public PagCartao(int parcelas) {
        super(TipoPagamento.CARTAO_DE_CREDITO);
        this.parcelas = parcelas;
    }

    @Override
    public double calcularTaxa(double valor) {
        return valor * 0.025; // 2.5% de taxa para cartão de crédito e retorna taxa para pagavel.java
    }

    @Override
    public String getDescricaoPagamento() {
        return "Cartão de Crédito em " + parcelas + "x";
    }
}