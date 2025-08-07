//Calculadora com menu interativo

import java.util.Scanner;
import java.lang.Math;

public class CalculadoraIterativa {
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
