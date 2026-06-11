package Att_04.Entidades.enums;

public enum status {
    INFORMACOES_ADICIONADAS("Informações adicionadas"),
    PAGAMENTO_NAO_AUTORIZADO("Pagamento não autorizado"),
    PAGAMENTO_REGISTRADO("Pagamento registrado."),
    SAIDA_LIBERADA("Saída liberada."),
    VEICULO_NAO_ENCONTRADO("Veículo não encontrado.");
    private String descricao;
    status(String descricao) {
        this.descricao = descricao;
    }
    public String getDescricao() {
        return descricao;
    }
}
