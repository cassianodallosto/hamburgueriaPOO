public class ItemPedido {
    private Produto produto;
    private int quantidade;

    public ItemPedido(Produto produto, int quantidade) {
        if (produto == null) {
            throw new IllegalArgumentException("produto não pode ser nulo.");
        }
        if (quantidade <= 0) {
            throw new IllegalArgumentException("quantidade deve ser maior que zero");
        }
        this.produto = produto;
        this.quantidade = quantidade;
    }

    public double calcularSubTotal() {
        return produto.getPreco() * quantidade;
    }

    public Produto getProduto() { 
        return produto; 
    }
    public int getQuantidade() { 
        return quantidade; 
    }

    @Override
    public String toString() {
        return quantidade + "x " + produto.getNome() +
               " = R$ " + String.format("%.2f", calcularSubTotal());
    }
}