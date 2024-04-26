import java.util.Scanner;

public class ContaTerminal {
    public static void main(String[] args) {
        Scanner s = new Scanner(System.in);
        System.out.println("Por favor digite o numero da Agência! ");
        String numeroAgencia = s.nextLine();
        System.out.println("Digite o numero da conta");
        int numeroConta = s.nextInt();
        System.out.println("Digite seu nome Completo!");
        s.nextLine();
        String nomeCompleto =s.nextLine();
        System.out.println("Digite seu saldo em conta! ");
        double saldo = s.nextDouble();

        System.out.println("Olá " + nomeCompleto +", obrigado por criar uma conta em nosso banco, sua agência é "+ numeroAgencia +", conta " +numeroConta+" e seu saldo "+ saldo +" já está disponível para saque\".");
    }
}
