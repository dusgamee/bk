package unipar.br.ex1;

import javax.swing.JOptionPane;

public class Ex1 {
//Crie um classe com um vetor de inteiros de 10 posições e solicite ao usuário 
//para inserir os elementos do vetor, mostre os elementos no final;

    public static void main(String[] args) {
        
        int vetor[] = new int[10];
        
        for(int i = 0;i<vetor.length;i++){
            String input = JOptionPane.showInputDialog(null,
                    "Informe um numero");
            int numero = Integer.parseInt(input);
            
            vetor[i] = numero;
        }
        
        String message = "Os numeros informados sao \n";
        for(int i=0;i<vetor.length;i++){
            message = message + vetor[i] + "\n";
        }
        JOptionPane.showMessageDialog(null, message);
    }
}
