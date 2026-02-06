package academy.devdojo.maratonajava.introducao;

public class Aula08ArraysMultidimensionais03 {
    static void main() {
        int[][] arrayInt = new int[3][];
        int[] array = {1,2,3,4,5,6};

        arrayInt[0] = new int[2];           //método 1
        arrayInt[1] = new int[]{1,2,3};     //método 2
        arrayInt[2] = array;                //método 3

        int[][] arrayInt2 = {{0,0},{1,2,3},{1,2,3,4,5,6}}; //método 4

        for (int[] arrayBase: arrayInt){
            System.out.println("\n-------------");
            for (int num: arrayBase){
                System.out.print(num + " ");
            }
        }

        System.out.println("\n******************");

        for (int[] arrayBase: arrayInt2){
            System.out.println("\n-------------");
            for (int num: arrayBase){
                System.out.print(num + " ");
            }
        }
    }
}
