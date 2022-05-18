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
public class No {
    
    
    No proximo;
    No anterior;
    Caminhao caminhao;
   
    
    
    public No(Caminhao caminhao){
        
        
        this.caminhao = caminhao;
        this.proximo = null;
        this.anterior = null;
        
    }

    class caminhao {

        public caminhao() {
        }
    }

   
      
}


