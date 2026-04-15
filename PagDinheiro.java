public class PagDinheiro extends FormaPagamento {
    public PagDinheiro() {
        super(TipoPagamento.DINHEIRO);
    }

    @Override
    public double calcularTaxa(double valor) {
        return 0.0;
    }

    @Override
    public String getDescricaoPagamento() {
        return "Dinheiro";
    }
}