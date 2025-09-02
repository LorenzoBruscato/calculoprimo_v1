package principal;

public class Principal {

    public static boolean ePrimo(long inicio, long fim) {
        int conta = 0;
        int metade = (int) Math.sqrt(inicio);
        for (long j = metade; j >= fim; j--) {
            if (inicio % j == 0) {
                return false;
            }
        }
        return true;
    }

    public static void main(String[] args) {
        long inicio = 5;
        long fim = 25;

        for (long i = inicio; i <= fim; i++) {
            if (ePrimo(i, 2)) {
                System.out.println(i + " é primo");
            }

        }
    }
}
