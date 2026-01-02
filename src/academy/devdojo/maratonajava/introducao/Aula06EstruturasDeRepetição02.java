package academy.devdojo.maratonajava.introducao;

public class Aula06EstruturasDeRepetição02 {
    public static void main(String[] args) {
        // Mostrar numeros pares de 0 a 1 milhão.
        for (int i = 1; i <= 1000000; i++) {
            if (i % 2 == 0) {
                System.out.println(i);
            }
        }
    }
}
