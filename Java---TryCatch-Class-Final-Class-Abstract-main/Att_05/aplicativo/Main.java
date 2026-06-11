package Att_05.aplicativo;
import Att_05.entidades.login;
import Att_05.entidades.cardapio;
import Att_05.entidades.enums.StatusPagamento;
import Att_05.entidades.pagamento;
import Att_05.entidades.produto;

import java.util.Random;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        Random random = new Random();
        pagamento pagamento = new pagamento();

        System.out.println("Digite seu email");
        String email = sc.nextLine();
        System.out.println("Digite sua senha");
        String senha = sc.nextLine();
        login login = new login(email, senha);
        try {
            if (login.getEmail().isEmpty()) {
                System.out.println("Usuários ou senha inválidos.");
                System.exit(0);
            } else {
                cardapio cardapio = new cardapio();

                System.out.println("Cardapio:");
                for (produto produtos : cardapio.getItens()) {
                    System.out.println(produtos.getNome() + " R$ " + produtos.getPreco());
                }
                String resposta;
                do {
                    System.out.println("Coloque o número do produto desejado");
                    int escolha = sc.nextInt();
                    sc.nextLine();
                    produto escolhido = cardapio.getItens().get(escolha - 1);
                    pagamento.adicionarValor(escolhido.getPreco());

                    System.out.println("Produto " + escolhido.getNome() + " escolhido");
                    System.out.println("Deseja adicionar outro produto?");
                    resposta = sc.nextLine();
                } while (resposta.equalsIgnoreCase("Sim"));
                System.out.println("O total da compra será " + pagamento.getTotalCompra() + " RS");
                pagamento.taxaIntrega();
                System.out.println("Escolha a forma de pagamento");
                pagamento.setFormaPagamento(sc.nextLine());

                System.out.println("O pagamento foi aprovado?");
                pagamento.setPagamentoAceito(sc.nextLine());
                if (pagamento.getPagamentoAceito().equalsIgnoreCase("Sim")) {
                    System.out.println("Pagamento aceito");
                    //perguntar ao professor como eu simulo um pagamento nao aceito sem boleana//
                    pagamento.setNumeroPedido(random.nextInt(1000));
                    System.out.println("O número do pedido será " + pagamento.getNumeroPedido());
                    StatusPagamento status = StatusPagamento.REGISTRADO;
                    System.out.println(status);

                    status = StatusPagamento.ENVIADO_PARA_COZINHA;
                    System.out.println(status);

                    status = StatusPagamento.SAIU_PARA_ENTREGA;
                    System.out.println(status);

                    status = StatusPagamento.ENTREGANDO;
                    System.out.println(status);

                    System.out.println("Pedido realizado com sucesso");
                } else {
                    System.out.println("Pagamento não autorizado.");
                    System.exit(0);
                }

            }
        } catch (Exception e) {
            System.out.println("Resposta inválida!");
        }
    }
}

