import java.util.*;

public class Main {
     public static void main(String[] args) {
          Scanner entrada = new Scanner(System.in);
          Iphone celular = new Iphone();
          // menu
          int op = -1;
          while (op != 0) {
               System.out.println(
                         "Escolha uma funcionalidade:\n1-IPod\n2-Navegar na Web\n3-Telefonar\n0-Desligar IPhone");
               op = entrada.nextInt();
               switch (op) {
                    case 1:
                         int op2 = -1;
                         while (op2 != 0) {
                              System.out.println(
                                        "O que deseja fazer:\n1-Tocar música\n2-Selecionar música\n3-Pausar música\n0-Mudar funcionalidade");
                              op2 = entrada.nextInt();
                              switch (op2) {
                                   case 1:
                                        celular.tocar();
                                        break;
                                   case 2:
                                        String str = entrada.nextLine();
                                        str = entrada.nextLine();
                                        celular.selecionarMusica(str);
                                        break;
                                   case 3:
                                        celular.pausar();
                                        break;
                                   case 0:
                                        break;
                                   default:
                                        System.out.println("Opção inválida!");
                                        break;
                              }
                         }
                         break;
                    case 2:
                         op2 = -1;
                         while (op2 != 0) {
                              System.out.println(
                                        "O que deseja fazer:\n1-Exibir Página\n2-Adicionar Nova Aba\n3-Atualizar Página\n0-Mudar funcionalidade");
                              op2 = entrada.nextInt();
                              switch (op2) {
                                   case 1:
                                        String str = entrada.nextLine();
                                        str = entrada.nextLine();
                                        celular.exibirPagina(str);
                                        break;
                                   case 2:
                                        celular.adicionarNovaAba();
                                        break;
                                   case 3:
                                        celular.atualizarPagina();
                                        break;
                                   case 0:
                                        break;
                                   default:
                                        System.out.println("Opção inválida!");
                                        break;
                              }
                         }
                         break;
                    case 3:
                         op2 = -1;
                         while (op2 != 0) {
                              System.out.println(
                                        "O que deseja fazer:\n1-Ligar para um número\n2-Atender ligação\n3-Iniciar Correio de voz\n0-Mudar funcionalidade");
                              op2 = entrada.nextInt();
                              switch (op2) {
                                   case 1:
                                        String str = entrada.nextLine();
                                        str = entrada.nextLine();
                                        celular.ligar(str);
                                        break;
                                   case 2:
                                        celular.atender();
                                        break;
                                   case 3:
                                        celular.iniciarCorreioVoz();
                                        break;
                                   case 0:
                                        break;
                                   default:
                                        System.out.println("Opção inválida!");
                                        break;
                              }
                         }
                         break;
                    case 0:
                         System.out.println("Desligando Iphone...");
                         break;
                    default:
                    System.out.println("Opção inválida!");
                         break;
               }
          }
          entrada.close();
     }

}
