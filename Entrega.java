public abstract class Entrega implements Notificavel {
    protected String nomeCliente;
    protected String endereco;
    protected String status;

    public Entrega(String nomeCliente, String endereco) {
        this.nomeCliente = nomeCliente;
        this.endereco = endereco;
        this.status = "Processando";
    }

    public abstract double calcularFrete();
    public abstract String getPrevisaoFormatada();

    public void setStatus(String status) { this.status = status; }

    @Override
    public void notificar(String mensagem) {
        System.out.println("[Entrega para " + nomeCliente + "] " + mensagem);
    }

    @Override
    public String toString() {
        return "--- Dados de Entrega ---" +
               "\nCliente: " + nomeCliente +
               "\nDestino: " + endereco +
               "\nFrete: R$ " + String.format("%.2f", calcularFrete()) +
               "\nStatus: " + status +
               "\nPrevisão: " + getPrevisaoFormatada() +
               "\n------------------------";
    }
}