package estruturadedadoslineares;

import Lista.Lista;
import Lista.Nodo;

public class Filas extends Lista {

    public boolean filaVazia() {
        return elementos.isEmpty();
    }

    public int enqueue(Nodo n) {
        if (super.insert(tamanho, n) == 0) {
            return 0;
        } 
        else {
            return 1;
        }
    }

    public Nodo dequeue() {
        if (filaVazia()) {
            System.out.println("\n\tNenhum elemento foi inserido ainda.");
            return null;
        }
    
        if (super.get(0) != null) {
            super.delete(0);
        } 
        else {
            return null;
        }
        return null;
    }

    public int tamFila() {
        return super.length();
    }
}
/*

Filas
• int enqueue(Nodo n): insere um novo elemento na fila, retornando 0 em caso de erro, 1
se OK.
• int dequeue(): retira um elemento da fila, retornando null em caso de erro e o Nodo se
OK


 */
