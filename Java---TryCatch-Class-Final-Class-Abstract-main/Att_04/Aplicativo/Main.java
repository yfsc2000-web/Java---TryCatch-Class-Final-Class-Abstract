package Att_04.Aplicativo;

import Att_04.Entidades.Estacionamento;
import Att_04.Entidades.enums.status;

import java.time.Duration;
import java.time.LocalDateTime;
import java.util.Scanner;


public class Main {

    public static void main(String[] args) {

        Estacionamento estacionamento = new Estacionamento();
        Scanner sc = new Scanner(System.in);

        int vagasDisponiveis = 2;

        System.out.print("Digite a placa do veículo: ");
        estacionamento.setPlaca(sc.nextLine());

        System.out.print("Digite o tipo do veículo (carro/moto): ");
        estacionamento.setTipoVeiculo(sc.nextLine());

        status status  = Att_04.Entidades.enums.status.INFORMACOES_ADICIONADAS;
        System.out.println(status.getDescricao());


        if (vagasDisponiveis <= 0) {
            System.out.println("Estacionamento lotado.");
            return;
        }

        LocalDateTime dataHoraEntrada = LocalDateTime.now();

        System.out.println("Placa: " + estacionamento.getPlaca());
        System.out.println("Tipo: " + estacionamento.getTipoVeiculo());
        System.out.println("Entrada: " + dataHoraEntrada);

        System.out.print("Informe a placa do veículo: ");
        String placaSaida = sc.nextLine();

        if (placaSaida.equalsIgnoreCase(estacionamento.getPlaca())) {

            LocalDateTime dataHoraSaida = LocalDateTime.now();

            long horasEstacionadas =
                    Duration.between(dataHoraEntrada, dataHoraSaida).toHours();

            if (horasEstacionadas < 1) {
                horasEstacionadas = 1;
            }

            double valorTotal = 10;

            if (horasEstacionadas > 1) {
                valorTotal = valorTotal + ((horasEstacionadas - 1) * 5);
            }

            System.out.println("Saída: " + dataHoraSaida);
            System.out.println("Tempo estacionado: " + horasEstacionadas + " hora(s)");
            System.out.println("Valor total: R$ " + valorTotal);

            System.out.print("Pagamento aprovado? (sim/nao): ");
            String pagamento = sc.nextLine();

            try {
                if (pagamento.equalsIgnoreCase("não")) {
                    status= Att_04.Entidades.enums.status.PAGAMENTO_NAO_AUTORIZADO;
                    System.out.println(status.getDescricao());

                } else {
                    vagasDisponiveis++;
                    status= Att_04.Entidades.enums.status.PAGAMENTO_REGISTRADO;
                    System.out.println(status.getDescricao());

                    status= Att_04.Entidades.enums.status.SAIDA_LIBERADA;
                    System.out.println(status.getDescricao());
                }
            } catch (Exception e){
                System.out.println("ERRO! ");
            }

        } else  {
            status= Att_04.Entidades.enums.status.VEICULO_NAO_ENCONTRADO;
            System.out.println(status.getDescricao());
        }
    }
}
