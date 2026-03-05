package academy.devdojo.maratonajava.javacore.Bintroducaometodos.test;

import academy.devdojo.maratonajava.javacore.Bintroducaometodos.dominio.Funcionario;

public class FuncionarioTest01 {
    static void main() {

        Funcionario funcionario01 = new Funcionario();
        Funcionario funcionario02 = new Funcionario();
        Funcionario funcionario03 = new Funcionario();

        funcionario01.nome = "Joao";
        funcionario01.idade = 2000;
        funcionario01.salario = 25;

        funcionario02.nome = "Maria";
        funcionario02.idade = 30;
        funcionario02.salario = 2600;

        funcionario03.nome = "ana";
        funcionario03.idade = 38;
        funcionario03.salario = 7000;

    }
}
