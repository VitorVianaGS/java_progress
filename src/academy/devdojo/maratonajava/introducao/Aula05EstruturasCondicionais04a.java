package academy.devdojo.maratonajava.introducao;

public class Aula05EstruturasCondicionais04a {
    public static void main(String[] args) {
        double anualsalary = 70000;
        double firsttax = 9.70 / 100;
        double secondtax = 37.35 / 100;
        double thirdtax = 49.50 / 100;
        double taxamount;

        if (anualsalary <= 34712) {
            taxamount = anualsalary * firsttax;
        }else if(anualsalary <= 68507) {
            taxamount = anualsalary * secondtax;
        }else{
            taxamount = anualsalary * thirdtax;
        }
        System.out.println("O imposto em cima do salário de " + anualsalary + " é de " + taxamount);

    }
}
