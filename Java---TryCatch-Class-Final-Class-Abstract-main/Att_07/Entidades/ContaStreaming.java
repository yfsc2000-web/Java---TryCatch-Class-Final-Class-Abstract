package Java_criacao_app.Atividade_Sistemas_dia_a_dia.Att_07.Entidades;

public class ContaStreaming {
    private String nome;
    private String email;
    private String tipoPlano;

    public ContaStreaming(String nome, String email, String tipoPlano) {
        this.nome = nome;
        this.email = email;
        this.tipoPlano = tipoPlano;
    }
    public String getNome() {
        return nome;
    }
    public void setNome(String nome) {
        this.nome = nome;
    }
    public String getEmail() {
        return email;
    }
    public void setEmail(String email) {
        this.email = email;
    }
    public String getTipoPlano() {
        return tipoPlano;
    }
    public void setTipoPlano(String tipoPlano) {
        this.tipoPlano = tipoPlano;
    }

    public String escolha() {
        if (tipoPlano.equalsIgnoreCase("Padrão")) {
            return "Plano padrão escolhido";
        }
        else if (tipoPlano.equalsIgnoreCase("Premium")) {
            return "Plano premium escolhido";
        }
        else {
            return "ERRO";
        }
    }
    public String Recibo(){
        return "Informações da conta";
    }

    public int precoBase(){
        return 30;
    }
}

