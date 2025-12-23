package academy.devdojo.maratonajava.introducao;

public class Aula05EstruturasCondicionais01 {
    public static void main(String[] args) {
        int idade = 15;
        boolean isAutorizadoComprarBebida = idade >= 18;

        if (isAutorizadoComprarBebida) {
            System.out.println("Autorizado a comprar bebida alcolica!");
        }
        // ! negação seria o mesmo de == false.
        if (!isAutorizadoComprarBebida) {
            System.out.println("Não autorizado a comprar bebida!");
        }
        // quando for usar uma estrutura condicional if, é obrigatório usar uma expressão que retorne true ou false.
        // if (idade); vai dar erro

        boolean c = false;
        if (c == true) {
            System.out.println("Algo que nunca deve ser feito");
        }
    }
}
