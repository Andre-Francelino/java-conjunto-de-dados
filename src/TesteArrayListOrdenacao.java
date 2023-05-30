import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;

public class TesteArrayListOrdenacao {

    public static void main(String[] args) {
        ArrayList<String> nomes = new ArrayList<>();


        nomes.add("Vitoria");
        nomes.add("Larissa");
        nomes.add("Nando");
        nomes.add("Ana");
        nomes.add("Grazyella");
        nomes.add("Karla");
        nomes.add("Raul");
        nomes.add("Hiago");
        nomes.add("Chico");
        nomes.add("Zacc");
        nomes.add("Daniela");
        nomes.add("André");
        nomes.add("Vinicius");
        nomes.add("Felipe");
        nomes.add("Kleber");
        nomes.add("Maria");
        nomes.add("Everson");
        nomes.add("Rebecca");
        nomes.add("Jessica");
        nomes.add("Otávio");
        nomes.add("Quemuel");
        nomes.add("Patrícia");
        nomes.add("Iohanna");
        nomes.add("Cecília");
        nomes.add("Italo");
        nomes.add("Ulysses");
        nomes.add("Andressa");
        nomes.add("Walter");
        nomes.add("Lucas");
        nomes.add("Sandy");
        nomes.add("Thiago");
        nomes.add("Xavier");
        nomes.add("Bianca");
        nomes.add("Thamires");
        nomes.add("Yasmin");
        nomes.add("Nayara");

        System.out.println("");
        System.out.println("<===== Na ordem em que os nomes foram inseridos na lista =====>");

        for (int i =0 ; i < nomes.size(); i++) {
            System.out.println(nomes.get(i));
        }


        System.out.println("");
        System.out.println("<===== Em ordem alfabética =====>");

        Collections.sort(nomes);
        for (String nome : nomes){
            System.out.println(nome);
        }

        System.out.println("<---------- Ordenação de lista de produtos pelo nome ou pelo preço---------->");

        ArrayList<Produto> produtos = new ArrayList<>();

        Produto p1 = new Produto("Kit Home Studio V8S", 199);
        Produto p2 = new Produto("Controlador MIDI Panda Mini", 349.99);
        Produto p3 = new Produto("Baixo TW73 - Tagima Woodstock Series", 1590.78);
        Produto p4 = new Produto("Monitor Audio Edifier R980T", 599.99);
        Produto p5 = new Produto("Microfone Condensador AT2020", 799);
        Produto p6 = new Produto("Violão Folk FX310AII Natural YAMAHA", 1759);

        produtos.add(p1);
        produtos.add(p2);
        produtos.add(p3);
        produtos.add(p4);
        produtos.add(p5);
        produtos.add(p6);

        Collections.sort(produtos);
        //Collections.sort(produtos, new PrecoProdutoComparator());
        //produtos.sort(new PrecoProdutoComparator());

        for (Produto produto : produtos) {
            System.out.println("Produto: " + produto.getNome() + ", Preço: " + produto.getPreco());
        }
    }
}

class PrecoProdutoComparator implements Comparator<Produto> {

    @Override
    public int compare(Produto prod1, Produto prod2) {
        return (int) (prod1.getPreco() - prod2.getPreco());
    }

}
