package Java_criacao_app.Atividade_Sistemas_dia_a_dia.Att_02.Entidades.enums;

public enum status {
    INFORMACOES_ADICIONADAS("Informações adicionadas"),
    ITEM_ADICIONADO("Item adicionado"),
    COMPRA_REALIZADA_COM_SUCESSO("Compra realizada com sucesso");

    private String descricao;
    status (String descricao){
        this.descricao=descricao;
    }
    public String getDescricao() {
        return descricao;
    }
}