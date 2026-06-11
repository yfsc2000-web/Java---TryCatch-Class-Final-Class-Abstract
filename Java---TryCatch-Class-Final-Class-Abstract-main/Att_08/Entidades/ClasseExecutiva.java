package Att_08.Entidades;

public class ClasseExecutiva  extends Passagem {


    private boolean servicoBordoVip = true;
    private boolean acessoSalaVip = true;

    public ClasseExecutiva(String nomePassageiro,
                           String numeroVoo,
                           double precoOriginal) {

        super(nomePassageiro, numeroVoo, precoOriginal);
    }

    public double calcularPrecoFinal() {
        return getPrecoOriginal() * 1.5;
    }

    @Override
    public String toString() {
        return "Nome: " + getNomePassageiro()
                + "\nVoo: " + getNumeroVoo()
                + "\nClasse: Executiva"
                + "\nServiço de Bordo VIP: " + (servicoBordoVip ? "Sim" : "Não")
                + "\nAcesso à Sala VIP: " + (acessoSalaVip ? "Sim" : "Não")
                + "\nBagagem: 2 malas de até 23kg inclusas"
                + "\nValor final: R$ " + calcularPrecoFinal();
    }
}

