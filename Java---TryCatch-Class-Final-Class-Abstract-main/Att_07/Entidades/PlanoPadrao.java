package Java_criacao_app.Atividade_Sistemas_dia_a_dia.Att_07.Entidades;

public class PlanoPadrao extends ContaStreaming {
    private String qualidadeVideo = "Full HD";
    private int limiteTelas = 2;

    public PlanoPadrao(String nome, String email, String tipoPlano) {
        super(nome, email, tipoPlano);

    }


    @Override
    public String getEmail() {
        return super.getEmail();
    }

    @Override
    public String getTipoPlano() {
        return super.getTipoPlano();
    }

    @Override
    public String getNome() {
        return super.getNome();
    }

    @Override
    public int precoBase() {
        return super.precoBase();
    }

    @Override
    public String Recibo() {
        return "Plano Padrão preço:" + precoBase() + " Qualidade: " +qualidadeVideo+ "disponibilidade de "+limiteTelas+" telas e assistir" ;
    }
}