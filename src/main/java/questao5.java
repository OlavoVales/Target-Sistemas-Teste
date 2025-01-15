import java.util.Scanner;

public class questao5 {
    public static void main(String[] args) {
        Scanner sc1 = new Scanner(System.in);

        System.out.print("Digite a string desejada: ");
        String stringDigitada = sc1.nextLine();

        char[] caracteres = stringDigitada.toCharArray();

        int inicio = 0;
        int fim = caracteres.length - 1;

        while (inicio < fim) {

            char temp = caracteres[inicio];
            caracteres[inicio] = caracteres[fim];
            caracteres[fim] = temp;

            inicio++;
            fim--;
        }

        String invertida = new String(caracteres);

        System.out.println("String invertida: " + invertida);

        sc1.close();
    }
}

