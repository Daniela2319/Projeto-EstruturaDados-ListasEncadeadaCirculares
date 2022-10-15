package ProjetoCircularesEncadeada;

/**
 * Classe No
 * Implementada para fazer os encadeamentos.
 * @param <T> tipo Generica
 */

public class No<T> {

    // Atributos privados
    private T conteudo;
    private No<T> noProximo;

    // Construtor
    public No(T conteudo) {
        this.noProximo = null;
        this.conteudo = conteudo;
    }

    // Getter e Setter
    public T getConteudo() {
        return conteudo;
    }

    public void setConteudo(T conteudo) {
        this.conteudo = conteudo;
    }

    public No<T> getNoProximo() {
        return noProximo;
    }

    public void setNoProximo(No<T> noProximo) {
        this.noProximo = noProximo;
    }

    /**
     * Método ToString
     * Representação do contéudo quando for imprimir.
     * @return contéudo
     */
    @Override
    public String toString() {
        return "No{" +
                "conteudo=" + conteudo +
                '}';
    }
}
