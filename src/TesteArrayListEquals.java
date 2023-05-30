import java.util.ArrayList;

public class TesteArrayListEquals {

    public static void main(String[] args) {
        ArrayList<Produto> lista = new ArrayList<>();

        Produto p1 = new Produto("Kit Home Studio V8S", 199);
        Produto p2 = new Produto("Controlador MIDI Panda Mini", 349.99);
        Produto p3 = new Produto("Baixo TW73 - Tagima Woodstock Series", 1590.78);
        Produto p4 = new Produto("Monitor Audio Edifier R980T", 599.99);
        Produto p5 = new Produto("Microfone Condensador AT2020", 799);
        Produto p6 = new Produto("Baixo TW73 - Tagima Woodstock Series", 1590.78);

        lista.add(p1);
        lista.add(p2);
        lista.add(p3);
        lista.add(p4);
        lista.add(p5);

        System.out.println(lista.contains(p6));
        System.out.println(lista.indexOf(p6));

        System.out.println("Referência P3: " + p3);
        System.out.println("Referência P6: " + p6);

        if (p3.equals(p6)) {
            System.out.println("São iguais");
        } else {
            System.out.println("São diferentes");
        }

    }

}
