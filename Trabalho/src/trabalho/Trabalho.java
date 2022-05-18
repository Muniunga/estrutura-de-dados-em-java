/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package trabalho;

import java.util.Scanner;

/**
 *
 * @author Muniunga
 */
public class Trabalho {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        Scanner teclado = new Scanner(System.in);
        Lista_Dupla x = new Lista_Dupla();

        int opcao = 0;

        do {
            x.Menu();
            System.out.println("Selecione umas das opções...");
            opcao = teclado.nextInt();

            switch (opcao) {
                case 1: {

                    System.out.println("Introduza a marca do caminhão:");
                    String marca_caminhao = teclado.next();

                    System.out.println("Introduza o modelo do caminhão:");
                    String modelo_caminhao = teclado.next();

                    System.out.println("Introduza o valor do caminhão:");
                    float valor = teclado.nextFloat();

                    System.out.println("Introduza o nome do cliente");
                    String cliente = teclado.next();

                    Caminhao obj = new Caminhao(marca_caminhao, modelo_caminhao, valor, cliente);

                    x.Inserir_no_inicio(obj);

                    System.out.println("\n\n---------------------------------------");
                    System.out.println("      Operação concluida com sucesso!       ");
                    System.out.println("--------------------------------------------");

                    break;
                }
                case 2: {

                    System.out.println("Introduza a marca do caminhão:");
                    String marca_caminhao = teclado.next();

                    System.out.println("Introduza o modelo do caminhão:");
                    String modelo_caminhao = teclado.next();

                    System.out.println("Introduza o valor do caminhão:");
                    float valor = teclado.nextFloat();

                    System.out.println("Introduza o nome do cliente");
                    String cliente = teclado.next();

                    Caminhao obj = new Caminhao(marca_caminhao, modelo_caminhao, valor, cliente);

                    x.Inserir_no_ultimo(obj);
                    System.out.println("\n\n---------------------------------------");
                    System.out.println("      Operação concluida com sucesso!       ");
                    System.out.println("--------------------------------------------");

                    break;

                }
                case 3: {
                    System.out.println("Introduza a marca do Caminhao:");
                    String marca_caminhao = teclado.next();

                    System.out.println("Introduza o modelo de Caminhao:");
                    String modelo_Caminhao = teclado.next();

                    System.out.println("Introduza o valor do Caminhao:");
                    float valor = teclado.nextFloat();

                    System.out.println("Introduza o nome do cliente");
                    String cliente = teclado.next();

                    Caminhao obj = new Caminhao(marca_caminhao, modelo_Caminhao, valor, cliente);

                    x.Inserir_no_meio(1, obj);
                    System.out.println("\n\n---------------------------------------");
                    System.out.println("      Operação concluida com sucesso!       ");
                    System.out.println("--------------------------------------------");

                }
                case 4: {

                    if (x.tamanho == 0) {
                        System.out.println("--------------------------         ATENÇÃO!       ----------------------------");
                        System.out.println(" 1) - Atualmente a lista encontra-se vazia!");
                    } else {

                        System.out.println(x.toString());

                    }

                    break;

                }
                case 5: {

                    x.Remover_no_principio();

                    break;

                }
                case 6: {

                    System.out.println("Introduza a posiçao que deseja eliminar, nota que a primeira posição é Zero");
                    int posicao = teclado.nextInt();

                    x.remove_na_posicao(posicao);
                    System.out.println("--------------------------         ATENÇÃO!       ----------------------------");
                    System.out.println(" 1) - O camião foi removido com sucesso!");

                    if (x.tamanho == 0) {

                        System.out.println("2) - A sua lista agora encontrar-se vazia");
                    }

                    System.out.println(".------------------------------------------------------------------------------");

                    break;

                }
                case 7: {

                    x.Remover_no_ultimo();

                    break;

                }

                default:
                    System.out.println("\n ***   Volte sempre!   ***");

            }

        } while (opcao != 8);

        teclado.close();

    }

}
