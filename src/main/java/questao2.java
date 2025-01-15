import java.util.Scanner;

public class questao2 {

    public static void main(String[] args) {

        Scanner sc1 = new Scanner(System.in);

        System.out.print("digite o numero que deseja saber se está ou não na sequencia de fibonacci: ");
        int numeroDigitado = sc1.nextInt();

        if (ehFibonnaci(numeroDigitado)) {
            System.out.println("O número " + numeroDigitado + " pertence à sequência de Fibonacci.");
        } else {
            System.out.println("O número " + numeroDigitado + " não pertence à sequência de Fibonacci.");
        }

        sc1.close();
    }

    static boolean ehFibonnaci (int numeroDigitado) {
        if (numeroDigitado < 0){ return false; }

        int primeiroNumero = 0;
        int segundoNumero = 1;

        if (numeroDigitado == primeiroNumero || numeroDigitado == segundoNumero) {
            return true;
        }

        while(segundoNumero < numeroDigitado){
            int numeroVariante = primeiroNumero + segundoNumero;
            primeiroNumero = segundoNumero;
            segundoNumero = numeroVariante;

            if (segundoNumero == numeroDigitado){
                return true;
            }
        }

        return false;
    }
}
