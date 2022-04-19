/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package trabalholistas;

/**
 *
 * @author Muniunga
 */
public class ListaDinamica {

    Lista Primeiro;
    Lista Ultimo;
    int Tamanho = 0;

    public ListaDinamica() {
        Primeiro = null;
        Ultimo = Primeiro;
    }

    //Metodo adicionar
    public void add(String Nome) {
        if (Primeiro == null) {
            Primeiro = new Lista();
            Ultimo = Primeiro;
            Lista Novo = new Lista();
            Novo.setNome(Nome);
            Novo.setProx(null);
            Ultimo.setProx(Novo);
            Ultimo = Novo;
            Tamanho++;
        } else {
            Lista Novo = new Lista();
            Novo.setNome(Nome);
            Novo.setProx(null);
            Ultimo.setProx(Novo);
            Ultimo = Novo;
            Tamanho++;
        }
    }

    //Metodo imprimir todos elementos da lista
    public void imprimeLista() {
        Lista Percorre = Primeiro.getProx();
        while (Percorre != null) {
            System.err.println(Percorre.getNome());
            Percorre = Percorre.getProx();

        }
    }

    //Metodo remover
    public void removeItem(String NomeParaRemover) {
        Lista Remove = Primeiro.getProx();
        Lista Vigia = Primeiro;
        if (!(Primeiro == null)) {

            while (Remove != null) {
                if (Remove.getNome().equals(NomeParaRemover)) {
                    if (Remove.getProx() == (null)) {
                        Ultimo = Vigia;
                        Ultimo.setProx(null);
                        Remove = null;
                        Tamanho--;
                        break;
                    } else {
                        Vigia.setProx(Remove.getProx());
                        Remove.setProx(null);
                        Remove = null;
                        Tamanho--;
                        break;
                    }
                }
                Remove = Remove.getProx();
                Vigia = Vigia.getProx();
            }
            //Garbage colector (Elimina variaveis nulas)
            System.gc();
        }
    }
}
