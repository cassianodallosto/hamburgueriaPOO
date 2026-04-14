public abstract class FormaPagamento implements Pagavel {
    protected TipoPagamento tipo;

    public FormaPagamento(TipoPagamento tipo) {
        if (tipo == null) throw new IllegalArgumentException("Tipo não pode ser nulo.");
        this.tipo = tipo;
    }

    public TipoPagamento getTipo() { 
        return tipo; 
    }

    @Override
    public String toString() { return getDescricaoPagamento(); }
}