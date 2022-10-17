package ProjetoCircularesEncadeada;

/**
 * Classe Principal
 * Todos os métodos foram implementados na lista circular e No;
 * agora são utilizados na classe principal.
 */

public class Main {

    public static void main(String[] args) {

        ListasCirculares<String> minhalistaCircular = new ListasCirculares<>();

// adicionado nó da lista
        minhalistaCircular.add("d0");
        System.out.println(minhalistaCircular);

// Removendo o nó da lista.
        minhalistaCircular.remove(0);
        System.out.println(minhalistaCircular);

// adicionar mais elementos
        minhalistaCircular.add("d1");
        minhalistaCircular.add("d2");
        minhalistaCircular.add("d3");
        System.out.println(minhalistaCircular);

// seleciona elemento no índice
        System.out.println(minhalistaCircular.get(0));
        System.out.println(minhalistaCircular.get(1));
        System.out.println(minhalistaCircular.get(2));
        System.out.println(minhalistaCircular.get(3)); // retorna inicio da lista
        System.out.println(minhalistaCircular.get(4));


    }
}
