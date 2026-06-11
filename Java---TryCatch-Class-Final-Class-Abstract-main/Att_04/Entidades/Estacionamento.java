package Att_04.Entidades;

public final class Estacionamento {
    private String placa;
    private String tipoVeiculo;
    public String getPlaca() {
        return placa;
    }
    public String getTipoVeiculo() {
        return tipoVeiculo;
    }
    public void setPlaca(String placa) {
        this.placa = placa;
    }
    public void setTipoVeiculo(String tipoVeiculo) {
        this.tipoVeiculo = tipoVeiculo;
    }

    @Override
    public String toString() {
        return "Estacionamento{" +
                "placa='" + placa +
                ", tipoVeiculo='" + tipoVeiculo ;
    }
}
