package Luis_Brito;
import java.util.Scanner;
/**
 * Atividade 2
 */
public class QuatroOperacoes {
    public static void main(String[] args) {
        System.out.println("Soma = x+y\nSubtração = x-y\nMultiplicação = x*y\nDivisao = x/y");
        
        /**
         * Scaneia as entradas
         */
        
         
        Scanner scanner = new Scanner(System.in);
        System.out.println("Digite a variavel x:");
        Double x = scanner.nextDouble();
        System.out.println("Digite a variavel y:");
        Double y = scanner.nextDouble();
        scanner.close();

        /**
         * soma as entradas
         */
        double soma = x+y;
        System.out.printf("Soma = %.2f\n", soma);

        /**
         * subtrai as entradas
         */
        double subtracao = x-y;
        System.out.printf("Subtração = %.2f\n", subtracao);

        /**
         * multiplica as entradas
         */
        double multiplicacao = x*y;
        System.out.printf("Multiplicação = %.2f\n", multiplicacao);

        /**
         * divide as entradas
         */
        double divisao = x/y;
        if (x==0){
            divisao = 0;
        } 
        System.out.printf("Divisão = %.2f", divisao);

    }
    
}
