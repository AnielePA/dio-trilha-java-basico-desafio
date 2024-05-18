import java.util.Locale;
import java.util.Scanner;


public class ContaTerminal {
    public static void main(String[] args) throws Exception {
        

        @SuppressWarnings("resource")
        Scanner scanner = new Scanner(System.in).useLocale(Locale.US);

        
        System.out.println("Por favor, digite seu nome completo : ");
        String nomeCliente = scanner.nextLine();

        System.out.println("Por favor, digite o número da sua Agência : ");
        String agencia = scanner.nextLine();

        System.out.println("Por favor, digite o número da sua conta : ");
        int numeroConta = scanner.nextInt();

        System.out.println("Por favor, digite o seu saldo : ");
        double saldo = scanner.nextDouble();


        //imprimindo os dados obtidos pelo usuário
        System.out.println("Olá " + nomeCliente + ", obrigado por criar uma conta em nosso banco, sua agência é " + agencia + ", conta " + numeroConta + " e seu saldo " + saldo + " já está disponível para saque.");

    }
}
