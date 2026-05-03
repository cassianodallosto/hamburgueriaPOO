public class Cliente implements Notificavel {
    private String nome;
    private String telefone;
    private String endereco;

    public Cliente(String nome, String telefone, String endereco) {
        this.nome = nome;
        this.telefone = telefone;
        this.endereco = endereco;
    }

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        if (nome != null && !nome.isEmpty()) {
            this.nome = nome;
        }
        else {
            throw new IllegalArgumentException("Nome não pode ser vazio.");
        }
    }

    public String getTelefone() {
        return telefone;
    }

    public void setTelefone(String telefone) {
        if (telefone != null && telefone.length() == 11) {
            this.telefone = telefone;
        }
        else {
            throw new IllegalArgumentException("Telefone deve ter 11 dígitos.");
        }
    }

    public String getEndereco() {
        return endereco;
    }

    public void setEndereco(String endereco) {
        if (endereco != null) {
            this.endereco = endereco;
        }
        else {
            throw new IllegalArgumentException("Endereço não pode ser vazio.");
        }
    }

    @Override
    public void notificar(String mensagem) {
        System.out.println("[SMS para " + telefone + "] " + mensagem);
    }

}
