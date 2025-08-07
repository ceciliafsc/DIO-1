public class Iphone implements Ipod, Navegador, Telefone {
     // Ipod
     @Override
     public void tocar() {
          System.out.println("Tocando Parabéns para você...");
          System.out.println("Parabéns pra você\r\n" + //
                    "Nesta data querida\r\n" + //
                    "Muitas felicidades\r\n" + //
                    "Muitos anos de vida\r\n" + //
                    "\r\n" + //
                    "É pique, é pique\r\n" + //
                    "É pique, é pique, é pique\r\n" + //
                    "É hora, é hora\r\n" + //
                    "É hora, é hora, é hora\r\n" + //
                    "Ra-tim-bum!");
     }

     @Override
     public void pausar() {
          System.out.println("Música pausada.");
     }

     @Override
     public void selecionarMusica(String musica) {
          System.out.println("Tocando " + musica + "...");
     }

     // Navegador
     @Override
     public void exibirPagina(String url) {
          System.out.println("Exibindo a página " + url);
     }

     @Override
     public void adicionarNovaAba() {
          System.out.println("Nova aba adicionada!");
     }

     @Override
     public void atualizarPagina() {
          System.out.println("Página atualizada!");
     }

     // Telefone
     public void ligar(String numero) {
          System.out.println("Ligando para  número " + numero + "...");
     }

     public void atender() {
          System.out.println("Atendendo a ligação...");
     }

     public void iniciarCorreioVoz() {
          System.out.println("Iniciando correio de voz...");
     } 
     
}
