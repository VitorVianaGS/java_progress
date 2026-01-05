package academy.devdojo.maratonajava.introducao;

public class Aula07Arrays02 {
    public static void main(String[] args) {
// byte, short, int, long, double e float por padrão em 0 quando vazio.
        // char '\u0000' ''
        // boolean false
        // String null
        // pode testar abaixo:

        char nomes[] = new char[3];
        nomes[0] = 12;
        nomes[1] = 24;
        nomes[2] = 36;
        System.out.println(nomes[0]);
        System.out.println(nomes[1]);
        System.out.println(nomes[2]);
    }
}
