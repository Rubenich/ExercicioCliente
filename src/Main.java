import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        String nome;
        String conta;
        double saldo_atual = 2500;
        double saldo_recebido = 0;
        double transferencia = 0;
        Scanner ler = new Scanner(System.in);

        System.out.println("***********************\n" +
                "Dados iniciais do cliente:\n" +
                "\n" +
                "Nome: Jacqueline Oliveira\n" +
                "Tipo conta: Corrente\n" +
                "Saldo inicial: R$ 2500,00\n" +
                "***********************");

        System.out.println("Escolha uma das operações que deseja");
        for(int i = 0; i <= 4; ++i){
            System.out.println("1 - Consultar Saldos");
            System.out.println("2 - Receber valor");
            System.out.println("3 - Transferir valor");
            System.out.println("4 - Sair");
            i = ler.nextInt();
            if( i == 1){
                System.out.println("Seu saldo é de: " +saldo_atual);
            } else if ( i == 2){
                System.out.println("Informe o valor a receber: ");
                saldo_recebido = ler.nextDouble();
                saldo_atual = saldo_recebido + saldo_atual;
                System.out.println("Seu saldo foi atualizado: " + saldo_atual);
            } else if ( i == 3){
                System.out.println("Digite o valor que deseja transferir: ");
                transferencia = ler.nextDouble();


                if( transferencia < saldo_atual){
                    saldo_atual = saldo_atual - transferencia;
                    System.out.println("Seu saldo foi atualizado: " + saldo_atual);
                } else{
                    System.out.println("Saldo insuficiente");
                }

            } else if (i == 4){
                System.out.println("Obrigado por usar o sistema");
                break;
            } else if ( i > 4){
                System.out.println("Opção Invalida ");
            }
        }
    }


}