package academy.devdojo.maratonajava.javacore.Bintroducaometodos.dominio;

public class Funcionario {
        public String nome;
        public int idade;
        public int salario;

        public void imprimeFuncionario(){
            System.out.println("----------");

            System.out.println(this.nome);
            System.out.println(this.idade);
            System.out.println(this.salario);
        }
}
