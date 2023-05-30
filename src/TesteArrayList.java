import java.util.ArrayList;

public class TesteArrayList {

    public static void main(String[] args) {
        ArrayList lista = new ArrayList();

        Produto p1 = new Produto("Kit Home Studio V8S", 199);
        Produto p2 = new Produto("Controlador MIDI Panda Mini", 349.99);
        Produto p3 = new Produto("Baixo TW73", 1590.78);
        Produto p4 = new Produto("Monitor Audio Edifier R980T", 599.99);
        Produto p5 = new Produto("Microfone Condensador AT2020", 799);

        lista.add(p1);
        lista.add(p2);
        lista.add(p3);
        lista.add(p4);
        lista.add(p5);

        Produto kit = (Produto) lista.get(0);

        // Produto@3b07d329
        System.out.println("Nome do produto: " + kit.getNome());
        System.out.println("Preço do produto: " + kit.getPreco());

    }

}
