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


    // Construtor
    public ListasCirculares() {
        this.cabeca = null;
        this.cauda = null;
        this.tamanhoLista = 0;
    }

    /**
     * Método add (adiciona) o nó na lista.
     * @param conteudo
     */
    public void add(T conteudo){
        No<T> novoNo = new No<>(conteudo); //declara novoNo
        if (this.tamanhoLista == 0){       // testa se a lista está vazia
            this.cabeca = novoNo;         // cabeça recebe novoNo
            this.cauda = this.cabeca;      // cauda recebe cabeça como referência
            this.cabeca.setNoProximo(cauda); // set aqui cabeça ser referência de proximo nó para a cauda
        }else {
            novoNo.setNoProximo(this.cauda); // se não novoNo da set proximo nó cauda, novoNo está atras da cauda
            this.cabeca.setNoProximo(novoNo); // agora cabeça aponta novoNo é atual cauda
            this.cauda = novoNo;              // referência de cauda da lista circular agora é novoNo
        }
        this.tamanhoLista++;
    }

    /**
     * Método Remove
     * @param index
     */
    public void remove(int index){
        if(index >= this.tamanhoLista) //testa se índice é maior que o tamanho da lista
            throw new IndexOutOfBoundsException("O índice é maior que o tamanho da lista"); // Caso for maior solta exception
        No<T> noAuxiliar = this.cauda; // caso contrario usar a lógica de remoção do nó da lista
        if (index == 0){               //testa se nó para remove a propria cauda
            this.cauda = this.cauda.getNoProximo(); // se índice for igual a zero pega nó da cauda e adiciona no proximo nó da cauda
            this.cabeca.setNoProximo(this.cauda);  // como ainda a nossa cabeça está com referência da antiga cauda, set para cauda atual
        } else if (index == 1) {                  // se não tiver no índice zero, teste índice um
            this.cauda.setNoProximo(this.cauda.getNoProximo().getNoProximo()); // remove o índice um, fazendo cauda índice zero pula para cauda indice 2

        }else{                                   // se índice não for zero e nem um,
            for (int i = 0; i < index-1; i++){  // utilizar for para correr esta lista até encontra esse índice.
                noAuxiliar = noAuxiliar.getNoProximo(); // encontra o nó será removido
            }
            noAuxiliar.setNoProximo(noAuxiliar.getNoProximo().getNoProximo()); // excluir nó índice 1, correndo no índice anterior , fazendo referência para proximo índice.
        }
        this.tamanhoLista--;


    }


    /**
     * Método get
     * seleciona o índice escolhido do elemento
     * @param index
     * @return contéudo
     */

 public T get (int index){
     return this.getNo(index).getConteudo();
 }

    /**
     * Método getNo
     * esse método para fazer testa se a lista está vazia, indice igual a zero
     * e loop infinito que circula na lista.
      * @param index recebe indíce
     * @return noAuxiliar
     * @throws IndexOutOfBoundsException
     */

private No<T> getNo(int index){
    if (this.isEmpty()) // testa se a lista está vazia
        throw new IndexOutOfBoundsException("A lista está vazia");
    if (index == 0){ // caso a lista não esteja vazia
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

    /**
     * Método toString
     * Tamanho da lista
     * @return
     */
    @Override
    public String toString() {
       String strRetorno = " "; // declara uma variável começa vazia

       No<T> noAuxiliar = this.cauda; // declara um nó noAuxiliar vai receber a cauda, noAuxilia vai entrar pela cauda.
       for (int i = 0; i < this.size(); i++){ //for para correr a lista
           strRetorno += "[No{conteudo=" + noAuxiliar.getConteudo() + "}]---->";
           noAuxiliar = noAuxiliar.getNoProximo();
       }
       strRetorno += this.size() != 0 ? "(Retorna ao inicio)" : "[]"; // Se caso a lista tiver vazia

        return strRetorno; // variável retorna
    }
}
