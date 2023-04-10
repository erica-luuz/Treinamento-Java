package variaveis2;

public class TestandoCondicionais{
    public static void main(String[] args) {
        System.out.println("Testando Condicionais") ;
        int idade = 20;
        int quantidadePessoa = 3;
        boolean acompanhado = quantidadePessoa >= 2;

        System.out.println("Valor de acompanhado é: " + acompanhado);

        if (idade >= 18 && acompanhado){
            System.out.println("Você pode entrar na festa");
        }else {
            System.out.println("Você não pode entrar na festa");
        }
    }
}
//para usar ou ||
// para usar e &&