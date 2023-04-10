package testeConversao;

public class Conversao {
    public static void main(String[] args) {
        double salario = 2700.50;
        int valor = (int) salario;
        System.out.println(valor);

        int valor2 = 20000000;
        long numeroGrande = 123456789123456L;
        short numeroPequeno = 2103;
        byte bite = 127; //o máximo valor de um byte é 127
        float pontoFlutuante = 3.14F;

        System.out.println(valor2);
        System.out.println(numeroGrande);
        System.out.println(numeroPequeno);
        System.out.println(bite);
        System.out.println(pontoFlutuante);

    }
}
