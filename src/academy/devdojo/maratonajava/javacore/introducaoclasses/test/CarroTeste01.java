package academy.devdojo.maratonajava.javacore.introducaoclasses.test;

import academy.devdojo.maratonajava.javacore.introducaoclasses.domain.Carro;

public class CarroTeste01 {
    static void main(String[] args) {
        Carro carro = new Carro();
        Carro carro2 = new Carro();

        carro.nome = "Range Rover";
        carro.modelo = "Evoque";
        carro.ano = 2020;

        carro2.nome = "Chevrolet";
        carro2.modelo = "Camaro";
        carro2.ano = 2024;

        System.out.println("Carro 1");
        System.out.println(carro.nome);
        System.out.println(carro.modelo);
        System.out.println(carro.ano);

        System.out.println("\nCarro 2");
        System.out.println(carro2.nome);
        System.out.println(carro2.modelo);
        System.out.println(carro2.ano);
    }
}
