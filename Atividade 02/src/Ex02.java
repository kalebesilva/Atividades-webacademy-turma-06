import java.util.Scanner;

public class Ex02 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Digite a 1ª Variável: ");
        Double valor1 = scanner.nextDouble();
        System.out.println("Agora, digite a 2ª Variável: ");
        Double valor2 = scanner.nextDouble();
        System.out.println("Soma: " + (valor1+valor2));
        System.out.println("Subtração: " + (valor1-valor2));
        System.out.println("Multiplicação: " + (valor1*valor2));
        System.out.println("Divisão: " + (valor1/valor2));
    }
}
