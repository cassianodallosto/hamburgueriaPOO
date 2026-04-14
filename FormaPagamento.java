public class FormaPagamento {
    private TipoPagamento tipo;

    public FormaPagamento(TipoPagamento tipo) {
        if(tipo ==null) {
            throw new IllegalArgumentException("Tipo de pagamento não pode ser nulo.");
        }
        this.tipo = tipo;
    }

    public TipoPagamento getTipo() {
        return tipo; 
    }


    @Override
    public String toString() {
        return tipo.toString(); //retorna o tipo e o valor do productum
    }



}