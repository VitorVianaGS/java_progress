package academy.devdojo.maratonajava.introducao;

public class Aula05EstruturasCondicionais03 {
    public static void main(String[] args) {
        double salario = 6000;
        String mensagemDoar = "Eu vou doar 500R$ para o Vitor";
        String mensagemNaoDoar = "Eu ainda não tenho condições, mas vou ter!";
        // Operador ternário sintaxe: (condição) ? verdadeiro : falso;
        String resultado = salario > 5000 ? mensagemDoar : mensagemNaoDoar;

        if (salario > 5000) {
            resultado = mensagemDoar;
        }else{
            resultado = mensagemNaoDoar;
        }
        System.out.println(resultado);
    }
}
