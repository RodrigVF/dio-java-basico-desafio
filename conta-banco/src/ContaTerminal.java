import java.util.Scanner;

public class ContaTerminal {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.println("Por favor, preencha os seguintes campos.");

        System.out.print("Número da conta: ");
        int numero = scanner.nextInt();

        System.out.print("Número da agência: ");
        String agencia = scanner.next();

        scanner.nextLine(); // Consumir a nova linha pendente

        System.out.print("Nome do cliente: ");
        String nomeCliente = scanner.nextLine();

        System.out.print("Saldo inicial: ");
        double saldo = scanner.nextDouble();

        System.out.println("\nOlá " + nomeCliente + ", obrigado por criar uma conta em nosso banco.");
        System.out.printf("Sua agência é %s, conta %d e seu saldo %.2f já está disponível para saque.%n", agencia, numero, saldo);

        scanner.close();
    }
}