package unipar.br.ex3;

import javax.swing.JOptionPane;

public class Ex3 {
//Crie uma classe que tenha um vetor de inteiros de 30 posições e
//mostre a soma total dos elementos;-

    public static void main(String[] args) {
        int vetor[] = new int[30];
        
        for(int i=0;i<vetor.length;i++){
            String input = JOptionPane.showInputDialog("Informe um numero");
            vetor[i] = Integer.parseInt(input);
            
            
       }
        int soma = 0;
        String message = "Os Numeros informados e suas respectivas somas sao \n";
        for(int i=0;i<vetor.length;i++){
            soma += vetor[i];
            
            
            message += vetor[i] + "\n";
        }
        JOptionPane.showMessageDialog(null, message + "total : " + soma);
        
    }
}
