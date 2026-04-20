import java.time.LocalDateTime;

public class main {
    public static void main(String[] args) {
        Cliente cliente = new Cliente("Membro da Interpol", "55676767670", "Rua dos Bobos, 0");

        Produto feijao = new Produto("Feijao Com Farinha", 25.67, "almoco");
        Produto pastel = new Produto("Pastel do Tambara", 12.00, "janta");
        Produto coca   = new Produto("Coca-Cola", 8.00, "bebida");

        Pedido pedido = new Pedido(1, cliente);
        pedido.adicionarItem(new ItemPedido(feijao, 2));
        pedido.adicionarItem(new ItemPedido(pastel, 1));
        pedido.adicionarItem(new ItemPedido(coca, 2));

        // Polimorfismo: qualquer FormaPagamento funciona aqui
        FormaPagamento pagamento = new PagCartao(3);
        pedido.setFormaPagamento(pagamento);

        // Polimorfismo: qualquer Entrega funciona aqui
        Entrega entrega = new EntregaExpressa(cliente.getNome(), cliente.getEndereco());
        pedido.setEntrega(entrega);

        System.out.println(pedido);
        System.out.printf("Total com taxa e frete: R$ %.2f%n", pedido.calcularTotalComTaxa());

        // Interface Notificavel em ação
        pedido.notificarTodos("Seu pedido #1 foi confirmado!");
    }
}
