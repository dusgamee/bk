/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Project/Maven2/JavaApp/src/main/java/${packagePath}/${mainClassName}.java to edit this template
 */

package unipar.br.ex6;

import javax.swing.JOptionPane;

/**
 *
 * @author user
 */
public class Ex6 {

    public static void main(String[] args) {
        int vetor[] = new int[10];
        String message = "numeros informados informados : \n";
        for(int i=0;i<vetor.length;i++){
            String input = JOptionPane.showInputDialog("informe um numero");
            vetor[i] = Integer.parseInt(input);
            
        }
        
        for(int i=0;i<vetor.length;i++){
            if((vetor[i] % 2) == 0){
                message += vetor[i];
            }else{
                
            }
        }
        System.out.println(message);
    }
}
