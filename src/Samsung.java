package src;
public class Samsung implements ReprodutorMusical, AparelhoTelefonico, NavegadorInternet {

    @Override
    public void tocar() {
        System.out.println("Samsung: Música tocando...");
    }

    @Override
    public void pausar() {
        System.out.println("Samsung: Música pausada.");
    }

    @Override
    public void selecionarMusica(String musica) {
        System.out.println("Samsung: Selecionando a música: " + musica);
    }

    @Override
    public void ligar(String numero) {
        System.out.println("Samsung: Ligando para: " + numero);
    }

    @Override
    public void atender() {
        System.out.println("Samsung: Atendendo chamada.");
    }

    @Override
    public void iniciarCorreioVoz() {
        System.out.println("Samsung: Iniciando correio de voz.");
    }

    @Override
    public void exibirPagina(String url) {
        System.out.println("Samsung: Exibindo página: " + url);
    }

    @Override
    public void adicionarNovaAba(String url) {
        System.out.println("Samsung: Adicionando nova aba: " + url);
    }

    @Override
    public void atualizarPagina() {
        System.out.println("Samsung: Atualizando página.");
    }
}