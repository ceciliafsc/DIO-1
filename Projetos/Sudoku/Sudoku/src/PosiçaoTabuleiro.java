public class PosiçaoTabuleiro {
     public TabuleiroSudoku[][] tabuleiro = new TabuleiroSudoku[8][8];

     public PosiçaoTabuleiro() {
          iniciarTabuleiro();
     }

     public void mostrarTabuleiro() {
          for (int i = 0; i < tabuleiro.length; i++) {
               for (int j = 0; j < tabuleiro[i].length; j++) {
                    if (tabuleiro[i][j].isFixo()) {
                         System.out.print(tabuleiro[i][j].getValor() + " ");
                    } else {
                         System.out.print(" . ");
                    }
               }
               System.out.println();
          }
     }

     public void iniciarTabuleiro() {
          for (int i = 0; i < tabuleiro.length; i++) {
               for (int j = 0; j < tabuleiro[i].length; j++) {
                    tabuleiro[i][j] = new TabuleiroSudoku();
               }

          }
          // defina os valores fixos do Sudoku
          adicionarFixo(0, 0, 5);
          adicionarFixo(0, 1, 3);
          adicionarFixo(0, 4, 7);

          adicionarFixo(1, 0, 6);
          adicionarFixo(1, 3, 1);
          adicionarFixo(1, 4, 9);
          adicionarFixo(1, 5, 5);

          adicionarFixo(2, 1, 9);
          adicionarFixo(2, 2, 8);
          adicionarFixo(2, 7, 6);

          adicionarFixo(3, 0, 8);
          adicionarFixo(3, 4, 6);
          adicionarFixo(3, 8, 3);

          adicionarFixo(4, 0, 4);
          adicionarFixo(4, 3, 8);
          adicionarFixo(4, 5, 3);
          adicionarFixo(4, 8, 1);

          adicionarFixo(5, 0, 7);
          adicionarFixo(5, 4, 2);
          adicionarFixo(5, 8, 6);

          adicionarFixo(6, 1, 6);
          adicionarFixo(6, 6, 2);
          adicionarFixo(6, 7, 8);

          adicionarFixo(7, 3, 4);
          adicionarFixo(7, 4, 1);
          adicionarFixo(7, 5, 9);
          adicionarFixo(7, 8, 5);

          adicionarFixo(8, 4, 8);
          adicionarFixo(8, 7, 7);
          adicionarFixo(8, 8, 9);
     }

     private void adicionarFixo(int linha, int coluna, int valor) {
          tabuleiro[linha][coluna] = new TabuleiroSudoku(linha, coluna, valor, true);
     }

}
