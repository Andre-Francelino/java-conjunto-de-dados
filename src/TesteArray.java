public class TesteArray {
    public static void main(String[] args) {

        // |4999.90|0.0|0.0|
        double precos[] = new double[3];

        // Ultimo índice do Array = tamanho dele - 1;
        precos[0] = 4999.90;
        precos[2] = 3999.90;

        for (int i = 0; i < precos.length; i++){
            System.out.println(precos[i]);
        }
    }
}
