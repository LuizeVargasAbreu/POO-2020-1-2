package Lista;

import java.util.ArrayList;

public class Lista {

    protected int tamanho = 0;
    protected ArrayList<Nodo> elementos = new ArrayList<>();

    protected int insert(int posicao, Nodo n) {
        elementos.add(posicao, n);
        tamanho++;

        if (elementos.size() >= 0) {
            System.out.println("\n\tElemento inserido com sucesso.\n");
            return 1;
        } 
        else {
            System.out.println("\n\tErro! Nenhum elemento foi inserido.\n");
            return 0;
        }
    }

    protected Nodo get(int posicao) {
        return elementos.get(posicao);
    }

    protected int delete(int posicao) {
        elementos.remove(posicao);
        tamanho--;

        if (elementos.size() == tamanho) {
            System.out.println("\n\tElemento removido com sucesso.\n");
            return 1;
        }
        else {
            System.out.println("\n\tErro! Nenhum elemento foi removido.\n");
            return 0;
        }
    }

    public int length() {
        return elementos.size();
    }

    public void print() {
        if (elementos.isEmpty()) {
            System.out.println("\n\tNao ha nenhum elemento inserido.\n");
        } 
        else {
            System.out.println("\n\t----- Imprimindo todos os elementos -----\n");
            elementos.forEach((n) -> {
                System.out.println("\n\tNome: " + n.getNome()
                                 + "\n\tIdade: " + n.getIdade()
                                 + "\n\tAltura: " + n.getAltura());
            });
        }
    }

}
/*
CLASSE LISTA:

• int insert(int posicao, Nodo n): insere um novo elemento na posicao apropriada e retorna
0 em caso de erro, 1 se OK.
• Nodo get(int posicao): retorna o Nodo para o elemento da lista de ordem posicao (ou
NULL);
• int delete(int posicao): apaga elemento em posicao, retornando 0 em caso de erro e 1 se
OK;
• int length(): retorna o comprimento da lista;
Os métodos insert e get da Lista devem ser usados pelas subclasses para a implementação de seus
métodos. Atenção: as subclasses não podem permitir o acesso aos métodos insert, delete e get da
superclasse Lista!
Além disso, a classe Lista possui dois atributos: int tamanho e Vector elementos, que contém o
tamanho da lista e um vetor com os seus nodos, respectivamente. Esses atributos devem ser usados
nas subclasses.
 */
