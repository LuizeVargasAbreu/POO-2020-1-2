package estruturadedadoslineares;

import Lista.Lista;
import Lista.Nodo;

public class Pilhas extends Lista{
    
    public boolean pilhaVazia(){        
        return elementos.isEmpty();
    }
    
    public int push(Nodo n){      
        if(super.insert(tamanho, n) == 0){
            return 0;
        }
        else{
            return 1;
        }
    }
    
    public Nodo pop(){
        if(pilhaVazia()){
            System.out.println("\n\tNenhum elemento foi inserido ainda.");
            return null;
        }
 
        if(super.get(tamanho - 1) != null){
          super.delete(tamanho - 1);
        }
        else{
            pilhaVazia();
            return null;
        }
        return null;
    }
    
    public int tamPilha(){
        return super.length();
    }
}

/*

Pilhas
• int push(Nodo n): insere um novo elemento na pilha, retornando 0 em caso de erro, 1 se
OK.
• Nodo pop(): retira um elemento da pilha, retornando null em caso de erro e o Nodo se
OK;


*/