public class main {
    public static void main(String[] args) {

        Cliente cliente = new Cliente();
        cliente.setNome("Membro da interpool");
        cliente.setTelefone("5567676767");
        cliente.setEndereco("Rua dos bobos, 0");

        Produto feijaoComFarinha = new Produto("Feijão Com Farinha", 25.67, "aumosso");
        Produto pastel = new Produto("Pastel do Tambara", 12.00, "janta");
        Produto coca = new Produto("Coca-Cola", 8.00, "Bebida");

        Pedido pedido = new Pedido(1, cliente);
        pedido.adicionarItem(new ItemPedido(feijaoComFarinha, 2));
        pedido.adicionarItem(new ItemPedido(pastel, 1));
        pedido.adicionarItem(new ItemPedido(coca, 2));

        FormaPagamento pagamento = new FormaPagamento(TipoPagamento.CARTAO_DE_CREDITO);
        pedido.setFormaPagamento(pagamento);

        Entrega entrega = new Entrega(
            cliente.getNome(),
            cliente.getEndereco(),
            5.00,
            2
        );
        pedido.setEntrega(entrega);

        System.out.println(pedido);
    }
}