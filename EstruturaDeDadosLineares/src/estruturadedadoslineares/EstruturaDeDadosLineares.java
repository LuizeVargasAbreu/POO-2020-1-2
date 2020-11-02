package estruturadedadoslineares;

import Lista.Nodo;
import java.util.Scanner;

/**
 * @author Luize Vargas Abreu
 */
public class EstruturaDeDadosLineares {

    public static void main(String[] args) {

        Scanner e = new Scanner(System.in);
        Filas f = new Filas();
        Pilhas p = new Pilhas();

        int op, op1;

        do {                                                                        //INÍCIO DO-WHILE PARA O MENU DE ED
            System.out.print("\t----- Menu de Estrutura de Dados -----\n"
                    + "\t1 - Testar Fila\n"
                    + "\t2 - Testar Pilha\n"
                    + "\t3 - Sair\n"
                    + "\tDigite a opcao desejada: ");
            op = e.nextInt();

            switch (op) {                                                           //CASES DE OPCOES DO MENU DAS ED'S
                case 1:                                                             //INÍCIO OPCAO FILA
                    do {                                                            //INÍCIO DO-WHILE PARA FILA                
                        System.out.print("\n\t----- Menuzinho da Fila -----\n"
                                + "\t1 - Adicionar um elemento na fila\n"
                                + "\t2 - Remover um elemento da fila\n"
                                + "\t3 - Imprimir fila\n"
                                + "\t4 - Mostrar tamanho da fila\n"
                                + "\t5 - Voltar ao menu principal\n"
                                + "\tDigite o opcao desejada: ");
                        op1 = e.nextInt();

                        switch (op1) {                                              //CASES DE OPCOES DA FILA
                            case 1:                     
                                //ADICIONANDO ELEMENTOS NA FILA
                                System.out.print("\n\tNome: ");
                                String nome = e.next();
                                System.out.print("\tIdade: ");
                                int idade = e.nextInt();
                                System.out.print("\tAltura: ");
                                float altura = e.nextFloat();

                                f.enqueue(new Nodo(nome, idade, altura));
                                break;

                            case 2:
                                //REMOVENDO ELEMENTOS DA FILA
                                f.dequeue();
                                break;

                            case 3:
                                //IMPRIMINDO ELEMENTOS DA FILA
                                f.print();
                                break;

                            case 4:
                                //IMPRIMINDO O TAMANHO DA FILA
                                System.out.println("\n\tTamanho da fila: " + f.tamFila() + "\n");
                                break;

                            case 5:
                                //VOLTANDO PRO MENU PRINCIPAL
                                System.out.println("\n\tVoltando ao Menu Principal.\n");
                                break;

                            default:
                                //OPCAO INVALIDA CASO O USUARIO DIGITE UM NUMERO MENOR QUE 1 E MAIOR QUE 5
                                System.out.println("\n\tOpcao invalida! Tente novamente.\n");
                                break;
                        }

                    } while (op1 != 5);                                             //FIM DO-WHILE DA FILA
                    break;                                                          //FIM OPCAO FILA

                case 2:                                                             //INÍCIO OPCAO PILHA
                    do {                                                            //INÍCIO DO-WHILE DA PILHA        
                        System.out.print("\n\t----- Menuzinho da Pilha -----\n"
                                + "\t1 - Adicionar um elemento na pilha\n"
                                + "\t2 - Remover um elemento da pilha\n"
                                + "\t3 - Imprimir pilha\n"
                                + "\t4 - Mostrar tamanho da pilha\n"
                                + "\t5 - Voltar ao menu principal\n"
                                + "\tDigite o opcao desejada: ");
                        op1 = e.nextInt();

                        switch (op1) {                                              //CASES DE OPCOES DA PILHA
                            case 1:
                                //ADICIONANDO ELEMENTOS NA PILHA
                                System.out.print("\n\tNome: ");
                                String nome = e.next();
                                System.out.print("\tIdade: ");
                                int idade = e.nextInt();
                                System.out.print("\tAltura: ");
                                float altura = e.nextFloat();

                                p.push(new Nodo(nome, idade, altura));
                                break;

                            case 2:
                                //REMOVENDO ELEMENTOS DA PILHA
                                p.pop();
                                break;

                            case 3:
                                //IMPRIMINDO ELEMENTOS DA PILHA
                                p.print();
                                break;

                            case 4:
                                //IMPRIMINDO TAMANHO DA PILHA
                                System.out.println("\n\tTamanho da pilha: " + p.tamPilha() + "\n");
                                break;

                            case 5:
                                //VOLTANDO PRO MENU PRINCIPAL
                                System.out.println("\n\tVoltando ao Menu Principal.\n");
                                break;

                            default:
                                //OPCAO INVALIDA CASO O USUARIO DIGITE UM NUMERO MENOR QUE 1 E MAIOR QUE 5
                                System.out.println("\n\tOpcao invalida! Tente novamente.\n");
                                break;
                        }

                    } while (op1 != 5);                                             //FIM DO-WHILE DA PILHA
                    break;                                                          //FIM OPCAO PILHA

                case 3:
                    //ENCERRANDO O PROGRAMA
                    System.out.println("\n\tSaindooo...\n");
                    break;

                default:
                    //OPCAO INVALIDA CASO O USUARIO DIGITE UM NUMERO MENOR QUE 1 E MAIOR QUE 3
                    System.out.println("\n\tOpcao invalida! Tente novamente.\n");
                    break;
            }

        } while (op != 3);                                                          //FIM DO-WHILE PARA O MENU DE ED

    }

}
