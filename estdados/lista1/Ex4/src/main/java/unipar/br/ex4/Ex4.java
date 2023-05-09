
package unipar.br.ex4;

import javax.swing.JOptionPane;


public class Ex4 {

    public static void main(String[] args) {
        String vetor[] = new String [10];
        
        for(int i=0;i<vetor.length;i++){
           String input = JOptionPane.showInputDialog("Informe um Nome");
           
           vetor[i] = input;
        }
        String message = "Estes foram os nomes informados: " + "\n";
        
        for(int i=0;i<vetor.length;i++){
            
            message += vetor[i] + "\n";
        }
        JOptionPane.showMessageDialog(null, message);
    }
}
