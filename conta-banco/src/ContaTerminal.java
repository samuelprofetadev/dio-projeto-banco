import java.util.Locale;
import java.util.Scanner;

public class ContaTerminal {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in).useLocale(Locale.US);

        System.out.println("Por favor, digite o número da Conta: ");
        int numero = sc.nextInt();

        System.out.println("Digite o número da Agência: ");
        String agencia = sc.next();

        System.out.println("Digite seu nome: ");
        String nome = sc.next();

        System.out.println("Digite seu saldo: ");
        double saldo = sc.nextDouble();

        System.out.println(numero);
        System.out.println(nome);
        System.out.println(saldo);
        System.out.println(agencia);




    }
}
