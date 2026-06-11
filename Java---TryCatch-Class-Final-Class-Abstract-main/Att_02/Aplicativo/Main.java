package Java_criacao_app.Atividade_Sistemas_dia_a_dia.Att_02.Aplicativo;

import Java_criacao_app.Atividade_Sistemas_dia_a_dia.Att_02.Entidades.Cliente;
import Java_criacao_app.Atividade_Sistemas_dia_a_dia.Att_02.Entidades.Compra;
import Java_criacao_app.Atividade_Sistemas_dia_a_dia.Att_02.Entidades.enums.status;

import java.util.InputMismatchException;
import java.util.Locale;
import java.util.Random;
import java.util.Scanner;

public class Main {
    static void main(String[] args) {
        Locale.setDefault(Locale.US);
        Scanner sc=new Scanner(System.in);

        Compra compra= new Compra("", 0, 0, 0, "", "", 0, "");

        Random random=new Random();

        System.out.println("Qual e a forma de pagamento?");
        String forma_pagamento= sc.nextLine();

        System.out.println("Digite seu nome:");
        String nome= sc.nextLine();

        System.out.println("Digite seu CPF:");
        String CPF= sc.nextLine();

        System.out.println("Digite sua rua:");
        String rua = sc.nextLine();

        System.out.println("Digite seu bairro:");
        String bairro= sc.nextLine();


        System.out.println("Digite o número da sua casa:");
        int numero_Casa= sc.nextInt();

        Cliente cliente = new Cliente(nome,CPF,rua,bairro,numero_Casa);
        sc.nextLine();
        status status= Java_criacao_app.Atividade_Sistemas_dia_a_dia.Att_02.Entidades.enums.status.INFORMACOES_ADICIONADAS;
        System.out.println(status.getDescricao());

        compra.adicinoraitem();
        status= Java_criacao_app.Atividade_Sistemas_dia_a_dia.Att_02.Entidades.enums.status.ITEM_ADICIONADO;
        System.out.println(status.getDescricao());

        compra.calcularfrete();


        if (compra.getPagamento_aceito().equalsIgnoreCase("Sim")){
            compra.setCod_pedido(random.nextInt(1000));

            System.out.println("O código do pegido será: "+compra.getCod_pedido());
            System.out.println("Deseja concluir essa compra?");
            compra.setConfirmacao_compra(sc.nextLine());
            try {
                if (compra.getConfirmacao_compra().equalsIgnoreCase("Sim")){
                    status= Java_criacao_app.Atividade_Sistemas_dia_a_dia.Att_02.Entidades.enums.status.COMPRA_REALIZADA_COM_SUCESSO;
                    System.out.println(status.getDescricao());
                }
                else {
                    System.out.println("Compra cancelada.");
                }
            }
            catch(InputMismatchException e) {
                System.out.println("Erro: valor inválido");
            }
        }
        else {
            System.out.println("Pagamento não autorizado.");

        }
}   }
