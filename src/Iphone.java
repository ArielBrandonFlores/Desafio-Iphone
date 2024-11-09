package src;
public class Iphone implements ReprodutorMusical, AparelhoTelefonico, NavegadorInternet {

    @Override
    public void tocar() {
        System.out.println("iPhone: Música tocando...");
    }

    @Override
    public void pausar() {
        System.out.println("iPhone: Música pausada.");
    }

    @Override
    public void selecionarMusica(String musica) {
        System.out.println("iPhone: Selecionando a música: " + musica);
    }

    @Override
    public void ligar(String numero) {
        System.out.println("iPhone: Ligando para: " + numero);
    }

    @Override
    public void atender() {
        System.out.println("iPhone: Atendendo chamada.");
    }

    @Override
    public void iniciarCorreioVoz() {
        System.out.println("iPhone: Iniciando correio de voz.");
    }

    @Override
    public void exibirPagina(String url) {
        System.out.println("iPhone: Exibindo página: " + url);
    }

    @Override
    public void adicionarNovaAba(String url) {
        System.out.println("iPhone: Adicionando nova aba: " + url);
    }

    @Override
    public void atualizarPagina() {
        System.out.println("iPhone: Atualizando página.");
    }
}
