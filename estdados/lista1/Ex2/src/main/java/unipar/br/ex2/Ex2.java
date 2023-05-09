 package unipar.br.ex2;

import javax.swing.JOptionPane;

public class Ex2 {
//Crie uma classe que tenha um vetor de inteiros de 20 posições, e solicite ao
//usuário informar um valor, depois mostre o valor informado e sua posição;

    public static void main(String[] args) {
        
        int vetor[] = new int[20];
        
        for(int i=0;i<vetor.length;i++){
         String input = JOptionPane.showInputDialog("Informe um Numero");
         int numero = Integer.parseInt(input);
            
         vetor[i] = numero;
         
        }
        
        
        String message = "Os Numeros informados são \n";
        for(int i=0;i<vetor.length;i++){
            message += i + "° " +vetor[i] + "\n";
            
            
        }
        JOptionPane.showMessageDialog(null, message);
        
        
    }
}
