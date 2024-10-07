import java.util.Scanner;

public class Atividade2 {

    public int soma(int x, int y) {
        return x + y; /** realiza a soma */
    }

    public Integer subtracao(Integer x, Integer y) {
        return x - y; /** realiza a subtração */
    }

    public Integer multiplicacao(Integer x, Integer y) {
        return x * y; /** realiza a multiplicação */
    }

    public Integer divisao(Integer x, Integer y) {
        return x / y; /** realiza a divisão */
    }

    /**
     * 
     * @param args
     * @throws Exception
     */
    
    public static void main(String[] args) throws Exception {

        Scanner scanner = new Scanner(System.in);
        System.out.print("Digite o primeiro número: ");
        int a = scanner.nextInt();
        System.out.print("Digite o segundo número: ");
        int b = scanner.nextInt();

        Atividade2 aux = new Atividade2(); 
        System.out.println("Soma: " + aux.soma(a, b)); 
        System.out.println("Subtração: " + aux.subtracao(a, b)); 
        System.out.println("Multiplicação: " + aux.multiplicacao(a, b));
        System.out.println("Divisão: " + aux.divisao(a, b)); 
    }
}

