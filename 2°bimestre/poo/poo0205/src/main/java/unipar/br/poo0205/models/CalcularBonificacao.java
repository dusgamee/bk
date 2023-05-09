
package unipar.br.poo0205.models;

public class CalcularBonificacao {
    
    public void calcularBonus(Colaborador c) {
        if(c instanceof Diretor){
            double vlBonus = c.getSalario() * 1.5;
        }else if(c instanceof Gerente){
            double vlBonus = c.getSalario() * 1.1;
        }
    }
}
