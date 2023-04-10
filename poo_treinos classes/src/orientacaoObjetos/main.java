package orientacaoObjetos;

public class main {
    public static void main(String[] args) {
        Livro livro = new Livro();

        livro.nome = "A menina que roubava livros";
        livro.descricao = "Livro sobre uma judia que rouba livros na época do hiltler";
        livro.isbn = "987654321";
        livro.preco = 50.00;
        livro.autor = "Markus Zusak";
        livro.dataPub = "20/04/2014";

        livro.dadosLivro();

    }

}
