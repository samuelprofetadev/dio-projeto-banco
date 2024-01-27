import java.util.Locale;
import java.util.Scanner;

public class ContaTerminal {
    public static void main(String[] args) {
        //TODO:Conhecer e importar a classe scanner
        Scanner sc = new Scanner(System.in).useLocale(Locale.US);

        // Exibir as mensagens para o nosso usuário e obter pela classe scanner os valores digitados no terminal
        System.out.println("Por favor, digite o número da Conta: ");
        int numero = sc.nextInt();

        System.out.println("Digite o número da Agência: ");
        String agencia = sc.next();

        System.out.println("Digite seu nome completo: ");
        String primeiroNome = sc.nextLine();
        String segundoNome = sc.nextLine();

        String nomeCompleto = primeiroNome.concat(" ").concat(segundoNome);

        System.out.println("Digite seu saldo: ");
        double saldo = sc.nextDouble();

        // Exibir a mensagem criada

        System.out.printf("Olá %s, obrigado por criar uma conta em nosso banco, sua agência é %s, conta %d e seu saldo %.2f já está disponivel para saque", nomeCompleto, agencia, numero, saldo);



    }
}
