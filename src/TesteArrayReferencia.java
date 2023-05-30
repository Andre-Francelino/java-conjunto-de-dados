public class TesteArrayReferencia {

    public static void main(String[] args) {
        // |null|null|null|null|
        Produto[] produtos = new Produto[5];

        produtos[0] = new Produto("Joystick sem Fio Xbox", 469.90);
        produtos[1] = new Produto("Super Game Retro Emulador com 620 jogos", 124.90);
        produtos[2] = new Produto("Cartucho Mortal Kombat III", 49.90);
        produtos[3] = new Produto("Headset Gamer Warrior Rama P3+USB Stereo", 111.56);
        produtos[4] = new Produto("Teclado Mecânico Gamer Switch Blue Led Rgb 7 Cores", 169.90);

        for(int i = 0; i < produtos.length; i++) {
            System.out.println("Produto: " + produtos[i].getNome() + ", Preço: R$ " + produtos[i].getPreco());
        }
    }
}
