public class TabuleiroSudoku {
     private int posVertical;
     private int posHorizontal;
     private int valor;
     private boolean isFixo;

     public TabuleiroSudoku() {
          this.posVertical = -1;
          this.posHorizontal = -1;
          this.valor = -1;
          this.isFixo = false;
     }
     public TabuleiroSudoku(int posVertical, int posHorizontal, int valor) {
          this.posVertical = posVertical;
          this.posHorizontal = posHorizontal;
          this.valor = valor;
     }
     public TabuleiroSudoku(int posVertical, int posHorizontal, int valor, boolean isFixo) {
          this.posVertical = posVertical;
          this.posHorizontal = posHorizontal;
          this.valor = valor;
          this.isFixo = isFixo;
     }
     
     public boolean getisFixo() {
          return isFixo;
     }
     public void setFixo(boolean isFixo) {
          this.isFixo = isFixo;
     }
     public int getPosVertical() {
          return posVertical;
     }
     public void setPosVertical(int posVertical) {
          this.posVertical = posVertical;
     }
     public int getPosHorizontal() {
          return posHorizontal;
     }
     public void setPosHorizontal(int posHorizontal) {
          this.posHorizontal = posHorizontal;
     }
     public int getValor() {
          return valor;
     }
     public void setValor(int valor) {
          this.valor = valor;
     }
}
