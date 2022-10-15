package ProjetoCircularesEncadeada;

/**
 * Classe Lista Circulares Encadeada
 * Implemetação dos métodos : adicionar(add), remover, get, isEmpty e size.
 * @param <T> tipo Generica
 */


public class ListasCirculares<T> {

    // Atributos
    private No<T> cabeca;
    private No<T> cauda;
    private int tamanhoLista;


    /**
     * Método get
     * @param index
     * @return contéudo
     */

 public T get (int index){
     return this.getNo(index).getConteudo();
 }

    /**
     * Método getNo
     * esse método para fazer teste se a lista está vazia, indice igual a zero
     * e loop infinito que circula na lista.
      * @param index recebe indíce
     * @return noAuxiliar
     * @throws IndexOutOfBoundsException
     */

private No<T> getNo(int index){
    if (this.isEmpty()) // teste se a lista está vazia
        throw new IndexOutOfBoundsException("A lista está vazia");
    if (index == 0){ // caso a lista não tiver vazia
        return this.cauda; // se indice passar a zero retorna cauda
    }
    No<T> noAuxiliar = this.cauda; // Instanciar noAuxiliar receber a cauda
    for(int i = 0; i < index; i++){ // for para correr lista
        noAuxiliar = noAuxiliar.getNoProximo(); // circula a lista loop infinito
    }
    return noAuxiliar;
}



    /**
     * Método isEmpty
     * Verifica se a lista esta vazia ou não.
     * @return tamanho da lista
     */
    public boolean isEmpty(){
        return this.tamanhoLista == 0 ? true : false;
    }

    /**
     * Método size
     * esse método não precisa estar contado quanto itens tem na lista.
     * @return tamanho da lista
     */
    public int size(){
        return this.tamanhoLista;
    }
}
