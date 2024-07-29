package JavaSintaxeDesafio;

import java.util.Scanner;

public class ContaTerminal {
    public static void main(String[] args) throws Exception {
        Scanner scan = new Scanner(System.in);

        System.out.println("Digite o número da agência:");
        String agencia = scan.next();

        System.out.println("Digite o número de usuário:");
        int numeroUsuario = scan.nextInt();

        scan.nextLine();

        System.out.println("Digite seu nome de usuário:");
        String nomeCliente = scan.nextLine();

        System.out.println("Digite o saldo da conta:");
        double saldo = scan.nextDouble();

        System.out.printf(
                "Olá %s, obrigado por criar uma conta em nosso banco, sua agência é %s, conta %s e seu saldo %.2f já está disponível para saque",
                nomeCliente, agencia, numeroUsuario, saldo
        );
    }
}