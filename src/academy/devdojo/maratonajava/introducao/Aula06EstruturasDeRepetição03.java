package academy.devdojo.maratonajava.introducao;

public class Aula06EstruturasDeRepetição03 {
    public static void main(String[] args) {
        // Imprimir numeros de 0 a 50 porém, dando Break no 25.
        byte i = 0;
        while (i <= 50){
            if (i > 25) {
                break;
            }
            System.out.println("i = "+ i++);
        }
    }
}
