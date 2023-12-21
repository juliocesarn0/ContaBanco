import java.util.Scanner;

public class ContaTerminal {
    public static void main(String[] args) {
        int numero;
        String agencia;
        String nomeCliente;
        double saldo;

        Scanner sc = new Scanner(System.in);


        System.out.println("Por favor, digite o número da Agência:");
        agencia = sc.nextLine();

        System.out.println("Por favor, digite o nome do Cliente:");
        nomeCliente = sc.nextLine();

        System.out.println("Por favor, digite o número da Conta:");
        numero = sc.nextInt();

        System.out.println("Por favor, digite o saldo da Conta:");
        saldo = sc.nextDouble();

        String msg = String.format("Olá %s, obrigado por criar uma conta em nosso banco, sua agência é %s, conta %d e seu saldo %.2f já está disponível para saque",
                nomeCliente, agencia, numero, saldo);

        System.out.println(msg);
    }

}
