import java.util.*;
public class ContaTerminal {
    public static void main(String[] args) throws Exception {
        int numero;
        String agencia;
        String nomeCliente;
        float saldo;

        Scanner entrada = new Scanner(System.in);

        System.out.println("Por favor, digite o Número da Conta:");
        numero = entrada.nextInt();
        entrada.nextLine(); // Consumir o \n pendente
        System.out.println("Por favor, digite o Nome da Agência:");
        agencia = entrada.nextLine();
        System.out.println("Por favor, digite o Nome do Cliente:");
        nomeCliente = entrada.nextLine();
        System.out.println("Por favor, digite o Saldo:");
        saldo = entrada.nextFloat();

        System.out.println(
                "Olá " + nomeCliente + ", obrigado por criar uma conta em nosso banco, sua agência é " + agencia
                        + ", conta " + numero + " e seu saldo " + saldo + " já está disponível para saque\".");

        entrada.close();
    }
}
