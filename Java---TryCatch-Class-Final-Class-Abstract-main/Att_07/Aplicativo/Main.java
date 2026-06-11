package Java_criacao_app.Atividade_Sistemas_dia_a_dia.Att_07.Aplicativo;
import Java_criacao_app.Atividade_Sistemas_dia_a_dia.Att_07.Entidades.ContaStreaming;
import Java_criacao_app.Atividade_Sistemas_dia_a_dia.Att_07.Entidades.PlanoPadrao;
import Java_criacao_app.Atividade_Sistemas_dia_a_dia.Att_07.Entidades.PlanoPremium;

import java.util.InputMismatchException;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner sc= new Scanner(System.in);


        System.out.println("Digite seu nome de usuario");
        String nome = (sc.nextLine());
        System.out.println("Digite o seu email");
        String email= (sc.nextLine());
        System.out.println("Qual plano deseja assinar? Padrão/Premium");
        String tipoPlano=(sc.nextLine());
        ContaStreaming contaStreaming = new ContaStreaming(nome, email, tipoPlano);

        PlanoPremium planoPremium = new PlanoPremium(nome, email, tipoPlano);

        PlanoPadrao planoPadrao = new PlanoPadrao(nome, email, tipoPlano);

        try {
            if (tipoPlano.equalsIgnoreCase("Padrão")) {
                System.out.println(planoPadrao.Recibo());
            } else if (tipoPlano.equalsIgnoreCase("Premium")) {
                System.out.println(planoPremium.Recibo());
            } else {
                System.out.println("Plano inválido.");
            }
        }catch (InputMismatchException e) {
            System.out.println("Erro: valor inválido. Digite apenas números.");
        }

    }
}
