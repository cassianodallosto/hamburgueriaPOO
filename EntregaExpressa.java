import java.time.LocalDateTime;
import java.time.format.DateTimeFormatter;

public class EntregaExpressa extends Entrega {
    private LocalDateTime previsao;

    public EntregaExpressa(String nomeCliente, String endereco) {
        super(nomeCliente, endereco);
        this.previsao = LocalDateTime.now().plusHours(2);
    }

    @Override
    public double calcularFrete() {
        return 15.00; // taxa fixa expressa
    }

    @Override
    public String getPrevisaoFormatada() {
        return previsao.format(DateTimeFormatter.ofPattern("dd/MM/yyyy HH:mm"));
    }
}