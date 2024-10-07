import java.util.Scanner;

public class Ex02 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in); // Abre o scanner
        System.out.println("Digite a 1ª Variável: ");
        Double valor1 = scanner.nextDouble(); // Leitura da 1ª vaiável
        System.out.println("Agora, digite a 2ª Variável: ");
        Double valor2 = scanner.nextDouble(); // Leitura da 2ª Variável
        System.out.println("Soma: " + (valor1+valor2)); // Soma de Variáevis
        System.out.println("Subtração: " + (valor1-valor2)); // Subtração de variáveis
        System.out.println("Multiplicação: " + (valor1*valor2)); // Multiplicação de Variáveis
        System.out.println("Divisão: " + (valor1/valor2)); // Divisão de Variáveis
    }
}
