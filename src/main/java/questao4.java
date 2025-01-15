public class questao4 {

    public static void main(String[] args) {

    double SaoPaulo = 67836.43;
    double RioDeJaneiro = 36678.66;
    double MinasGerais = 29229.88;
    double EspiritoSanto = 27165.48;
    double Outros = 19849.53;

    double somaEstados = SaoPaulo + RioDeJaneiro + MinasGerais + EspiritoSanto + Outros;

    double SPemRelacaoTotal = (SaoPaulo / somaEstados) * 100;
    double RJemRelacaoTotal = (RioDeJaneiro / somaEstados) * 100;
    double MGemRelacaoTotal = (MinasGerais / somaEstados) * 100;
    double ESemRelacaoTotal = (EspiritoSanto / somaEstados) * 100;
    double OutrosEmRelacaoTotal = (Outros / somaEstados) * 100;

    System.out.println("Cada estado a a seguir representa a seguinte porcentagem de faturamento em relação ao total:");
    System.out.print("São Paulo: " + String.format("%.2f",SPemRelacaoTotal) + "%\n");
    System.out.print("Rio de Janeiro: " + String.format("%.2f",RJemRelacaoTotal) + "%\n");
    System.out.print("Minas Gerais: " + String.format("%.2f",MGemRelacaoTotal) + "%\n");
    System.out.print("Espirito Santo: " + String.format("%.2f",ESemRelacaoTotal) + "%\n");
    System.out.print("Outros: " + String.format("%.2f",OutrosEmRelacaoTotal) + "%\n");
    }
}
