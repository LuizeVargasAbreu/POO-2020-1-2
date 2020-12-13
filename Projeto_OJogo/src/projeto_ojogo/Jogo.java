package projeto_ojogo;

/*
 *  Autora: Luize Vargas Abreu
 *  Matrícula: 18200653
 *  Disciplina: Programacao Orientada a Objetos
 *  Turma: M53
 *  Professores: Felipe S Marques e Paulo R F Junior
 *  Curso: Ciencia da Computacao
 */

import humano.Arqueiro;
import humano.Humano;
import humano.Robo;
import humano.Soldado;
import java.util.ArrayList;
import java.util.Random;
import orc.Demonio;
import orc.Mago;
import orc.Ogro;
import orc.Orc;

public class Jogo {

    public static void main(String[] args) {

        ArrayList<Humano> humano = new ArrayList();
        ArrayList<Orc> orc = new ArrayList();
        Random gerador = new Random();

        Jogo.sortearHumanosOrcs(gerador, humano, orc);
        Jogo.batalha(humano, orc);
        
    }

    public static void sortearHumanosOrcs(Random gerador, ArrayList<Humano> humano, ArrayList<Orc> orc) {
        System.out.println("\n\t---------- PERSONAGENS QUE IRÃO BATALHAR ----------\n");

        for (int i = 0; i < 100; i++) {

            int humanoSorteado = gerador.nextInt(3);
            int orcSorteado = gerador.nextInt(3);

            //SWITCH DO SORTEIO DOS HUMANOS
            switch (humanoSorteado) {
                case 0:
                    humano.add(new Arqueiro());
                    break;

                case 1:
                    humano.add(new Robo());
                    break;

                case 2:
                    humano.add(new Soldado());
                    break;
            }
            //SWITCH DO SORTEIO DOS ORCS
            switch (orcSorteado) {
                case 0:
                    orc.add(new Demonio());
                    break;

                case 1:
                    orc.add(new Mago());
                    break;

                case 2:
                    orc.add(new Ogro());
                    break;
            }

            System.out.println(humano.get(i).imprimirNome() + "\t\tX\t" + orc.get(i).imprimirNome());
        }
    }

