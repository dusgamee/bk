
package unipar.br.banco;

import javax.swing.JOptionPane;
import unipar.br.banco.model.Agencia;
import unipar.br.banco.model.Banco;
import unipar.br.banco.model.Conta;
import unipar.br.banco.model.Endereco;

public class Main {

    public static void main(String[] args) {
        
        Endereco endereco = new Endereco();
        
        String input = JOptionPane.showInputDialog("Informe o nome da rua");
        endereco.setNmRua(input);
        
        input = JOptionPane.showInputDialog("Digite o complemento do endereco");
        endereco.setDsComplemento(input);
        
        input = JOptionPane.showInputDialog("Informe o nome da cidade");
        endereco.setNmCidade(input);
        
        input = JOptionPane.showInputDialog("Informe o numero da casa");
        endereco.setNrCasas(Integer.parseInt(input));
        
        input = JOptionPane.showInputDialog("Informe o estado");
        endereco.setSgUf(input);
        
        Conta conta = new Conta();
        
        conta.setCpfCorrentista("12121212121");
        conta.setEndereco(endereco);
        conta.setNrConta(69696969);
        conta.setTpConta("Conta_Corrente");
        
        Agencia agencia = new Agencia();
        
        agencia.setNomeAgencia("puta q pariu");
        agencia.setContaCorrente(conta);
        agencia.setNrAgencia(66666);
        
        Banco banco = new Banco();
        
        banco.setAgencia(agencia);
        banco.setNmBanco("Sicredi");
        banco.setNrBanco(99999);
        
        System.out.println(banco.toString());
        System.out.println(conta.toString());
        System.out.println(agencia.toString());
        System.out.println(endereco.toString());
        
        
    }
}
