package variaveis2;

public class TestandoVariaveis {
    public static void main(String[] args) {
        System.out.println("Testando Condicionais") ;
        int idade = 15;
        int quantidadePessoa = 3;
        if (idade >= 18){
            System.out.println("Você te mais que 18 anos");
            System.out.println("Você pode entrar na festa");
        } else {
            if (quantidadePessoa >= 2) {
                System.out.println("Ok, você é menor de idade mas pode entrar, pois esta acompanhada(o)");

            }else {
                System.out.println("Você tem menos de 18 anos, você não pode entrar na festa, pois não está acompanhado");
            }
        }
    }
}
