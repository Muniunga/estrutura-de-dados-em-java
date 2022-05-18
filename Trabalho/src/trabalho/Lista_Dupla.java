/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package trabalho;

/**
 *
 * @author Muniunga
 */
public class Lista_Dupla {

    No primeiro;
    No ultimo;
    int tamanho;

    public Lista_Dupla() {

        tamanho = 0;

    }

    public void Inserir_no_inicio(Caminhao caminhao) {

        No node = new No(caminhao);
        node.caminhao = caminhao;
        node.anterior = null;
        node.proximo = primeiro;

        if (primeiro != null) {
            primeiro.anterior = node;
        }
        primeiro = node;
        if (tamanho == 0) {
            ultimo = primeiro;
        }
        tamanho++;

    }

    public void Inserir_no_ultimo(Caminhao caminhao) {
        No node = new No(caminhao);
        node.caminhao = caminhao;
        node.proximo = null;
        node.anterior = ultimo;
        if (ultimo != null) {
            ultimo.proximo = node;
        }
        ultimo = primeiro;
        if (tamanho == 0) {
            primeiro = ultimo;
        }
        tamanho++;
    }

    public void Inserir_no_meio(int pos, Caminhao caminhao) {
        if (pos <= 0) {
            Inserir_no_inicio(caminhao);
        } else if (pos >= tamanho) {
            Inserir_no_ultimo(caminhao);
        } else {
            No local = primeiro;

            for (int i = 0; i < pos - 1; i++) {
                local = local.proximo;
            }
            No node = new No(caminhao);
            node.caminhao = caminhao;
            node.anterior = local;
            node.proximo = local.proximo;
            local.proximo = node;
            node.proximo.anterior = node;
            tamanho++;
        }
    }

    public Caminhao Remover_no_meio(int pos) {
        if (pos < 0 || pos >= tamanho || primeiro == null) {
            return null;
        } else if (pos == 0) {
            return Remover_no_principio();
        } else if (pos == tamanho - 1) {
            return Remover_no_ultimo();
        }
        No local = primeiro;
        for (int i = 0; i < tamanho; i++) {
            local = local.proximo;
        }
        if (local.anterior != null) {
            local.anterior.proximo = local.proximo;
        }
        if (local.proximo != null) {
            local.proximo.anterior = local.anterior;
        }
        tamanho--;

        return local.caminhao;
    }

    public String toString() {

        String str = "(" + "Tamanho da Lista: " + tamanho + "):    \n\n";
        No local = primeiro;

        for (int i = 0; i < tamanho; i++) {
            str += " \n |-----------------------------------------------------------------|";
            str += " \n | MARCA DO CAMINHÃO:" + local.caminhao.getMarca() + "";
            str += " \n | MODELO  DO CAMINHÃO:" + local.caminhao.getModelo() + "";
            str += " \n | VALOR DO CAMINHÃO:" + local.caminhao.getValor() + "";
            str += " \n | NOME DO CLIENTE:" + local.caminhao.getCliente() + "";
            str += " \n |-----------------------------------------------------------------|\n";

            local = local.proximo;
        }
        return str;
    }

    public void Menu() {
        System.out.println("XXXXXXXXXXXXXXXXXXXXXXXXXXXX     SEJA BEM-VINDO     XXXXXXXXXXXXXXXXXXXXXXXXXXXXX");
        System.out.println("X             (1) - ADICIONAR O PRIMEIRO CAMINHÃO NA LISTA.                         X");
        System.out.println("X             (2) - ADICIONAR O ULTIMO CAMINHAO NA LISTA.                           X");
        System.out.println("X             (3) - ADICIONAR O CAMINHÃO NO MEIO DA LISTA.                          X");
        System.out.println("X             (4) - MOSTRAR TODOS OS CAMINHÕES CADASTRADOS.                             X");
        System.out.println("X             (5) - REMOVER O PRIMEIRO CAMINHÃO DA LISTA.                           X");
        System.out.println("X             (6) - REMOVER O CAMINHÃO EM UMA DETERMINADA POSIÇÃO DA LISTA.         X");
        System.out.println("X             (7) - REMOVER O ULTIMO CAMINHÃO DA LISTA.                             X");
        System.out.println("X             (8) - SAIR.                                                       X");

    }

    public Caminhao Remover_no_principio() {

        Caminhao caminhao = this.primeiro.caminhao;

        if (this.primeiro.proximo == null) {

            this.primeiro = null;
            this.ultimo = null;

        } else {

            this.primeiro = this.primeiro.proximo;
            this.primeiro.anterior = null;

        }

        tamanho -= 1;
        return caminhao;

    }

    public Caminhao Remover_no_ultimo() {

        Caminhao caminhao = this.ultimo.caminhao;

        if (this.primeiro.proximo == null) {

            this.primeiro = null;
            this.ultimo = null;

        } else {

            this.ultimo = ultimo.proximo;
            ultimo.anterior = ultimo;
            this.ultimo = null;

        }

        tamanho -= 1;
        return caminhao;

    }

    public Caminhao remove_na_posicao(int posicao) {

        if (posicao < 0 || posicao >= tamanho) {
            throw new IndexOutOfBoundsException();
        }

        if (posicao == 0) {
            return Remover_no_principio();
        }

        if (posicao == tamanho - 1) {
            return Remover_no_ultimo();
        }

        No auxiliar = this.primeiro;

        for (int i = 0; i < posicao; i++) {

            auxiliar = auxiliar.proximo;
            auxiliar.anterior.proximo = auxiliar.proximo;
            auxiliar.proximo.anterior = auxiliar.anterior;

        }
        tamanho -= 1;

        return auxiliar.caminhao;

    }

}
