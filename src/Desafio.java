import java.util.Scanner;

public class Desafio {
    public static void main(String[] args) {
        Scanner entrada = new Scanner(System.in);

        String nome = "Yasmin Vieira";
        String tipoConta = "Corrente";
        double saldo = 2500.0;
        int numero = 0;

        String mensagem = """
                ************************************
                Dados iniciais do cliente:
                
                Nome: \t\t\t\t%s
                Tipo conta: \t\t%s
                Saldo inicial: \t\tR$ %.2f
                ************************************
                """.formatted(nome, tipoConta, saldo);

        String mensagem2 = """
                Operações
                
                1- Consultar saldo
                2- Receber valor
                3- Transferir valor
                4- Sair
                
                Digite a opção desejada:
                """;

        System.out.println(mensagem);

        while (numero != 4) {
            System.out.println(mensagem2);
            numero = entrada.nextInt();
            if (numero == 1) {
                System.out.println("O saldo atual é R$ " + saldo);
            } else if (numero == 2) {
                System.out.println("Informe o valor a receber:");
                saldo += entrada.nextInt();
                System.out.println("Saldo atualizado R$ " + saldo);
            } else if (numero == 3) {
                System.out.println("Informe o valor que deseja transferir:");
                double valor = entrada.nextDouble();
                if (valor > saldo) {
                    System.out.println("Não há saldo suficiente para fazer essa transferência");
                } else {
                    saldo -= valor;
                    System.out.println("Saldo atualizado R$ " + saldo);
                }
            } else {
                System.out.println("Opção inválida");
            }
        }

    }
}
