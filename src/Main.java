package src;
public class Main {
    public static void main(String[] args) {
        // Criando instâncias dos dispositivos
        Iphone iphone = new Iphone();
        Samsung samsung = new Samsung();

        // Testando funcionalidades do iPhone
        System.out.println("Testando iPhone:");
        iphone.selecionarMusica("Shape of You");
        iphone.tocar();
        iphone.pausar();
        iphone.ligar("123456789");
        iphone.atender();
        iphone.iniciarCorreioVoz();
        iphone.exibirPagina("www.apple.com");
        iphone.adicionarNovaAba("www.apple.com/support");
        iphone.atualizarPagina();
        
        System.out.println("\n-------------------------\n");

        // Testando funcionalidades do Samsung
        System.out.println("Testando Samsung:");
        samsung.selecionarMusica("Despacito");
        samsung.tocar();
        samsung.pausar();
        samsung.ligar("987654321");
        samsung.atender();
        samsung.iniciarCorreioVoz();
        samsung.exibirPagina("www.samsung.com");
        samsung.adicionarNovaAba("www.samsung.com/support");
        samsung.atualizarPagina();
    }
}