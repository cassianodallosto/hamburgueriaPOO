import java.util.List;
import java.util.ArrayList;

public class Pedido {
    private int numero;
    private Cliente cliente;
    private List<ItemPedido> itens;
    private FormaPagamento formaPagamento;
    private Entrega entrega;

    public Pedido(int numero, Cliente cliente) {
        this.numero = numero;
        this.cliente = cliente;
        this.itens = new ArrayList<>();
    }

    public void adicionarItem(ItemPedido item) {
        if (item != null) {
            itens.add(item);
        }
    }

    public double calcularTotal() {
        double total = 0;
        for (ItemPedido item : itens) {
            total += item.calcularSubTotal();
        }
        return total;
    }

    public void setFormaPagamento(FormaPagamento formaPagamento) {
        this.formaPagamento = formaPagamento;
    }

    public void setEntrega(Entrega entrega) {
        this.entrega = entrega;
    }

    public int getNumero() { 
        return numero; 
    }
    public Cliente getCliente() { 
        return cliente; 
    }
    public List<ItemPedido> getItens() { 
        return itens; 
    }

    @Override
    public String toString() { //funcao que faz print personalizado, pra nao ficar fazendo + toda hora
        StringBuilder sb = new StringBuilder();
        sb.append("=== Pedido #").append(numero).append(" ===");
        sb.append("\nCliente: ").append(cliente.getNome());
        sb.append("\n--- Itens ---");
        for (ItemPedido item : itens) {
            sb.append("\n").append(item);
        }
        sb.append("\nTotal: R$ ").append(String.format("%.2f", calcularTotal()));
        if (formaPagamento != null)
            sb.append("\nPagamento: ").append(formaPagamento);
        if (entrega != null)
            sb.append("\n").append(entrega);
        return sb.toString();
    }
}