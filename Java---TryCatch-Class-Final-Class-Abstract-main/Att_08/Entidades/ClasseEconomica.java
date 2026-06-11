package Att_08.Entidades;

public class ClasseEconomica extends Passagem {
    private boolean despacharMala;
    private double taxaBagagem = 120.00;

    public ClasseEconomica(String nomePassageiro,
                           String numeroVoo,
                           double precoOriginal,
                           boolean despacharMala) {

        super(nomePassageiro, numeroVoo, precoOriginal);
        this.despacharMala = despacharMala;
    }

    public double calcularPrecoFinal() {
        if (despacharMala) {
            return getPrecoOriginal() + taxaBagagem;
        }

        return getPrecoOriginal();
    }

    @Override
    public String toString() {
        return "Nome: " + getNomePassageiro()
                + "\nVoo: " + getNumeroVoo()
                + "\nClasse: Econômica"
                + "\nBagagem despachada: " + (despacharMala ? "Sim" : "Não")
                + "\nBagagem de mão: 1 mochila/bolsa até 10kg"
                + "\nValor final: R$ " + calcularPrecoFinal();
    }
}

