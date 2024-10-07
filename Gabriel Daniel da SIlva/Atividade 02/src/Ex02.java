import java.util.Scanner;
/**
 * Aluno: Gabriel Daniel da Silva
 */
public class Ex02 {
/**
 * 
 * @param args
 */
    public static void main(String[] args) {
        /**
         * Abre o scanner:
         */
        Scanner scanner = new Scanner(System.in);
        System.out.println("Digite a 1ª Variável: ");
        /**
         * Leitura da 1ª variável
         */
        Double valor1 = scanner.nextDouble();
        System.out.println("Agora, digite a 2ª Variável: ");
        /**
         * Leitura da 2ª Variável
         */
        Double valor2 = scanner.nextDouble();
        /**
         * Soma de Variáevis
         */
        System.out.println("Soma: " + (valor1+valor2));
        /**
         * Subtração de variáveis
         */
        System.out.println("Subtração: " + (valor1-valor2));
        /**
         * Multiplicação de Variáveis
         */
        System.out.println("Multiplicação: " + (valor1*valor2));
        /**
         * Divisão de Variáveis
         */
        System.out.println("Divisão: " + (valor1/valor2));
    }
}
