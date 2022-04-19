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
public class TrabalhoListas {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        ListaDinamica Teste = new ListaDinamica();
        Teste.add("Aderito");
        Teste.add("Aderito2");
        Teste.add("Aderito3");
        Teste.add("Aderito4");
        Teste.add("Aderito5");
        Teste.imprimeLista();
        
        Teste.removeItem("Aderito3");
        Teste.imprimeLista();
       
        Teste.removeItem("Aderito5");
        Teste.imprimeLista();
        
        System.out.println(Teste.Tamanho);
    }
    
}