    public static void batalha(ArrayList<Humano> humano, ArrayList<Orc> orc) {
        Random gerador = new Random();
        int vitoriaHumano = 0, vitoriaOrc = 0, diferenca, vidasHumanos = 0, vidasOrcs = 0;

        if (humano.isEmpty() && orc.isEmpty()) {
            System.out.println("\n\tNão sorteastes nenhum personagem ainda. Sorteie antes de batalhar.\n");
        } else {

            for (int i = 0; i < 100; i++) {
                int poderes = gerador.nextInt(3);
                //System.out.println("\n\tPoder sorteado: " + poderes);
                System.out.println("\n\t==================== Batalha " + (i + 1) + " ====================");
                System.out.println(humano.get(i).imprimirNome() + "\t\tX" + orc.get(i).imprimirNome());

                switch (poderes) {
                    case 0://INTELIGENCIA X FORCA
                        if (humano.get(i).getInteligencia() > orc.get(i).getForca()) {
                            System.out.println("\tInteligência: " + humano.get(i).getInteligencia() + "\t\tX\tForça: " + orc.get(i).getForca());

                            diferenca = humano.get(i).getInteligencia() - orc.get(i).getForca();
                            ((Personagem) humano.get(i)).setVida(humano.get(i).ganharVida(diferenca));
                            ((Personagem) orc.get(i)).setVida(orc.get(i).perderVida(diferenca));

                            System.out.println("\tVida: " + (((Personagem) humano.get(i)).getVida()) + "\t\tX\tVida: " + ((Personagem) orc.get(i)).getVida());
                            System.out.println("\n\t-----" + humano.get(i).imprimirNome() + " venceu essa partida! -----\n");
                            vitoriaHumano++;

                        } else if (orc.get(i).getForca() > humano.get(i).getInteligencia()) {
                            System.out.println("\tInteligência: " + humano.get(i).getInteligencia() + "\t\tX\tForça: " + orc.get(i).getForca());

                            diferenca = orc.get(i).getForca() - humano.get(i).getInteligencia();
                            ((Personagem) orc.get(i)).setVida(orc.get(i).ganharVida(diferenca));
                            ((Personagem) humano.get(i)).setVida(humano.get(i).perderVida(diferenca));

                            System.out.println("\tVida: " + (((Personagem) humano.get(i)).getVida()) + "\t\tX\tVida:" + ((Personagem) orc.get(i)).getVida());
                            System.out.println("\n\t-----" + orc.get(i).imprimirNome() + " venceu essa partida! -----\n");
                            vitoriaOrc++;

                        } else {
                            System.out.println("\tInteligência: " + humano.get(i).getInteligencia() + "\t\tX\tForça: " + orc.get(i).getForca());
                            System.out.println("\tVida: " + (((Personagem) humano.get(i)).getVida()) + "\t\tX\tVida: " + ((Personagem) orc.get(i)).getVida());
                            System.out.println("\n\t\t----- EMPATE -----\n");
                        }
                        break;

                    case 1://VELOCIDADE X HABILIDADE                                                                     //case do segundo poder
                        if (humano.get(i).getVelocidade() > orc.get(i).getHabilidade()) {
                            System.out.println("\tVelocidade: " + humano.get(i).getVelocidade() + "\t\tX\tHabilidade: " + orc.get(i).getHabilidade());

                            diferenca = humano.get(i).getVelocidade() - orc.get(i).getHabilidade();
                            ((Personagem) humano.get(i)).setVida(humano.get(i).ganharVida(diferenca));
                            ((Personagem) orc.get(i)).setVida(orc.get(i).perderVida(diferenca));

                            System.out.println("\tVida: " + (((Personagem) humano.get(i)).getVida()) + "\t\tX\tVida: " + ((Personagem) orc.get(i)).getVida());
                            System.out.println("\n\t-----" + humano.get(i).imprimirNome() + " venceu essa partida! -----\n");
                            vitoriaHumano++;

                        } else if (orc.get(i).getHabilidade() > humano.get(i).getVelocidade()) {
                            System.out.println("\tVelocidade: " + humano.get(i).getVelocidade() + "\t\tX\tHabilidade: " + orc.get(i).getHabilidade());

                            diferenca = orc.get(i).getHabilidade() - humano.get(i).getVelocidade();
                            ((Personagem) orc.get(i)).setVida(orc.get(i).ganharVida(diferenca));
                            ((Personagem) humano.get(i)).setVida(humano.get(i).perderVida(diferenca));

                            System.out.println("\tVida: " + (((Personagem) humano.get(i)).getVida()) + "\t\tX\tVida: " + ((Personagem) orc.get(i)).getVida());
                            System.out.println("\n\t-----" + orc.get(i).imprimirNome() + " venceu essa partida! -----\n");
                            vitoriaOrc++;

                        } else {
                            System.out.println("\tVelocidade: " + humano.get(i).getVelocidade() + "\t\tX\tHabilidade: " + orc.get(i).getHabilidade());
                            System.out.println("\tVida: " + (((Personagem) humano.get(i)).getVida()) + "\t\tX\tVida: " + ((Personagem) orc.get(i)).getVida());
                            System.out.println("\n\t\t----- EMPATE -----\n");
                        }
                        break;

                    case 2://EQUIPAMENTOS X AGILIDADE
                        if (humano.get(i).getEquipamentos() > orc.get(i).getAgilidade()) {
                            System.out.println("\tEquipamentos: " + humano.get(i).getEquipamentos() + "\t\tX\tAgilidade: " + orc.get(i).getAgilidade());

                            diferenca = humano.get(i).getEquipamentos() - orc.get(i).getAgilidade();
                            ((Personagem) humano.get(i)).setVida(humano.get(i).ganharVida(diferenca));
                            ((Personagem) orc.get(i)).setVida(orc.get(i).perderVida(diferenca));

                            System.out.println("\tVida: " + (((Personagem) humano.get(i)).getVida()) + "\t\tX\tVida: " + ((Personagem) orc.get(i)).getVida());
                            System.out.println("\n\t-----" + humano.get(i).imprimirNome() + " venceu essa partida! -----\n");
                            vitoriaHumano++;

                        } else if (orc.get(i).getAgilidade() > humano.get(i).getEquipamentos()) {
                            System.out.println("\tEquipamentos: " + humano.get(i).getEquipamentos() + "\t\tX\tAgilidade: " + orc.get(i).getAgilidade());

                            diferenca = orc.get(i).getAgilidade() - humano.get(i).getEquipamentos();
                            ((Personagem) orc.get(i)).setVida(orc.get(i).ganharVida(diferenca));
                            ((Personagem) humano.get(i)).setVida(humano.get(i).perderVida(diferenca));

                            System.out.println("\tVida: " + (((Personagem) humano.get(i)).getVida()) + "\t\tX\tVida:" + ((Personagem) orc.get(i)).getVida());
                            System.out.println("\n\t-----" + orc.get(i).imprimirNome() + " venceu essa partida! -----\n");
                            vitoriaOrc++;

                        } else {
                            System.out.println("\tEquipamentos: " + humano.get(i).getEquipamentos() + "\t\tX\tAgilidade: " + orc.get(i).getAgilidade());
                            System.out.println("\tVida: " + (((Personagem) humano.get(i)).getVida()) + "\t\tX\tVida: " + ((Personagem) orc.get(i)).getVida());
                            System.out.println("\n\t\t----- EMPATE -----\n");
                        }
                        break;
                }

            }

            for (int i = 0; i < 100; i++) {
                vidasHumanos += ((Personagem) humano.get(i)).getVida();
                vidasOrcs += ((Personagem) orc.get(i)).getVida();
            }

            System.out.print("\n\tTotal de vidas dos HUMANOS: " + vidasHumanos);
            System.out.println("\n\tTotal de vidas dos ORCS: " + vidasOrcs);

            if (vitoriaHumano > vitoriaOrc) {
                System.out.println("\n\t=============== Vitória do povo HUMANO! ===============\n");
            } else if (vitoriaOrc > vitoriaHumano) {
                System.out.println("\n\t=============== Vitória do povo ORC! ===============\n");
            } else {
                System.out.println("\n\t---------- Eitaaa, houve um EMPATE."
                        + "\n\tPara DESEMPATAR usaremos o CRITÉRIO DE VIDAS."
                        + "\n\tO POVO que tiver MAIS vidas GANHA. ----------\n");

                if (vidasHumanos > vidasOrcs) {
                    System.out.println("\n\t=============== Os HUMANOS ganharam! ===============\n");
                } else {
                    System.out.println("\n\t=============== Os ORCS ganharam! ===============\n");
                }
            }
        }

    }
}
