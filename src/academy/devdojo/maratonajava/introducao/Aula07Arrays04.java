package academy.devdojo.maratonajava.introducao;

public class Aula07Arrays04 {
    public static void main(String[] args) {
        int[] numeros = new int[3];
        int[] numeros2 = {1, 2, 3, 4, 5};
        int[] numeros3 = new int[]{1, 2, 3, 4, 5};

        // Esse for serve para buscar indices especificos da array.
        for (int i = 0; i < numeros2.length; i++){
            System.out.println(numeros2[i]);
        }

        // Esse for é melhor para mostrar todos os itens da array de uma só vez
        for (int num:numeros3) {
            System.out.println(num);
        }
    }
}
