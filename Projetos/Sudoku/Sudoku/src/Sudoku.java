import java.util.Scanner;

public class Sudoku {
    public static void main(String[] args) throws Exception {
        /*
         * Deve-se ter um menu interativo onde poderemos escolher entre as seguintes
         * opções:
         * 1. Iniciar um novo o jogo: Deve-se exibir na tela o jogo inicial, com os
         * espaços preenchidos somente pelos números iniciais (usar os args do método
         * main para informar os números iniciais e suas devidas posições);
         * 
         * 2. Colocar um novo número: Deve-se solicitar as seguintes informações do
         * jogador (número a ser colocado, indice horizontal e indice vertical do
         * número), não se deve permitir que seja colocado um número em uma posição que
         * já esteja preenchida ( seja número fixo ou informado pelo jogador);
         * 
         * 3. Remover um número: deve-se solicitar os índices verticais e horizontais do
         * número que deseja remover ( caso o número seja um número fixo do jogo deve-se
         * exibir uma mensagem informado que o número não pode ser removido);
         * 
         * 4. Verificar jogo: Vizualizar a situação atual do jogo;
         * 
         * 5. Verificar status do jogo: Deve-se verificar o status atual do jogo ( não
         * iniciado, incompleto e completo) e se contém ou não erros ( o jogo está
         * errado quando tem números em posições conflitantes) todos os status do jogo
         * podem conter ou não erros, exceto o status não iniciado que é sempre sem
         * erro;
         * 6. Limpar: remove todos os números informados pelo usuário e mantém os fixos
         * do jogo;
         * 
         * 7. finalizar o jogo: Se o jogo estiver com todos os espaços preenchidos de
         * forma válida o jogo é encerrado, senão informar ao usuário que ele deve
         * preencher todos os espaços com seus respectivos números;
         */

        Scanner entrada = new Scanner(System.in);
        int op = -1;
        float n1, n2, resultado = 0;
        PosiçaoTabuleiro tabuleiro = null;
        while (op != 0) {
            System.out.println(
                    "Digite uma opção:\n1-Iniciar um novo o jogo\n2-Colocar um novo número\n3-Remover um número\n4-Verificar status do jogo\n5-Limpar\n6-Finalizar o jogo");
            op = entrada.nextInt();
            switch (op) {
                case 1:// Iniciar um novo o jogo

                    tabuleiro = new PosiçaoTabuleiro();
                    tabuleiro.mostrarTabuleiro();
                    break;
                case 2: // Colocar um novo número
                    System.out.println("Número a ser colocado: ");
                    int num = entrada.nextInt();
                    System.out.println("Índice horizontal: ");
                    int horizontal = entrada.nextInt();
                    System.out.println("Índice vertical: ");
                    int vertical = entrada.nextInt();
                    if (tabuleiro.tabuleiro[vertical][horizontal].getValor() == -1) {
                        System.out.println("Não é possível adicionar um número em uma posição já preenchida.");
                    } else if (num > 9 || num < 1) {
                        System.out.println("Número inválido."); //criar exception

                    } else {
                        tabuleiro.tabuleiro[vertical][horizontal].setValor(num);
                        tabuleiro.tabuleiro[vertical][horizontal].setFixo(false);
                    }
                    break;
                case 3: // Remover um número
                    /*
                     * Remover um número: deve-se solicitar os índices verticais e horizontais do
                     * número que deseja remover ( caso o número seja um número fixo do jogo deve-se
                     * exibir uma mensagem informado que o número não pode ser removido);
                     */
                    System.out.println("Índice horizontal: ");
                    horizontal = entrada.nextInt();
                    System.out.println("Índice vertical: ");
                    vertical = entrada.nextInt();
                    if (tabuleiro.tabuleiro[vertical][horizontal].getValor() == -1) {
                        System.out.println("Posição vazia.");
                    } else {
                        tabuleiro.tabuleiro[vertical][horizontal].setValor(-1);//criar isVazio
                        tabuleiro.tabuleiro[vertical][horizontal].setFixo(false);
                    }

                    break;
                case 4: // Divisão
                    /*
                     * Verificar status do jogo: Deve-se verificar o status atual do jogo ( não
                     * iniciado, incompleto e completo) e se contém ou não erros ( o jogo está
                     * errado quando tem números em posições conflitantes) todos os status do jogo
                     * podem conter ou não erros, exceto o status não iniciado que é sempre sem
                     * erro;
                     */
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
