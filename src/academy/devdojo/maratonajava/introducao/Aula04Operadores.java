package academy.devdojo.maratonajava.introducao;

public class Aula04Operadores {
    public static void main(String[] args){
        // + - / *
        int number01=10;
        int number02=20;
        double result = number01/(double) number02;
        System.out.println(result);

        //Aritimetical operators
        // %
        int resto = 20 % 2;
        System.out.println(resto);

        // Logical operators
        // < > >= <= == !=
        boolean isDezMaiorQueVinte = 10 > 20;
        boolean isDezMenorQueVinte = 10 < 20;
        boolean isDezIgualVinte = 10 == 20;
        boolean isDezIgualDez = 10 == 10;
        boolean isDezDiferenteDez = 10 != 10;
        System.out.println("isDezMaiorQueVinte? "+isDezMaiorQueVinte);
        System.out.println("isDezMenorQueVinte "+isDezMenorQueVinte);
        System.out.println("isDezIgualVinte "+isDezIgualVinte);
        System.out.println("isDezIgualDez "+isDezIgualDez);
        System.out.println("isDezDiferenteDez "+isDezDiferenteDez);

    }
}
