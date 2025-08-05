import java.util.Scanner;
import java.lang.Math;

public class CalculadoraIterativa {
    /*
     * Calculadora com menu interativo
     * Escreva um código para criação de uma calculadora para resolver operações
     * básicas ( soma, subtração, divisão e multiplicação) se atentando com os
     * seguintes requisitos:
     * 
     * A calculadora deve ter um menu onde o usuário informa o que deseja fazer
     * (pelo número da opção) e após realizar a operação retornar ao menu enquanto
     * ele não selecionar a opção de sair, as opções disponíveis devem ser as
     * seguintes:
     * 
     * Realizar uma soma;
     * Realizar uma subtração;
     * Realizar uma multiplicação;
     * Realizar uma divisão (utilizar variavel com pontos flutuantes para retornar
     * divisão e resto do calculo);
     * Elever um número a uma potência N;
     * Sair da calculadora.
     * (Opcional) Para as operações de subtração e soma após o usuário informar os 2
     * primeiros números disponibilizar um submenu com as seguintes opções:
     * 
     * Informar mais números para continuar a soma/subtração: Quando o usuário
     * selecionar essa opção o código deve solicitar um novo número que sera usado
     * para somar/subtrair com o resultado da operação selecionada ( ele poderá
     * entrar nesse menu quantas vezes desejar utilizando o resultado);
     * Sair da operação: Encerrar a operação e voltar para o menu principal da
     * calculadora;
     */
    public static void main(String[] args) throws Exception {
        Scanner entrada = new Scanner(System.in);
        int op = -1;
        float n1, n2, resultado = 0;
        while (op != 0) {
            System.out.println(
                    "Digite uma opção:\n1-Soma\n2-Subtração\n3-Multiplicação\n4-Divisão\n5-Potenciação\n0-Sair");
            op = entrada.nextInt();
            switch (op) {
                case 1:// Soma
                    System.out.println("Digite o primeiro número: ");
                    n1 = entrada.nextFloat();
                    System.out.println("Digite o segundo número: ");
                    n2 = entrada.nextFloat();
                    resultado = n1 + n2;
                    int op2 = 0;
                    while (op2 != 2) {
                        System.out.println("Resultado: " + resultado);
                        System.out.println("Digite uma opção:\n1-Informar mais números para continuar a soma\n2-Sair");
                        op2 = entrada.nextInt();
                        if (op2 == 1) {
                            System.out.println("Digite o próximo número: ");
                            resultado += entrada.nextFloat();
                        }
                    }
                    break;
                case 2: // Subtração
                    System.out.println("Digite o primeiro número: ");
                    n1 = entrada.nextFloat();
                    System.out.println("Digite o segundo número: ");
                    n2 = entrada.nextFloat();
                    resultado = n1 - n2;
                    op2 = 0;
                    while (op2 != 2) {
                        System.out.println("Resultado: " + resultado);
                        System.out.println(
                                "Digite uma opção:\n1-Informar mais números para continuar a subtração\n2-Sair");
                        op2 = entrada.nextInt();
                        if (op2 == 1) {
                            System.out.println("Digite o próximo número: ");
                            resultado -= entrada.nextFloat();
                        }
                    }
                    break;
                case 3: // Multiplicação
                    System.out.println("Digite o primeiro número: ");
                    n1 = entrada.nextFloat();
                    System.out.println("Digite o segundo número: ");
                    n2 = entrada.nextFloat();
                    resultado = n1 * n2;
                    System.out.println("Resultado: " + resultado);
                    break;
                case 4: // Divisão
                    System.out.println("Digite o primeiro número: ");
                    n1 = entrada.nextFloat();
                    System.out.println("Digite o segundo número: ");
                    n2 = entrada.nextFloat();
                    resultado = n1 / n2;
                    System.out.println("Resultado: " + resultado);
                    break;
                case 5: // Potenciação
                    System.out.println("Digite a base: ");
                    double base = entrada.nextFloat();
                    System.out.println("Digite o expoente: ");
                    double expoente = entrada.nextFloat();
                    double result = Math.pow(base, expoente);
                    System.out.println("Resultado: " + result);
                    break;
                case 0:
                    System.out.println("Saindo...");
                    break;
                default:
                    System.out.println("Opção inválida, digite novamente.");
                    break;
            }

        }
        entrada.close();
    }
}
