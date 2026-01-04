package academy.devdojo.maratonajava.introducao;

public class Aula06EstruturasDeRepetição04 {
    // Dado o valor de um carro, descubra em quantas vezes ele pode ser parcelado
    // Condição valorParcela >= 1000
    public static void main(String[] args) {
        double qtdParcelas = 0;
        double valorParcela = 5000;
        double valorCarro = 38000;
        double iterador = 0;
        while (valorParcela < valorCarro) {
            if (valorParcela < 1000) {
                System.out.println("Não é aceito um valor abaixo de R$ 1000,00 por parcela");
                break;
            } else if (iterador < valorCarro) {
                qtdParcelas++;
                iterador += valorParcela;
            } else {
                System.out.printf("A quantidade de parcelas permitida no valor de R$" + valorCarro +" é de " + qtdParcelas);
                break;
            }
        }
    }
}
