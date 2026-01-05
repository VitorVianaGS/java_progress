package academy.devdojo.maratonajava.introducao;

public class Aula07Arrays03 {
    public static void main(String[] args) {
        String[] nomes = new String[4];
        nomes[0] = "Goku";
        nomes[1] = "Kurosaki";
        nomes[2] = "Luffy";
        nomes[3] = "Hinata";

        // Todo array tem uma propriedade dentro dele que diz o seu tamanho.

        for (int i = 0; i < nomes.length; i++) {
            System.out.println(nomes[i]);
        }
        // Criando essa nova linha abaixo, perde-se a referencia de nomes criada a cima
        // e passa a valer o novo espaço em memória criado.
        nomes = new String[5];
    }
}
