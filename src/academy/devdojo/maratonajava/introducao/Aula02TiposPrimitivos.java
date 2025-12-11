package academy.devdojo.maratonajava.introducao;

public class Aula02TiposPrimitivos {
    static void main() {
        // int, double, float, char, byte, short,
        // long, boolean
        int age = (int)10000000000L; //fazer casting
        long bigNumber = 100000l;
        double salaryDouble = 2000;
        float salaryFloat = 2500.0f; //definir um float
        byte ageByte = 127;
        short ageShort = 32000;
        boolean verdadeiro = true;
        boolean falso = false;
        char character = '\u0041';

        String nome = "Goku";// não é um tipo primitivo
        var nome2 = "Vegeta";

        System.out.println("age: " + age);
        System.out.println(verdadeiro);
        System.out.println(salaryFloat);
        System.out.println("Oi meu nome é "+nome);
    }
}
