/** 
 *  Código que realiza operações aritméticas
 *  @author Samuel Dias 
 */

import java.util.Scanner;

public class Questao_1_samuel {
    public static void main(String[] args) {
        /** Cria um objeto Scanner*/
        Scanner sc = new Scanner(System.in);
        
        /** Lê dois valores inseridos pelo usuário */
        int x = sc.nextInt();
        int y = sc.nextInt();
        
        /** Faz operações aritméticas */
        int soma = x+y;
        int subtracao = x-y;
        int multiplicacao = x*y;
        double divisao = x/y;
        
        /** Imprime o resultado das operações aritméticas */
        System.out.printf("Soma: %d + %d = %d\n",x, y, soma);
        System.out.printf("Subtração: %d - %d = %d\n",x, y, subtracao);
        System.out.printf("Multiplicação: %d * %d = %d\n",x, y, multiplicacao);
        System.out.printf("Divisão: %d / %d = %.2f\n",x, y, divisao);

    }
}