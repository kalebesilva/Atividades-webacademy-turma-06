
public class Atividade1_Kelvin {
    public static void main(String[] args) {
        int x = 7;
        int y = 5;
        float z = 10.5f;
        float w = 20.20f;
        double a = 100.100;
        double b = 200.200;
        //soma de dois números inteiros
        System.out.println("Soma de dois números inteiros: " + (x+y));

        //multiplicação de dois números inteiros
        System.out.println("Multiplicação de dois números inteiros: " + x*y);

        //divisão de dois números inteiros
        System.out.println("Divisão de dois números inteiros: " + x/y);

        // resto da divisão de dois números inteiros 
        System.out.println("Resto da divisão de dois números inteiros: " + x%y);

        //Soma de dois números ponto flutuante do tipo FLOAT
        System.out.println("Soma de dois números ponto flutuante do tipo FLOAT: " + (z+w));

        //Subtração de dois números ponto flutuante do tipo FLOAT
        System.out.println("Subtração de dois números ponto flutuante do tipo FLOAT: " + (z-w));

        //Divisão de dois números ponto flutuante do tipo DOUBLE
        System.out.println("Divisão de dois números ponto flutuante do tipo DOUBLE: " + (a/b));

        //Multiplicação de dois números ponto flutuante do tipo DOUBLE
        System.out.println("Multiplicação de dois números ponto flutuante do tipo DOUBLE: " + (a*b));
    }
}