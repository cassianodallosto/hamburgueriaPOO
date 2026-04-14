public enum TipoPagamento {
        DINHEIRO,
        CARTAO_DE_CREDITO,
        CARTAO_DE_DEBITO,
        PIX;


    @Override
    public String toString() {
        switch (this) {
            case DINHEIRO: return "Dinheiro";
            case CARTAO_DE_CREDITO: return "Cartão de Crédito";
            case CARTAO_DE_DEBITO: return "Cartão de Débito";
            case PIX: return "Pix";
            default: return super.toString();
        }
    }
}
