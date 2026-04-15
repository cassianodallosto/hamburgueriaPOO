public class PagPix extends FormaPagamento {
    public PagPix() {
        super(TipoPagamento.PIX);
    }

    @Override
    public double calcularTaxa(double valor) {
        return 0.0; // PIX sem taxa
    }

    @Override
    public String getDescricaoPagamento() {
        return "Pix (sem taxa)";
    }
}