package Att_03.Aplicativo;

import Att_03.Entidades.Clinica;
import Att_03.Entidades.enums.Status;


import java.util.ArrayList;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);


        System.out.println("Digite seu nome:");
        String nome = sc.nextLine();

        System.out.println("Digite o seu CPF:");
        String cpf = sc.nextLine();


        System.out.println("Qual a especialidade desejada?");
        String especialidade = sc.nextLine();

        Status status= Status.IMFORMACOES_ADICIONADAS;
        System.out.println(status.getDescricao());

        System.out.println("Horários disponíveis: 13:00 16:00 20:00");
        System.out.println("Digite o horário escolhido:");
        String horario = sc.nextLine();




        System.out.println("Deseja confirmar a consulta?");
        String consulta = sc.nextLine();

        Clinica clinica = new Clinica(nome, cpf, especialidade, horario, consulta);


        ArrayList<String> cpfsCadastrados = new ArrayList<>();

        cpfsCadastrados.add("15003557639");
        cpfsCadastrados.add("01973839636");

        try {
            if (cpfsCadastrados.contains(clinica.getCpf())) {

                System.out.println("Paciente cadastrado");

            } else {

                System.out.println("Paciente não cadastrado");
            }
        }
        catch (Exception e){
            System.out.println("Cpf inexistente");
        }

        try {
            if (clinica.getHorario().equals("13:00") ||
                    clinica.getHorario().equals("16:00") |
                            clinica.getHorario().equals("20:00"))
            {
                status= Status.VERIFICANDO_HORARIO_DISPONIVEL;
                System.out.println(status.getDescricao());

                System.out.println("Horário disponível");

            } else {

                System.out.println("Horário indisponível");
            }
        }
        catch (Exception e){
            System.out.println("Apenas números permitidos");
        }

        if (clinica.getConsulta().equalsIgnoreCase("sim")) {
            status= Status.COMSULTA_CONFIRMADA;
            System.out.println(status.getDescricao());


        } else {

            status= Status.ATENDIMENTO_ENCERRADO;
            System.out.println(status.getDescricao());
        }
    }
}

