package unipar.br.mavenproject1;

import javax.swing.JOptionPane;

public class Ex5 {

    public static void main(String[] args) {
        int vetor[] = new int[10];
        
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
