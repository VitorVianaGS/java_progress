package academy.devdojo.maratonajava.javacore.introducaoclasses.test;

import academy.devdojo.maratonajava.javacore.introducaoclasses.domain.Professor;

public class ProfessorTeste01 {
    static void main() {
        Professor professor = new Professor();
        professor.nome = "Mestre Kami";
        professor.sexo = 'M';
        professor.idade = 140;

        System.out.println("Nome: " + professor.nome + " Sexo: " + professor.sexo + " Idade: " + professor.idade);
    }
}
