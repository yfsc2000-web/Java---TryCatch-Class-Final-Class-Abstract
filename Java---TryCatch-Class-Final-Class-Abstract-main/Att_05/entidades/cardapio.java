package Att_05.entidades;
import java.util.ArrayList;

public final class cardapio {
    private ArrayList<produto> itens;

    public cardapio(){
        itens=new ArrayList<produto>();
        itens.add(new produto("1- Hambúrguer",25.00));
        itens.add(new produto("2- Pizza", 45.00));
        itens.add(new produto("3- Batata Frita", 15.00));
        itens.add(new produto("4- Refrigerante", 8.00));
    }
    public ArrayList<produto> getItens() {
        return itens;
    }

    @Override
    public String toString() {
        return "cardapio{" +
                "itens=" + itens;
    }
}