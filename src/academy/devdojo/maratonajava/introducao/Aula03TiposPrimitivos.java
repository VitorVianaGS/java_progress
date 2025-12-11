package academy.devdojo.maratonajava.introducao;
/*
Pratic

Create variables for the fields bellow between <>
and print the next mensage:

Me <name>, living at the address <address> confirm
to received the salary about <salary>, in date <date>.
*/
public class Aula03TiposPrimitivos {
    static void main() {
        String name = "Vitor";
        String address = "Av. Paulista, 123, Centro, São Paulo";
        double salary = 40000;
        String salaryReceivementDate = "10/01/2026";
        String relatory = "Me "+name+" living at the address "+address+" confirm to received the salary about "+salary+", in date "+salaryReceivementDate;
        System.out.println(relatory);
    }
}
