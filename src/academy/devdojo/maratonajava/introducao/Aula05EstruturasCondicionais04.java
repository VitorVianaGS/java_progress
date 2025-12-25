package academy.devdojo.maratonajava.introducao;

public class Aula05EstruturasCondicionais04 {
    public static void main(String[] args){
        double salary = 78.000;
        if (salary <= 34.712){
            salary = salary * (9.70 / 100);
            System.out.printf("Porcentagem de Imposto (9.7): R$ %.3f%n", salary);
        }else if (salary > 34.712 && salary <= 68.507){
            salary = salary * (37.35 / 100);
            System.out.printf("Porcentagem de Imposto (37.35): R$ %.3f%n", salary);
        }else{
            salary = salary * (49.5 / 100);
            System.out.printf("Porcentagem de Imposto (49.5): R$ %.3f%n", salary);
        }

    }
}
