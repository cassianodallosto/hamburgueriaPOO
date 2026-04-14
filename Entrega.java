import java.time.LocalDateTime;
import java.time.format.DateTimeFormatter;

public class Entrega {
    private String nomeCliente;
    private String endereco;
    private double valorFrete;
    private String status;
    private LocalDateTime dataHoraPrevisao;

    public Entrega(String nomeCliente, String endereco, double valorFrete, int horasParaEntrega) {
        this.nomeCliente = nomeCliente;
        this.endereco = endereco;
        this.valorFrete = valorFrete;
        this.status = "Processando";
        this.dataHoraPrevisao = LocalDateTime.now().plusHours(horasParaEntrega);
    }

    public String getPrevisaoFormatada() {
        DateTimeFormatter formato = DateTimeFormatter.ofPattern("dd/MM/yyyy HH:mm");
        return dataHoraPrevisao.format(formato);
    }

    public double getValorFrete() { return valorFrete; }
    public void setValorFrete(double valorFrete) { this.valorFrete = valorFrete; }

    @Override
    public String toString() {
        return "--- Dados de Entrega ---" +
               "\nCliente: " + nomeCliente +
               "\nDestino: " + endereco +
               "\nFrete: R$ " + String.format("%.2f", valorFrete) +
               "\nStatus: " + status +
               "\nPrevisão: " + getPrevisaoFormatada() +
               "\n------------------------";
    }
}